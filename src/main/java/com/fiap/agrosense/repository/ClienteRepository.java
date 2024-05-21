package com.fiap.agrosense.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.fiap.agrosense.model.Cliente;

@Repository
public interface ClienteRepository extends JpaRepository<Cliente, Long> {

}
