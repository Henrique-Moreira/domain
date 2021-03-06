package com.henriquemoreira.domain.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.henriquemoreira.domain.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long>{

}
