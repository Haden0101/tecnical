package com.mount.tecnical.dto;

import org.springframework.data.annotation.Id;

import lombok.Data;

@Data
public class ChangeAmountRequestDTO {
    
    @Id
    private Long id;

    //monto
    private Double amount;

    //moneda origen
    private String originalCurrency;

    //moneda destino
    private String targetCurrency;

    //devolver el “monto
    private Double convertedAmount;

}
