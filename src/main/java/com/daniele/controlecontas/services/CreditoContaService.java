package com.daniele.controlecontas.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.ObjectUtils;

import com.daniele.controlecontas.dto.CreditoContaDTO;
import com.daniele.controlecontas.entity.ContaEntity;
import com.daniele.controlecontas.entity.CreditoContaEntity;
import com.daniele.controlecontas.repository.ContaRepository;
import com.daniele.controlecontas.repository.CreditoContaRepository;

import lombok.extern.slf4j.Slf4j;

@Service
@Slf4j
public class CreditoContaService {
	
	@Autowired
	private CreditoContaRepository creditoContaRepository;
	@Autowired
	private ContaRepository contaRepository;

   public void contaValidation (double valor , boolean tipo) throws Exception {
		
		if (tipo && valor>500) {
			throw new Exception("Valor Invalido");
		}else if (!tipo && valor>2000 ) {
			throw new Exception("Valor Invalido");
		}
		
	}
   
	public CreditoContaEntity postCreditoConta(CreditoContaDTO creditoContaDTO) throws Exception {
		log.info("ContaService.postConta - start -- contaDto: {}", creditoContaDTO);
		Optional<ContaEntity> contaEntity = contaRepository.findById(creditoContaDTO.getIdConta());
		
	    CreditoContaEntity creditoContaEntity = new CreditoContaEntity();
		creditoContaEntity.setDescricao(creditoContaDTO.getDescricao());
		creditoContaEntity.setValor(creditoContaDTO.getValor());
				
		CreditoContaEntity creditoConta = creditoContaRepository.save(creditoContaEntity);
		log.info("TrasferenciaService.postTrasnferencia - end -- trasnferenciaId: {}", creditoConta.getId());

		return creditoConta;
	}

	
}
