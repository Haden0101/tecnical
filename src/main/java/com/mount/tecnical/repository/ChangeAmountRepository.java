package com.mount.tecnical.repository;

import org.springframework.data.r2dbc.repository.Query;
import org.springframework.data.repository.reactive.ReactiveCrudRepository;
import org.springframework.stereotype.Repository;

import com.mount.tecnical.domain.ChangeAmount;
import com.mount.tecnical.dto.ChangeAmountRequestDTO;

import reactor.core.publisher.Mono;

@Repository
public interface ChangeAmountRepository extends ReactiveCrudRepository<ChangeAmount, Long>{
    
    @Query("SELECT * FROM change_amount_request_dto " +
           "WHERE original_currency = :originalCurrency " +
           "AND target_currency = :targetCurrency")
    Mono<ChangeAmountRequestDTO> findByOriginalCurrencyAndTargetCurrency(String originalCurrency, String targetCurrency);

}
