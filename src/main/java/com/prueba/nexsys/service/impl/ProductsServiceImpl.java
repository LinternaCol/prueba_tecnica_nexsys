package com.prueba.nexsys.service.impl;

import com.prueba.nexsys.model.dto.ProductsAnswerDto;
import com.prueba.nexsys.model.dto.ProductsRequestDto;
import com.prueba.nexsys.service.ProductsService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

@Service
public class ProductsServiceImpl implements ProductsService {

    @Value("${allowed.platzi}")
    private String getRoutePlatzi;

    private static final Logger LOGGER = LoggerFactory.getLogger(ProductsServiceImpl.class);


    /**
     * Metodo para traer todos los productos
     * @return Lista de productos
     */
    @Override
    public List<ProductsAnswerDto> getAllProducts() {
        List<ProductsAnswerDto> productsAnswerDtos = Collections.emptyList();

        try {
            RestTemplate restTemplate = new RestTemplate();
            String productsUrl = getRoutePlatzi + "products";
            List<ProductsRequestDto> products;
            products = Arrays.asList(restTemplate.getForObject(productsUrl, ProductsRequestDto[].class));
            productsAnswerDtos = mapToProductsAnswerDtos(products);
        } catch (Exception e) {
            String error = "Ocurrió un fallo trayendo los productos: " + e.getMessage();
            LOGGER.error(error);
        }

        return productsAnswerDtos;
    }


    /**
     * Metodo para tranformacion de ProductsRequestDto a ProductsAnswerDto
     * @param products Lista de productos a tranformar
     * @return lista de productos tranformados
     */
    private List<ProductsAnswerDto> mapToProductsAnswerDtos(List<ProductsRequestDto> products) {
        return products.stream()
                .map(productsRequestDto -> new ProductsAnswerDto(
                        productsRequestDto.getId(), productsRequestDto.getTitle(),
                        productsRequestDto.getPrice(), productsRequestDto.getDescription()))
                .toList();
    }

}
