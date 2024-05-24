package com.Cocacola.pricemanagementapi.Controller;

import com.Cocacola.pricemanagementapi.Entities.Promotion;
import com.Cocacola.pricemanagementapi.Repository.PromotionRepository;
import com.Cocacola.pricemanagementapi.Services.PromotionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import java.util.List;

@RestController
@RequestMapping("/promotions")
public class PromotionController {

    @Autowired
    private PromotionService promotionService;

    @Autowired
    private PromotionRepository promotionRepository;

    @GetMapping
    public List<Promotion> getAllPromotions() {
        return promotionService.getPromotions();
    }
    @PostMapping("/generate")
    public ResponseEntity<Void> generatePromotions() {
        promotionService.generatePromotions();
        return ResponseEntity.noContent().build();
    }
}

