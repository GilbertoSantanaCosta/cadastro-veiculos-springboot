package com.controlefluxo.veiculos.domain.dto;

import java.io.Serializable;
import java.util.Date;

import com.controlefluxo.veiculos.domain.enums.Fornecimento;
import com.controlefluxo.veiculos.domain.enums.Status;
import com.controlefluxo.veiculos.domain.enums.Tipo;

public class CadastroDTO implements Serializable {

	private static final long serialVersionUID = 1L;

	private String nome;
	private String sobrenome;
	private String cpf;
	private String rg;
	private String telefone1;
	private String telefone2;
	private String telefone3;
	private String email;

	
	private String nomeOficina;

	private String nomeSeguro;

	private String codigoParticular;
	private String sinistro;
	private Tipo tipo;
	private Date previsaoDeEntrada;
	private Date entrada;
	private Date previsaoDeEntrega;
	private Date entrega;
	private Date entregaRetorno;
	private Status status;
	private String obs;
	private Fornecimento forn;

	private String placa;
	private String ano;
	private String nomeVeiculo;
	private String marca;
	private String modelo;

	

	public CadastroDTO(String nome, String sobrenome, String cpf, String rg, String telefone1, String telefone2,
			String telefone3, String email, String nomeOficina, String nomeSeguro, String codigoParticular,
			String sinistro, Tipo tipo, Date previsaoDeEntrada, Date entrada, Date previsaoDeEntrega, Date entrega,
			Date entregaRetorno, Status status, String obs, Fornecimento forn, String placa, String ano,
			String nomeVeiculo, String marca, String modelo) {
		super();
		this.nome = nome;
		this.sobrenome = sobrenome;
		this.cpf = cpf;
		this.rg = rg;
		this.telefone1 = telefone1;
		this.telefone2 = telefone2;
		this.telefone3 = telefone3;
		this.email = email;
		this.nomeOficina = nomeOficina;
		this.nomeSeguro = nomeSeguro;
		this.codigoParticular = codigoParticular;
		this.sinistro = sinistro;
		this.tipo = tipo;
		this.previsaoDeEntrada = previsaoDeEntrada;
		this.entrada = entrada;
		this.previsaoDeEntrega = previsaoDeEntrega;
		this.entrega = entrega;
		this.entregaRetorno = entregaRetorno;
		this.status = status;
		this.obs = obs;
		this.forn = forn;
		this.placa = placa;
		this.ano = ano;
		this.nomeVeiculo = nomeVeiculo;
		this.marca = marca;
		this.modelo = modelo;
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

	public String getNomeOficina() {
		return nomeOficina;
	}

	public void setNomeOficina(String nomeOficina) {
		this.nomeOficina = nomeOficina;
	}

	public String getNomeSeguro() {
		return nomeSeguro;
	}

	public void setNomeSeguro(String nomeSeguro) {
		this.nomeSeguro = nomeSeguro;
	}

	public String getCodigoParticular() {
		return codigoParticular;
	}

	public void setCodigoParticular(String codigoParticular) {
		this.codigoParticular = codigoParticular;
	}

	public String getSinistro() {
		return sinistro;
	}

	public void setSinistro(String sinistro) {
		this.sinistro = sinistro;
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

	public Date getEntrada() {
		return entrada;
	}

	public void setEntrada(Date entrada) {
		this.entrada = entrada;
	}

	public Date getPrevisaoDeEntrega() {
		return previsaoDeEntrega;
	}

	public void setPrevisaoDeEntrega(Date previsaoDeEntrega) {
		this.previsaoDeEntrega = previsaoDeEntrega;
	}

	public Date getEntrega() {
		return entrega;
	}

	public void setEntrega(Date entrega) {
		this.entrega = entrega;
	}

	public Date getEntregaRetorno() {
		return entregaRetorno;
	}

	public void setEntregaRetorno(Date entregaRetorno) {
		this.entregaRetorno = entregaRetorno;
	}

	public Status getStatus() {
		return status;
	}

	public void setStatus(Status status) {
		this.status = status;
	}

	public String getObs() {
		return obs;
	}

	public void setObs(String obs) {
		this.obs = obs;
	}

	public Fornecimento getForn() {
		return forn;
	}

	public void setForn(Fornecimento forn) {
		this.forn = forn;
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

	public String getNomeVeiculo() {
		return nomeVeiculo;
	}

	public void setNomeVeiculo(String nomeVeiculo) {
		this.nomeVeiculo = nomeVeiculo;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public String getTelefone1() {
		return telefone1;
	}

	public void setTelefone1(String telefone1) {
		this.telefone1 = telefone1;
	}

	public String getTelefone2() {
		return telefone2;
	}

	public void setTelefone2(String telefone2) {
		this.telefone2 = telefone2;
	}

	public String getTelefone3() {
		return telefone3;
	}

	public void setTelefone3(String telefone3) {
		this.telefone3 = telefone3;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	
	

}
