package com.Cocacola.pricemanagementapi.Services;



import com.Cocacola.pricemanagementapi.Entities.*;
import com.Cocacola.pricemanagementapi.Repository.ProductRepository;
import com.Cocacola.pricemanagementapi.Repository.PromotionRegionsRepository;
import com.Cocacola.pricemanagementapi.Repository.RegionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class PromotionsRegionsService {
    @Autowired
    private PromotionRegionsRepository promotionRegionsRepository;

    @Autowired
    private ProductRepository productRepository;

    @Autowired
    private RegionRepository regionRepository;

    public List<PromotionRegions> getRegionsPromotions(){
        return promotionRegionsRepository.findAll();
    }

    @Transactional
    public void generateRegionsPrices() {
        List<Product> products = productRepository.findAll();
        List<Region> regions = regionRepository.findAll();

        for (Product product : products) {
            for (Region region : regions) {

                double promotionalPriceR = calculatePromotionalRegionPrice(product, region);

                PromotionRegions promotion = new PromotionRegions();
                promotion.setProduct(product);
                promotion.setRegion(region);
                promotion.setRegionPrice(promotionalPriceR);

                promotionRegionsRepository.save(promotion);
            }
        }
    }

    private double calculatePromotionalRegionPrice(Product product, Region region) {

       if(region.getName().equals("Norte")){
           return product.getPrice()*0.9;

       }
       else if(region.getName().equals("Nordeste")){
           return product.getPrice()*0.8;
       }
       else if(region.getName().equals("Centro-Oeste")){
           return product.getPrice()*0.7;
       }
       else if(region.getName().equals("Sudeste")){
           return product.getPrice()*0.6;
       }
       else if(region.getName().equals("Sul")){
           return product.getPrice()*0.5;
       }

        return product.getPrice() ;
    }
}
