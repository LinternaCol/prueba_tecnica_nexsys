package com.prueba.nexsys.controller;


import com.prueba.nexsys.model.dto.CategoriesAnswerDto;
import com.prueba.nexsys.service.CategoriesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/nexsys/v1/")
public class CategriesController {

    @Autowired
    CategoriesService categoriesService;


    /**
     * Servicio para traer todas las categorias
     * @return Lista de categorias
     */
    @GetMapping("categories/")
    public List<CategoriesAnswerDto> getAllCategories(){
        return categoriesService.getAllCategories();
    }
}
