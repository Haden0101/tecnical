package com.mount.tecnical.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.mount.tecnical.domain.TypeCurrency;

@Repository
public interface TypeCurrencyRepository extends JpaRepository<TypeCurrency, Long>{
    
    TypeCurrency findByTypeCurr(String typeCurr);

}
