package com.Cocacola.pricemanagementapi.Repository;


import com.Cocacola.pricemanagementapi.Entities.Client;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ClientRepository extends JpaRepository <Client, Long >  {
}


