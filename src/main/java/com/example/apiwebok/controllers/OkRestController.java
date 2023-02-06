package com.example.apiwebok.controllers;

import com.example.apiwebok.repositories.ProductRestRepository;
import com.google.gson.Gson;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@AllArgsConstructor
public class OkRestController {

    private final Gson gson;

    private final ProductRestRepository productRestRepository;

    @GetMapping("/getProduct")
    public String getProduct() {
        return gson.toJson(productRestRepository.getProductById(1));
    }



}
