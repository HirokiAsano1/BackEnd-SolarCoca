package com.Cocacola.pricemanagementapi.Repository;

import com.Cocacola.pricemanagementapi.Entities.Region;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface RegionRepository extends JpaRepository<Region, Long> {
   /* @Modifying
    @Query(
            value = "ALTER TABLE tb_region AUTO_INCREMENT = 1",
            nativeQuery = true
    )
    void resetSequence();
    */
}