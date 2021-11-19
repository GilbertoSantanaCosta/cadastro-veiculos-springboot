package com.controlefluxo.veiculos.domain.dto;

import java.io.Serializable;
import java.util.Date;

import com.controlefluxo.veiculos.domain.Servico;
import com.controlefluxo.veiculos.domain.enums.Fornecimento;
import com.controlefluxo.veiculos.domain.enums.Status;
import com.controlefluxo.veiculos.domain.enums.Tipo;

public class ServicoFindDTO implements Serializable{


	private static final long serialVersionUID = 1L;
	
	private Tipo tipo;
	private Date previsaoDeEntrega;
	private Status status;
	private Fornecimento forn;
	
	public ServicoFindDTO() {
		
	}
	
	public ServicoFindDTO(Tipo tipo, Date previsaoDeEntrega, Status status, Fornecimento forn) {
		super();
		this.tipo = tipo;
		this.previsaoDeEntrega = previsaoDeEntrega;
		this.status = status;
		this.forn = forn;
	}
	
	public ServicoFindDTO(Servico servico) {
		super();
		this.tipo = servico.getTipo();
		this.previsaoDeEntrega = servico.getPrevisaoDeEntrega();
		this.status = servico.getStatus();
		this.forn = servico.getForn();
	}

	public Tipo getTipo() {
		return tipo;
	}

	public void setTipo(Tipo tipo) {
		this.tipo = tipo;
	}

	public Date getPrevisaoDeEntrega() {
		return previsaoDeEntrega;
	}

	public void setPrevisaoDeEntrega(Date previsaoDeEntrega) {
		this.previsaoDeEntrega = previsaoDeEntrega;
	}

	public Status getStatus() {
		return status;
	}

	public void setStatus(Status status) {
		this.status = status;
	}

	public Fornecimento getForn() {
		return forn;
	}

	public void setForn(Fornecimento forn) {
		this.forn = forn;
	}
	
	
	
}
