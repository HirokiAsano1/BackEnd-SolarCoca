package com.Cocacola.pricemanagementapi.config;
import com.Cocacola.pricemanagementapi.Services.PromotionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class PromotionInitializer implements CommandLineRunner {

    @Autowired
    private PromotionService promotionService;

    @Override
    public void run(String... args) throws Exception {
        promotionService.generatePromotions();
    }
}
