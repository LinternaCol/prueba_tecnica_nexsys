package com.prueba.nexsys.model.dto;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class ProductsSaveDto {
    private int pid;

    private String name;

    private Double priceFinal;

    private  String description;

    private int categoryId;

    private  String imageUrl;

    public ProductsSaveDto(String name, Double priceFinal, String description, int categoryId, String imageUrl) {
        this.name = name;
        this.priceFinal = priceFinal;
        this.description = description;
        this.categoryId = categoryId;
        this.imageUrl = imageUrl;
    }
}
