package com.mount.tecnical.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mount.tecnical.domain.TypeCurrency;
import com.mount.tecnical.repository.TypeCurrencyRepository;

import jakarta.persistence.EntityNotFoundException;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Service
public class TypeCurrencyService {
    
    @Autowired
    TypeCurrencyRepository typeCurrencyRepository;

    // Crear un nuevo registro de tipo de cambio
    public Mono<TypeCurrency> createTypeCurrency(TypeCurrency typeCurrency) {
        return Mono.just(typeCurrencyRepository.save(typeCurrency));
    }

    // Actualizar un registro de tipo de cambio existente
    public Mono<TypeCurrency> updateTypeCurrency(Long id, TypeCurrency typeCurrency) {
    return Mono.fromCallable(() -> {
        // Verifica si el registro existe y lanza una excepción si no se encuentra
        TypeCurrency existingTypeCurrency = typeCurrencyRepository.findById(id)
                .orElseThrow(() -> new EntityNotFoundException("TypeCurrency with id " + id + " not found"));

        // Actualiza los campos del registro existente
        existingTypeCurrency.setTypeCurr(typeCurrency.getTypeCurr());
        existingTypeCurrency.setMountCurr(typeCurrency.getMountCurr());

        // Guarda los cambios y devuelve el registro actualizado
        return typeCurrencyRepository.save(existingTypeCurrency);
    });
}


    // Obtener todos los tipos de cambio
    public Flux<TypeCurrency> getAllTypeCurrencies() {
        return Flux.fromIterable(typeCurrencyRepository.findAll());
    }

}
