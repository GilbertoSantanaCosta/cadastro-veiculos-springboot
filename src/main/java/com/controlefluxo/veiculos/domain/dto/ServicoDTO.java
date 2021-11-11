package com.controlefluxo.veiculos.domain.dto;

import java.io.Serializable;
import java.util.Date;
import com.controlefluxo.veiculos.domain.Cliente;
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
	private Date vistoria;
	private Date previsaoDeEntrada;
	private Date entrada;
	private Date entrega;
	private Date entregaRetorno;
	private Status status;
	private String obs;
	private Fornecimento forn;

	private ClienteDTO cliente;

	public ServicoDTO() {

	}

	public ServicoDTO(Integer id, String codigoParticular, String sinistro, Tipo tipo, Date vistoria,
			Date previsaoDeEntrada, Date entrada, Date entrega, Date entregaRetorno, Status status, String obs,
			Fornecimento forn, ClienteDTO cliente) {
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
		this.cliente = cliente;
	}
	
	public ServicoDTO(Servico servico) {
		super();
		this.id = servico.getId();
		this.codigoParticular = servico.getCodigoParticular();
		this.sinistro = servico.getSinistro();
		this.tipo = servico.getTipo();
		this.vistoria = servico.getVistoria();
		this.previsaoDeEntrada = servico.getPrevisaoDeEntrada();
		this.entrada = servico.getEntrada();
		this.entrega = servico.getEntrega();
		this.entregaRetorno = servico.getEntregaRetorno();
		this.status = servico.getStatus();
		this.obs = servico.getObs();
		this.forn = servico.getForn();
		this.cliente = new ClienteDTO(servico.getClientes());
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

	public ClienteDTO getClientes() {
		return cliente;
	}

	public void setClientesDTO(ClienteDTO cliente) {
		this.cliente = cliente;
	}

	public Fornecimento getForn() {
		return forn;
	}

	public void setForn(Fornecimento forn) {
		this.forn = forn;
	}

}
