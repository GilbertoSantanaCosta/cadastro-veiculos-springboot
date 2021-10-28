package com.controlefluxo.veiculos.domain;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Objects;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToOne;

import com.controlefluxo.veiculos.domain.enums.Fornecimento;
import com.controlefluxo.veiculos.domain.enums.Status;
import com.controlefluxo.veiculos.domain.enums.Tipo;
import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
public class Servico implements Serializable {


	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	private String codigoParticular;
	private String sinistro;
	private Tipo tipo;
	private Date vistoria;
	private Date previsaoDeEntrada;
	private Date entrada;
	private Date entrega;
	private Date entregaRetorno;
	private Status status;
	private String obs;
	private Fornecimento forn;
	
	
	@ManyToOne
	@JoinColumn(name = "cliente_id")
	private Cliente clientes;

	
	
	public Servico() {
	
	}


	public Servico(Integer id, String codigoParticular, String sinistro, Tipo tipo, Date vistoria,
			Date previsaoDeEntrada, Date entrada, Date entrega, Date entregaRetorno, Status status, String obs, Fornecimento forn) {
		super();
		this.id = id;
		this.codigoParticular = codigoParticular;
		this.sinistro = sinistro;
		this.tipo = tipo;
		this.vistoria = vistoria;
		this.previsaoDeEntrada = previsaoDeEntrada;
		this.entrada = entrada;
		this.entrega = entrega;
		this.entregaRetorno = entregaRetorno;
		this.status = status;
		this.obs = obs;
		this.forn = forn;
	}


	public Integer getId() {
		return id;
	}


	public void setId(Integer id) {
		this.id = id;
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

	
	

	
	public Date getVistoria() {
		return vistoria;
	}


	public void setVistoria(Date vistoria) {
		this.vistoria = vistoria;
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


	public Date getEntrega() {
		return entrega;
	}


	public void setEntrega(Date entrega) {
		this.entrega = entrega;
	}
	
	
	public String getObs() {
		return obs;
	}


	public void setObs(String obs) {
		this.obs = obs;
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


	public Cliente getClientes() {
		return clientes;
	}


	public void setClientes(Cliente clientes) {
		this.clientes = clientes;
	}
	
	

	public Fornecimento getForn() {
		return forn;
	}


	public void setForn(Fornecimento forn) {
		this.forn = forn;
	}


	@Override
	public int hashCode() {
		return Objects.hash(id);
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Servico other = (Servico) obj;
		return Objects.equals(id, other.id);
	}
	
	
	
}
