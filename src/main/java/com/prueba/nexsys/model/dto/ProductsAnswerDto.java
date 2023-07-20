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
public class ProductsAnswerDto {

    private int pid;

    private String name;

    private Double priceFinal;

    private  String description;



    public ProductsAnswerDto(int pid, String name, Double priceFinal, String description) {
        this.pid = pid;
        this.name = name;
        this.priceFinal = priceFinal;
        this.description=description;
    }


}
