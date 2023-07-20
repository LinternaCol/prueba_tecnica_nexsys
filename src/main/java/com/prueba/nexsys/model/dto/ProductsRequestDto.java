package com.prueba.nexsys.model.dto;


import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.NoArgsConstructor;

@JsonIgnoreProperties(ignoreUnknown = true)
@Data
@NoArgsConstructor
public class ProductsRequestDto {

    private int id;

    private String title;

    private Double price;

    private  String description;

    public ProductsRequestDto( int id, String title, Double price, String description) {
        this.id = id;
        this.title = title;
        this.price = price;
        this.description=description;
    }




}
