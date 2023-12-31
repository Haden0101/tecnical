package com.mount.tecnical.domain;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

@Data
@Entity
public class ChangeAmount{
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
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
