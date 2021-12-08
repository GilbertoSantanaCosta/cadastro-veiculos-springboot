package com.controlefluxo.veiculos.domain.dto;

import java.io.Serializable;
import java.util.Date;

import com.controlefluxo.veiculos.domain.Cliente;
import com.controlefluxo.veiculos.domain.Oficina;
import com.controlefluxo.veiculos.domain.Seguro;
import com.controlefluxo.veiculos.domain.Servico;
import com.controlefluxo.veiculos.domain.enums.Fornecimento;
import com.controlefluxo.veiculos.domain.enums.Status;
import com.controlefluxo.veiculos.domain.enums.Tipo;

public class ServicoDTO implements Serializable {

	private static final long serialVersionUID = 1L;

	private Integer id;
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
	private Cliente cliente;
	private Seguro seguro;
	private Oficina oficina;

	public ServicoDTO() {

	}

	public ServicoDTO(Integer id, String codigoParticular, String sinistro, Tipo tipo, Date previsaoDeEntrada,
			Date entrada, Date previsaoDeEntrega, Date entrega, Date entregaRetorno, Status status, String obs,
			Fornecimento forn , Cliente cliente, Seguro seguro, Oficina oficina) {
		super();
		this.id = id;
		this.codigoParticular = codigoParticular;
		this.sinistro = sinistro;
		this.tipo = tipo;
		this.previsaoDeEntrada = previsaoDeEntrada;
		this.entrada = entrada;
		this.entrega = entrega;
		this.entregaRetorno = entregaRetorno;
		this.status = status;
		this.obs = obs;
		this.forn = forn;
		this.cliente = cliente;
		this.seguro = seguro;
		this.oficina = oficina;

	}

	public ServicoDTO(Servico servico) {
		super();
		this.id = servico.getId();
		this.codigoParticular = servico.getCodigoParticular();
		this.sinistro = servico.getSinistro();
		this.tipo = servico.getTipo();
		this.previsaoDeEntrada = servico.getPrevisaoDeEntrada();
		this.entrada = servico.getEntrada();
		this.entrega = servico.getEntrega();
		this.entregaRetorno = servico.getEntregaRetorno();
		this.status = servico.getStatus();
		this.obs = servico.getObs();
		this.forn = servico.getForn();
		this.cliente = servico.getCliente();
		this.seguro = servico.getSeguro();
		this.oficina = servico.getOficina();

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

	public Fornecimento getForn() {
		return forn;
	}

	public void setForn(Fornecimento forn) {
		this.forn = forn;
	}

	public Date getPrevisaoDeEntrega() {
		return previsaoDeEntrega;
	}

	public void setPrevisaoDeEntrega(Date previsaoDeEntrega) {
		this.previsaoDeEntrega = previsaoDeEntrega;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public Seguro getSeguro() {
		return seguro;
	}

	public void setSeguro(Seguro seguro) {
		this.seguro = seguro;
	}

	public Oficina getOficina() {
		return oficina;
	}

	public void setOficina(Oficina oficina) {
		this.oficina = oficina;
	}
	
	
	

}
