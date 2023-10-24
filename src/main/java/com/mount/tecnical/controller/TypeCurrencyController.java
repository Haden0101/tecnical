package com.mount.tecnical.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mount.tecnical.domain.TypeCurrency;
import com.mount.tecnical.service.TypeCurrencyService;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping("/type-currency")
public class TypeCurrencyController {

    @Autowired
    TypeCurrencyService typeCurrencyService;

    @PostMapping("/create")
    public Mono<TypeCurrency> createTypeCurrency(@RequestBody TypeCurrency typeCurrency) {
        return typeCurrencyService.createTypeCurrency(typeCurrency);
    }

    @PutMapping("/update/{id}")
    public Mono<TypeCurrency> updateTypeCurrency(@PathVariable Long id, @RequestBody TypeCurrency typeCurrency) {
        return typeCurrencyService.updateTypeCurrency(id, typeCurrency);
    }
    
    @GetMapping("/find")
    public Flux<TypeCurrency> getAllTypeCurrencies() {
        return typeCurrencyService.getAllTypeCurrencies();
    }

}
