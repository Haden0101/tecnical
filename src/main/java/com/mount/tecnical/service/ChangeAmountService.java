package com.mount.tecnical.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mount.tecnical.exceptions.TipoCambioNoEncontradoException;
import com.mount.tecnical.repository.ChangeAmountRepository;

import reactor.core.publisher.Mono;

@Service
public class ChangeAmountService {
    
    @Autowired
    ChangeAmountRepository changeAmountRepository;

    public Mono<Double> changeAmount(Double amount, String originalCurrency, String targetCurrency) {

        return changeAmountRepository.findByOriginalCurrencyAndTargetCurrency(originalCurrency, targetCurrency)
            .flatMap(changeAmount -> {
                Double tipoCambio = changeAmount.getConvertedAmount();
                return Mono.just(amount * tipoCambio);
            })
            .switchIfEmpty(Mono.error(new TipoCambioNoEncontradoException()));

    }

}
