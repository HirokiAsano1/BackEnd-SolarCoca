package com.Cocacola.pricemanagementapi.config;


import com.Cocacola.pricemanagementapi.Services.PromotionsRegionsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class RegionsPriceInitializer implements CommandLineRunner {

    @Autowired
    private PromotionsRegionsService promotionsRegionsService;

    @Override
    public void run(String... args) throws Exception {
        promotionsRegionsService.generateRegionsPrices();
    }
}
