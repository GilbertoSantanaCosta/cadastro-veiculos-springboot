package com.controlefluxo.veiculos.domain.dto;

import java.io.Serializable;
import com.controlefluxo.veiculos.domain.Veiculo;

public class VeiculoInTheWorkShopDTO implements Serializable {

	private static final long serialVersionUID = 1L;

	private String veiculo;
	private String placa;

	public VeiculoInTheWorkShopDTO() {

	}

	public VeiculoInTheWorkShopDTO(Veiculo obj) {
		super();

		this.veiculo = obj.getNome();
		this.placa = obj.getPlaca();
		
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

	

}
