package com.Cocacola.pricemanagementapi.Repository;


import com.Cocacola.pricemanagementapi.Entities.PromotionRegions;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PromotionRegionsRepository extends JpaRepository<PromotionRegions, Integer> {
}
