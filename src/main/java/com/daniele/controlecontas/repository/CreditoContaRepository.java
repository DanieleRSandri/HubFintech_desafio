package com.daniele.controlecontas.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.daniele.controlecontas.entity.CreditoContaEntity;

@Repository
public interface CreditoContaRepository extends JpaRepository<CreditoContaEntity, Integer>{

	Optional<CreditoContaEntity> findById(Integer id);
}
