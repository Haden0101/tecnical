package com.mount.tecnical.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mount.tecnical.domain.ChangeAmount;
import com.mount.tecnical.service.ChangeAmountService;

@RestController
@RequestMapping("/tecnical")
public class ChangeAmountController {
    
    @Autowired
    ChangeAmountService changeAmountService;

    @PostMapping("/aplicar")
    public Double aplicarTipoCambio(@RequestBody ChangeAmount request) {
        return changeAmountService.changeAmount(request.getAmount(), request.getOriginalCurrency(), request.getTargetCurrency());
    }

}

