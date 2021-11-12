package com.controlefluxo.veiculos.domain.dto;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import com.controlefluxo.veiculos.domain.Cliente;

import com.controlefluxo.veiculos.domain.Veiculo;

public class ClienteDTO implements Serializable {

	private static final long serialVersionUID = 1L;

	private Integer id;
	private String nome;
	private String sobrenome;
	private String cpf;
	private String rg;

	private List<Veiculo> veiculos = new ArrayList<>();
	private List<VeiculoDTO> veiculosDTO = new ArrayList<>();

	public ClienteDTO() {

	}

	public ClienteDTO(Integer id, String nome, String sobrenome, String cpf, String rg) {
		super();
		this.id = id;
		this.nome = nome;
		this.sobrenome = sobrenome;
		this.cpf = cpf;
		this.rg = rg;
	}

	public ClienteDTO(Cliente cliente) {
		super();
		this.id = cliente.getId();
		this.nome = cliente.getNome();
		this.sobrenome = cliente.getSobrenome();
		this.cpf = cliente.getCpf();
		this.rg = cliente.getRg();
		this.veiculos = getVeiculosDTO(cliente);
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

	public String getSobrenome() {
		return sobrenome;
	}

	public void setSobrenome(String sobrenome) {
		this.sobrenome = sobrenome;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getRg() {
		return rg;
	}

	public void setRg(String rg) {
		this.rg = rg;
	}

	public List<Veiculo> getVeiculos() {
		return veiculos;
	}

	public void setVeiculos(List<Veiculo> veiculos) {
		this.veiculos = veiculos;
	}
	
	public List<Veiculo> getVeiculosDTO(Cliente cliente) {
		
		return veiculos = cliente.getVeiculos();
	}

}
