package com.prueba.nexsys.model.dto;



import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;
import lombok.NoArgsConstructor;

@JsonIgnoreProperties(ignoreUnknown = true)
@Data
@NoArgsConstructor
public class ProductsAnswerSaveDto {

    private int pid;

    public ProductsAnswerSaveDto(int pid) {
        this.pid = pid;
    }
}
