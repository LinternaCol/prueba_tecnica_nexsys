package com.prueba.nexsys.model.dto;


import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;
import lombok.NoArgsConstructor;


/**
 * Esta es una clase Dto
 *
 * @author juan_suarez
 * @version 1.0
 */
@JsonIgnoreProperties(ignoreUnknown = true)
@Data
@NoArgsConstructor
public class CategoriesRequestDto {

    private int id;

    private String name;

    public CategoriesRequestDto(int id, String name) {
        this.id = id;
        this.name = name;
    }




}
