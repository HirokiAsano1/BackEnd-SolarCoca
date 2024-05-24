package com.Cocacola.pricemanagementapi.Controller;


import com.Cocacola.pricemanagementapi.Entities.Product;
import com.Cocacola.pricemanagementapi.Services.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


import java.util.List;

@CrossOrigin("*")
@RestController
@RequestMapping("/Products")
public class ProductController {

    @Autowired
    private ProductService productService;

    @GetMapping
    public List<Product> getProducts()
    {
        return productService.getProducts();
    }

    @GetMapping("/{id}")
    public Product getProductById(@PathVariable long id)
    {
        return productService.getProduct(id);
    }

    @PostMapping("/add")
    public ResponseEntity<String> addProduct(@RequestBody Product product)
    {
        productService.addProduct(product);
        return ResponseEntity.ok("Product with ID " + product.getId() + "successfully added.");
    }

    @PutMapping("/update/{id}")
    public Product updateProduct(@PathVariable long id, @RequestBody Product product)
    {
        return productService.updateProduct(id, product);
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<String> deleteProduct(@PathVariable long id)
    {
        productService.deleteProduct(id);
        return ResponseEntity.ok("Product with ID " + id + "successfully deleted.");
    }


}