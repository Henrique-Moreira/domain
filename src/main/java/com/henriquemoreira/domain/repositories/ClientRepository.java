package com.henriquemoreira.domain.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.henriquemoreira.domain.entities.Client;

public interface ClientRepository extends JpaRepository<Client, Long>{

}
