package com.prueba.nexsys.controller;

import com.prueba.nexsys.model.dto.ProductsAnswerDto;
import com.prueba.nexsys.model.dto.ProductsAnswerSaveDto;
import com.prueba.nexsys.model.dto.ProductsSaveDto;
import com.prueba.nexsys.service.ProductsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/nexsys/v1/products/")
public class ProductsController {

    @Autowired
    ProductsService productsService;

    /**
     * Servicio para traer todos los productos
     * @return Lista de productos
     */
    @GetMapping
    public List<ProductsAnswerDto> getAllProducts(){
        return productsService.getAllProducts();
    }

    @PostMapping
    public ProductsAnswerSaveDto saveProduct(@RequestBody ProductsSaveDto productsSaveDto){
        return  productsService.saveProduct(productsSaveDto);
    }
}
