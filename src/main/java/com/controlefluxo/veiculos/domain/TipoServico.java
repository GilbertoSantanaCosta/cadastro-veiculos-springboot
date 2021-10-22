package com.controlefluxo.veiculos.domain;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;

import javax.persistence.ManyToOne;


import com.controlefluxo.veiculos.domain.enums.Tipo;

@Entity
public class TipoServico implements Serializable {


	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	private String codigoParticular;
	private String sinistro;
	private Tipo tipo;
	
	@ManyToOne
	@JoinColumn(name="tipoServico_id")
	private Veiculo veiculos;
	
	public TipoServico() {
	
	}
	
	public TipoServico(Integer id, String codigoParticular, String sinistro, Tipo tipo) {
		super();
		this.id = id;
		this.codigoParticular = codigoParticular;
		this.sinistro = sinistro;
		this.tipo = tipo;
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
		TipoServico other = (TipoServico) obj;
		return Objects.equals(id, other.id);
	}
	
	
	
}
