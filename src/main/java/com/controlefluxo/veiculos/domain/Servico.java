package com.controlefluxo.veiculos.domain;

import java.io.Serializable;
import java.util.Date;
import java.util.Objects;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;

import javax.persistence.ManyToOne;


import com.controlefluxo.veiculos.domain.enums.Tipo;

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
	private String obs;
	
	
	
	@ManyToOne
	@JoinColumn(name="tipoServico_id")
	private Veiculo veiculos;
	
	public Servico() {
	
	}
	

	public Servico(Integer id, String codigoParticular, String sinistro, Tipo tipo, Date vistoria,
			Date previsaoDeEntrada, Date entrada, Date entrega, String obs) {
		super();
		this.id = id;
		this.codigoParticular = codigoParticular;
		this.sinistro = sinistro;
		this.tipo = tipo;
		this.vistoria = vistoria;
		this.previsaoDeEntrada = previsaoDeEntrada;
		this.entrada = entrada;
		this.entrega = entrega;
		this.obs = obs;
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

	public Veiculo getVeiculos() {
		return veiculos;
	}


	public void setVeiculos(Veiculo veiculos) {
		this.veiculos = veiculos;
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