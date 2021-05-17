package com.daniele.controlecontas.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.daniele.controlecontas.entity.PessoaEntity;

@Repository
public interface PessoaRepository  extends JpaRepository<PessoaEntity, Integer>{
	
 Optional<PessoaEntity> findByTipoPessoa(Boolean tipoPessoa);


}
