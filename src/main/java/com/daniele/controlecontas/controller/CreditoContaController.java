package com.daniele.controlecontas.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.daniele.controlecontas.dto.CreditoContaDTO;
import com.daniele.controlecontas.entity.CreditoContaEntity;
import com.daniele.controlecontas.services.CreditoContaService;


@RestController
@RequestMapping("/v1/")
public class CreditoContaController {
	
	@Autowired
	private CreditoContaService creditoContaService;
	
	@PostMapping(value = "creditoConta", produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<CreditoContaEntity> postTransferencia(@RequestBody CreditoContaDTO creditoContaDTO) throws Exception {

		return ResponseEntity.status(HttpStatus.OK).contentType(MediaType.APPLICATION_JSON)
				.body(creditoContaService.postCreditoConta(creditoContaDTO));
	}
}
