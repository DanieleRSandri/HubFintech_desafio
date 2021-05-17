package com.daniele.controlecontas.dto;

import com.daniele.controlecontas.entity.PessoaEntity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ContaDTO {

	private PessoaEntity pessoa;
	
	private String nome;
	
}


