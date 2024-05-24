package com.Cocacola.pricemanagementapi.Repository;

import com.Cocacola.pricemanagementapi.Entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductRepository extends JpaRepository<Product,Long > {

}
