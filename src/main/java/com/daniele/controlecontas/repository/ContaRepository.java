package com.daniele.controlecontas.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.daniele.controlecontas.entity.ContaEntity;


@Repository
public interface ContaRepository extends JpaRepository<ContaEntity, Integer>{

	Optional<ContaEntity> findByNome(String nome);

}
