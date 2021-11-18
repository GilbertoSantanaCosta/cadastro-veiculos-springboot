package com.controlefluxo.veiculos.domain.dto;

import java.io.Serializable;
import java.util.Date;

import com.controlefluxo.veiculos.domain.enums.Fornecimento;
import com.controlefluxo.veiculos.domain.enums.Status;

public class VeiculoBuscaDTO implements Serializable{

	private static final long serialVersionUID = 1L;
	
	private Integer Id;
	private String veiculo;
	private String placa; 
	private String servico;
	private Date dataEntrega;
	private Status status;
	private Fornecimento fornecimento;
	
	public VeiculoBuscaDTO() {
		
	}

	public VeiculoBuscaDTO(Integer id, String veiculo, String placa, String servico, Date dataEntrega, Status status,
			Fornecimento fornecimento) {
		super();
		Id = id;
		this.veiculo = veiculo;
		this.placa = placa;
		this.servico = servico;
		this.dataEntrega = dataEntrega;
		this.status = status;
		this.fornecimento = fornecimento;
	}
	
	

	public Integer getId() {
		return Id;
	}

	public void setId(Integer id) {
		Id = id;
	}

	public String getVeiculo() {
		return veiculo;
	}

	public void setVeiculo(String veiculo) {
		this.veiculo = veiculo;
	}

	public String getPlaca() {
		return placa;
	}

	public void setPlaca(String placa) {
		this.placa = placa;
	}

	public String getServico() {
		return servico;
	}

	public void setServico(String servico) {
		this.servico = servico;
	}

	public Date getDataEntrega() {
		return dataEntrega;
	}

	public void setDataEntrega(Date dataEntrega) {
		this.dataEntrega = dataEntrega;
	}

	public Status getStatus() {
		return status;
	}

	public void setStatus(Status status) {
		this.status = status;
	}

	public Fornecimento getFornecimento() {
		return fornecimento;
	}

	public void setFornecimento(Fornecimento fornecimento) {
		this.fornecimento = fornecimento;
	}
	
	
	
	
}
