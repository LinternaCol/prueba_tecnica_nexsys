package com.prueba.nexsys.service.impl;

import com.prueba.nexsys.model.dto.CategoriesAnswerDto;
import com.prueba.nexsys.model.dto.CategoriesRequestDto;
import com.prueba.nexsys.service.CategoriesService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

@Service
public class CategoriesServiceImpl implements CategoriesService {

    @Value("${allowed.platzi}")
    private String getRoutePlatzi;

    private static final Logger LOGGER = LoggerFactory.getLogger(CategoriesServiceImpl.class);


    /**
     * Metodo para traer todas las categorias
     *
     * @return Lista de categorias
     */
    @Override
    public List<CategoriesAnswerDto> getAllCategories() {
        List<CategoriesAnswerDto> productsAnswerDtos = Collections.emptyList();

        try {
            RestTemplate restTemplate = new RestTemplate();
            String productsUrl = getRoutePlatzi + "categories";
            List<CategoriesRequestDto> categories;
            categories = Arrays.asList(restTemplate.getForObject(productsUrl, CategoriesRequestDto[].class));
            productsAnswerDtos = mapToCategoriesAnswerDtos(categories);
        } catch (Exception e) {
            String error = "Ocurrió un fallo trayendo los productos: " + e.getMessage();
            LOGGER.error(error);
        }

        return productsAnswerDtos;
    }


    /**
     * Metodo para tranformacion de ProductsRequestDto a ProductsAnswerDto
     *
     * @param categories Lista de categorias a tranformar
     * @return lista de categorias tranformados
     */
    private List<CategoriesAnswerDto> mapToCategoriesAnswerDtos(List<CategoriesRequestDto> categories) {
        return categories.stream()
                .map(categoriesRequestDto -> new CategoriesAnswerDto(
                        categoriesRequestDto.getId(),
                        categoriesRequestDto.getName()
                ))
                .toList();
    }

}
