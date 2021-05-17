package com.daniele.controlecontas.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class CreditoContaDTO {
	
	private Integer idConta;
	private String descricao;
	private Double valor;
	

	

}
