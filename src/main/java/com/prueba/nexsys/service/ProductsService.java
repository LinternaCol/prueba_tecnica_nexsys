package com.prueba.nexsys.service;

import com.prueba.nexsys.model.dto.ProductsAnswerDto;
import com.prueba.nexsys.model.dto.ProductsAnswerSaveDto;
import com.prueba.nexsys.model.dto.ProductsSaveDto;

import java.util.List;

public interface ProductsService {

    /**
     * Metodo para traer todos los productos
     * @return Lista de productos
     */
    List<ProductsAnswerDto> getAllProducts();

    ProductsAnswerSaveDto saveProduct(ProductsSaveDto productsSaveDto);
}
