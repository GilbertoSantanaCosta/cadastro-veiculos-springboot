package com.controlefluxo.veiculos.domain.dto;

import java.io.Serializable;
import java.util.Date;

import com.controlefluxo.veiculos.domain.Servico;
import com.controlefluxo.veiculos.domain.enums.Fornecimento;
import com.controlefluxo.veiculos.domain.enums.Status;
import com.controlefluxo.veiculos.domain.enums.Tipo;

public class ServicoInTheWorkShopDTO implements Serializable{


	private static final long serialVersionUID = 1L;
	
	private Tipo tipo;
	private Date previsaoDeEntrada;
	private Date previsaoDeEntrega;
	private Status status;
	private Fornecimento forn;
	private VeiculoInTheWorkShopDTO veiculo;
	
	public ServicoInTheWorkShopDTO() {
		
	}
	
	public ServicoInTheWorkShopDTO(Tipo tipo, Date previsaoDeEntrada, Date previsaoDeEntrega, Status status, Fornecimento forn, VeiculoInTheWorkShopDTO veiculo) {
		super();
		this.tipo = tipo;
		this.previsaoDeEntrada = previsaoDeEntrada;
		this.previsaoDeEntrega = previsaoDeEntrega;
		this.status = status;
		this.forn = forn;
		this.veiculo = veiculo;
	}
	
	public ServicoInTheWorkShopDTO(Servico servico) {
		super();
		this.tipo = servico.getTipo();
		this.previsaoDeEntrada = servico.getPrevisaoDeEntrada();
		this.previsaoDeEntrega = servico.getPrevisaoDeEntrega();
		this.status = servico.getStatus();
		this.forn = servico.getForn();
		this.veiculo = new VeiculoInTheWorkShopDTO(servico.getVeiculos());
	}

	public Tipo getTipo() {
		return tipo;
	}

	public void setTipo(Tipo tipo) {
		this.tipo = tipo;
	}
	

	public Date getPrevisaoDeEntrada() {
		return previsaoDeEntrada;
	}

	public void setPrevisaoDeEntrada(Date previsaoDeEntrada) {
		this.previsaoDeEntrada = previsaoDeEntrada;
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

	public VeiculoInTheWorkShopDTO getVeiculo() {
		return veiculo;
	}

	public void setVeiculo(VeiculoInTheWorkShopDTO veiculo) {
		this.veiculo = veiculo;
	}
	
	
	
	
}
