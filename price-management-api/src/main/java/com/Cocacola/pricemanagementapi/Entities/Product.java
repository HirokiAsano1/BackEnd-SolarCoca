package com.Cocacola.pricemanagementapi.Entities;

import jakarta.persistence.*;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;



@Entity
@Table(name ="tb_product")

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    private String category;

    private Integer quantity_ml;

    private Long stock_quantity;

    private Long stock_Max;

    private double price;

    @ManyToOne
    @JoinColumn(name = "region_id")
    private Region region;


}