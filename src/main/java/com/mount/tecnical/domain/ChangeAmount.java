package com.mount.tecnical.domain;

import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Table;

import lombok.Data;

@Data
@Table("change-amount")
public class ChangeAmount{
    
    @Id
    private Long id;

    //Monto
    private Double amount;

    //moneda origen
    private String originalCurrency;

    //moneda destino
    private String targetCurrency;

    //devolver el “monto
    private Double convertedAmount;


}
