 package com.Cocacola.pricemanagementapi.config;
/*
import com.Cocacola.pricemanagementapi.Entities.Level;
import com.Cocacola.pricemanagementapi.Entities.Region;
import com.Cocacola.pricemanagementapi.Repository.LevelRepository;
import com.Cocacola.pricemanagementapi.Repository.RegionRepository;
import jakarta.transaction.Transactional;
import java.util.Arrays;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Instantiation implements CommandLineRunner {
    @Autowired
    private LevelRepository levelRepository;
    @Autowired
    private RegionRepository regionRepository;

    public Instantiation() {
    }

    @Transactional
    public void run(String... args) throws Exception {
        this.levelRepository.resetSequence();
        this.regionRepository.resetSequence();
        if (this.levelRepository.count() == 0L) {
            Level level = new Level((Long)null, "Bronze");
            Level level2 = new Level((Long)null, "Prata");
            Level level3 = new Level((Long)null, "Ouro");
            this.levelRepository.saveAll(Arrays.asList(level, level2, level3));
        }

        if (this.regionRepository.count() == 0L) {
            Region region = new Region((Long)null, "Norte");
            Region region2 = new Region((Long)null, "Nordeste");
            Region region3 = new Region((Long)null, "Centro-Oeste");
            Region region4 = new Region((Long)null, "Sudeste");
            Region region5 = new Region((Long)null, "Sul");
            this.regionRepository.saveAll(Arrays.asList(region, region2, region3, region4, region5));
        }

    }
}
*/