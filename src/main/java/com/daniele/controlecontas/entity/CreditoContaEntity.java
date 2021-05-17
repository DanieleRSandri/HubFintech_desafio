package com.daniele.controlecontas.entity;

import java.io.Serializable;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "TRANSFERENCIA")
public class CreditoContaEntity  implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "TRANSFERENCIA_ID_SEQ")
	@SequenceGenerator(name = "TRANSFERENCIA_ID_SEQ", sequenceName = "TRANSFERENCIA_ID_SEQ", allocationSize = 1)
	@Column(name = "TRANSFERENCIA_ID")
	private Integer id;
	
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "CONTA_ID")
	private ContaEntity conta;
	
	@Column(name = "DESCRICAO")
	private String descricao;
	
	@Column(name = "VALOR")
	private Double valor;
	



}
