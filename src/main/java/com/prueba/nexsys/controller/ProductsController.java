package com.prueba.nexsys.controller;

import com.prueba.nexsys.model.dto.ProductsAnswerDto;
import com.prueba.nexsys.service.ProductsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/nexsys/v1/")
public class ProductsController {

    @Autowired
    ProductsService productsService;

    /**
     * Servicio para traer todos los productos
     * @return Lista de productos
     */
    @GetMapping("products/")
    public List<ProductsAnswerDto> getAllProducts(){
        return productsService.getAllProducts();
    }
}
