package com.mount.tecnical.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mount.tecnical.domain.TypeCurrency;
import com.mount.tecnical.exceptions.TipoCambioNoEncontradoException;
import com.mount.tecnical.repository.ChangeAmountRepository;
import com.mount.tecnical.repository.TypeCurrencyRepository;

@Service
public class ChangeAmountService {
    
    @Autowired
    ChangeAmountRepository changeAmountRepository;

    @Autowired
    TypeCurrencyRepository typeCurrencyRepository;

    public Double changeAmount(Double amount, String originalCurrency, String targetCurrency) {
        // Busca los tipos de cambio correspondientes
        TypeCurrency originalType = typeCurrencyRepository.findByTypeCurr(originalCurrency);
        TypeCurrency targetType = typeCurrencyRepository.findByTypeCurr(targetCurrency);

        if (originalType != null && targetType != null) {
            // Realiza el cálculo del tipo de cambio
            Double tipoCambio = originalType.getMountCurr() / targetType.getMountCurr();
            return amount * tipoCambio;
        } else {
            throw new TipoCambioNoEncontradoException();
        }
    }

    

}
