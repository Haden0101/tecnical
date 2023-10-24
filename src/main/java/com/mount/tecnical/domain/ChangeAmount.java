package com.mount.tecnical.domain;

import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.Transient;
import org.springframework.data.domain.Persistable;
import org.springframework.data.relational.core.mapping.Column;
import org.springframework.data.relational.core.mapping.Table;

import lombok.Data;

@Data
@Table("change-amount")
public class ChangeAmount implements Persistable<Long>{
    
    @Id
    private Long id;

    //Monto
    @Column("amount")
    private Double amount;

    //moneda origen
    @Column("original_currency")
    private String originalCurrency;

    //moneda destino
    @Column("target_currency")
    private String targetCurrency;

    //devolver el “monto
    @Column("converted_amount")
    private Double convertedAmount;

    

    @Override
    @Transient
    public boolean isNew(){
        return id == null || id == 0;
    }

}
