package com.controlefluxo.veiculos.domain.dto;

import java.io.Serializable;
import java.util.ArrayList;

import java.util.List;

import com.controlefluxo.veiculos.domain.Servico;
import com.controlefluxo.veiculos.domain.Veiculo;


public class VeiculoFindDTO implements Serializable{

	private static final long serialVersionUID = 1L;
	
	
	private String veiculo;
	private String placa; 
	private List<Servico> servico = new ArrayList<>();
	
	
	public VeiculoFindDTO() {
		
	}

	
	
	public VeiculoFindDTO(Veiculo obj) {
		super();
		
		this.veiculo = obj.getMarca();
		this.placa = obj.getPlaca();
		this.servico = obj.getServico();
	
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

	public List<Servico> getServico() {
		return servico;
	}


	public void setServico(List<Servico> servico) {
		this.servico = servico;
	}


	
	
	
	
	
}
