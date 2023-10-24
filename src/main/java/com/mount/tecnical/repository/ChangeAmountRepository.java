package com.mount.tecnical.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.mount.tecnical.domain.ChangeAmount;


@Repository
public interface ChangeAmountRepository extends JpaRepository<ChangeAmount, Long>{
    
    ChangeAmount findByOriginalCurrencyAndTargetCurrency(String originalCurrency, String targetCurrency);

    ChangeAmount findByOriginalCurrency(String originalCurrency);
    
    ChangeAmount findByTargetCurrency(String targetCurrency);

}
