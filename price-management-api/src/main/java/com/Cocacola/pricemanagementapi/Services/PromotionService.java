package com.Cocacola.pricemanagementapi.Services;


import com.Cocacola.pricemanagementapi.Entities.Level;
import com.Cocacola.pricemanagementapi.Entities.Product;
import com.Cocacola.pricemanagementapi.Entities.Promotion;
import com.Cocacola.pricemanagementapi.Repository.LevelRepository;
import com.Cocacola.pricemanagementapi.Repository.ProductRepository;
import com.Cocacola.pricemanagementapi.Repository.PromotionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class PromotionService {

    @Autowired
    private PromotionRepository promotionRepository;

    @Autowired
    private ProductRepository productRepository;

    @Autowired
    private LevelRepository levelRepository;

    public List<Promotion> getPromotions(){
        return promotionRepository.findAll();
    }
    double promotionalPercetage = 0;

    @Transactional
    public void generatePromotions() {
        List<Product> products = productRepository.findAll();
        List<Level> levels = levelRepository.findAll();

        for (Product product : products) {
            for (Level level : levels) {

                double promotionalPrice = calculatePromotionalPrice(product, level);

                Promotion promotion = new Promotion();
                promotion.setProduct(product);
                promotion.setLevel(level);
                promotion.setPromotionalPrice(promotionalPrice);
                promotion.setPromotionalPercent(promotionalPercetage);
                promotionRepository.save(promotion);
            }
        }
    }

    @Transactional
    public void generatePromotion( Product product) {
        List<Level> levels = levelRepository.findAll();

            for (Level level : levels) {
                double promotionalPrice = calculatePromotionalPrice(product, level);

                Promotion promotion = new Promotion();
                promotion.setProduct(product);
                promotion.setLevel(level);
                promotion.setPromotionalPrice(promotionalPrice);
                promotion.setPromotionalPercent(promotionalPercetage);
                promotionRepository.save(promotion);
            }

    }


    private double calculatePromotionalPrice(Product product, Level level) {

        if (level.getId()==2)
        {
            this.promotionalPercetage = 20;
            double total = product.getPrice()*promotionalPercetage/100;
            return product.getPrice()-total;
        }

        else if (level.getId()==3){
            this.promotionalPercetage = 40;
            double total = product.getPrice()*promotionalPercetage/100;
            return product.getPrice()-total;
        }
        this.promotionalPercetage = 0;
        return product.getPrice() ;
    }
}