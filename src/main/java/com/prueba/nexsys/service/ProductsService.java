package com.prueba.nexsys.service;

import com.prueba.nexsys.model.dto.ProductsAnswerDto;
import com.prueba.nexsys.model.dto.ProductsAnswerSaveDto;
import com.prueba.nexsys.model.dto.ProductsSaveDto;

import java.util.List;
/**
 * Esta es una clase Service para maenejo de los productos
 *
 * @author juan_suarez
 * @version 1.0
 */
public interface ProductsService {

    /**
     * Metodo para traer todos los productos
     * @return Lista de productos
     */
    List<ProductsAnswerDto> getAllProducts();

    /**
     * Metodo para guardar un producto
     * @param productsSaveDto Dto que contiene la informacion necesaria para peticion
     * @return id paciente guardado
     */
    ProductsAnswerSaveDto saveProduct(ProductsSaveDto productsSaveDto);
}
