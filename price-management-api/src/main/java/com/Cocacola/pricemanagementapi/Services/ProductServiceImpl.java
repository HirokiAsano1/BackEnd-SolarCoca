package com.Cocacola.pricemanagementapi.Services;

import com.Cocacola.pricemanagementapi.Entities.Product;
import com.Cocacola.pricemanagementapi.Repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@Service
public class ProductServiceImpl implements ProductService {

    @Autowired
    private ProductRepository productRepository;

    @Autowired
    private PromotionService promotionService;
    
    @Override
    public List<Product> getProducts() {
        return productRepository.findAll();
    }

    @Override
    public Product getProduct(long id)
    {
        Product products = productRepository.findById(id).orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "Product not found"));
        return products;
    }

    @Override
    public void addProduct(Product product) {

        productRepository.save(product);
        promotionService.generatePromotion(product);

    }

    @Override
    public Product updateProduct(long id, Product product) {
        productRepository.findById(id).orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "Product not found"));
        product.setId(id);
        return productRepository.save(product);
    }

    @Override
    public void deleteProduct(long id) {
        Product products = productRepository.findById(id).orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "Invalid Product ID"));
        productRepository.delete(products);
    }
}