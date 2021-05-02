package com.henriquemoreira.domain.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.henriquemoreira.domain.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long>{

}
