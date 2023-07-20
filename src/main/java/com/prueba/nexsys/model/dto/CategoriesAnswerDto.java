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
public class CategoriesAnswerDto {

    private int cid;

    private String title;

    public CategoriesAnswerDto(int cid, String title) {
        this.cid = cid;
        this.title = title;
    }


}
