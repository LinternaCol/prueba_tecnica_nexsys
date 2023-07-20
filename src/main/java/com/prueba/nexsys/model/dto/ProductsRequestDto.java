package com.prueba.nexsys.model.dto;


import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

/**
 * Esta es una clase Dto
 *
 * @author juan_suarez
 * @version 1.0
 */
@JsonIgnoreProperties(ignoreUnknown = true)
@Data
@NoArgsConstructor
public class ProductsRequestDto {

    private int id;

    private String title;

    private Double price;

    private  String description;

    private int categoryId;

    List<String> images;

    public ProductsRequestDto( int id, String title, Double price, String description) {
        this.id = id;
        this.title = title;
        this.price = price;
        this.description=description;
    }

    public ProductsRequestDto(String title, Double price, String description, int categoryId, List<String> images) {
        this.title = title;
        this.price = price;
        this.description = description;
        this.categoryId = categoryId;
        this.images = images;
    }
}
