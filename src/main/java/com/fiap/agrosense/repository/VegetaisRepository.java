package com.fiap.agrosense.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.fiap.agrosense.model.Vegetais;

@Repository
public interface VegetaisRepository extends JpaRepository<Vegetais, Long>{

}
