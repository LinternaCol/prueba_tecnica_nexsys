package com.prueba.nexsys.service;

import com.prueba.nexsys.model.dto.CategoriesAnswerDto;

import java.util.List;

public interface CategoriesService {

    /**
     * Metodo para traer todas las categorias
     * @return Lista de categorias
     */
    List<CategoriesAnswerDto> getAllCategories();
}
