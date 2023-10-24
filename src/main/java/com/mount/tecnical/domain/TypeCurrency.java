package com.mount.tecnical.domain;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

@Data
@Entity
public class TypeCurrency {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    //ref. nombre del tipo - prefijo
    private String typeCurr;

    //ref. monto del tipo
    private Double mountCurr;

}
