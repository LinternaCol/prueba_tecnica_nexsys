package com.prueba.nexsys.service;

import com.prueba.nexsys.model.dto.CategoriesAnswerDto;

import java.util.List;
/**
 * Esta es una clase Service  para maenejo de las categorias
 *
 * @author juan_suarez
 * @version 1.0
 */
public interface CategoriesService {

    /**
     * Metodo para traer todas las categorias
     * @return Lista de categorias
     */
    List<CategoriesAnswerDto> getAllCategories();
}
