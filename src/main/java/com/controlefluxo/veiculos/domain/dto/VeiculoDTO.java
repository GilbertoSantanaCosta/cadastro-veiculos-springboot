package com.controlefluxo.veiculos.domain.dto;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import com.controlefluxo.veiculos.domain.Cliente;
import com.controlefluxo.veiculos.domain.Servico;
import com.controlefluxo.veiculos.domain.Veiculo;

public class VeiculoDTO implements Serializable {

	private static final long serialVersionUID = 1L;

	private Integer id;
	private String nome;
	private String placa;
	private String ano;
	private String modelo;
	private String marca;
	private List<Servico> servico = new ArrayList<>();

	

	public VeiculoDTO() {

	}

	public VeiculoDTO(Integer id, String nome, String placa, String ano, String modelo, String marca) {
		super();

		this.id = id;
		this.nome = nome;
		this.placa = placa;
		this.ano = ano;
		this.modelo = modelo;
		this.marca = marca;
	}

	public VeiculoDTO(Veiculo veiculo) {
		super();
		this.id = veiculo.getId();
		this.nome = veiculo.getNome();
		this.placa = veiculo.getPlaca();
		this.ano = veiculo.getAno();
		this.modelo = veiculo.getModelo();
		this.marca = veiculo.getMarca();
		this.servico = veiculo.getServico();

		

	}


	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getPlaca() {
		return placa;
	}

	public void setPlaca(String placa) {
		this.placa = placa;
	}

	public String getAno() {
		return ano;
	}

	public void setAno(String ano) {
		this.ano = ano;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public List<Servico> getServico() {
		return servico;
	}

	public void setServico(List<Servico> servico) {
		this.servico = servico;
	}

	
}
