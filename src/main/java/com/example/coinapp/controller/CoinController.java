package com.example.coinapp.controller;

import com.example.coinapp.service.CoinService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/coins")
public class CoinController {
    @Autowired
    private CoinService coinService;

    @GetMapping
    public String getCoinData(@RequestParam String symbols) {
        return coinService.getCoinData(symbols);
    }
}
