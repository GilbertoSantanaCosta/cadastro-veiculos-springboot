package com.controlefluxo.veiculos.domain.dto;

import java.io.Serializable;
import java.util.ArrayList;

import java.util.List;
import java.util.stream.Collectors;

import com.controlefluxo.veiculos.domain.Veiculo;

public class VeiculoFindDTO implements Serializable {

	private static final long serialVersionUID = 1L;

	private String veiculo;
	private String placa;
	private List<ServicoFindDTO> servico = new ArrayList<>();

	public VeiculoFindDTO() {

	}

	public VeiculoFindDTO(Veiculo obj) {
		super();

		this.veiculo = obj.getNome();
		this.placa = obj.getPlaca();
		this.servico = obj.getServico().stream().map(x -> new ServicoFindDTO(x)).collect(Collectors.toList());

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

	public List<ServicoFindDTO> getServico() {
		return servico;
	}

	public void setServico(List<ServicoFindDTO> servico) {
		this.servico = servico;
	}

}
