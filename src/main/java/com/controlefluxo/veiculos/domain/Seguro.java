package com.controlefluxo.veiculos.domain;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
public class Seguro implements Serializable {


	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	private String nome;
	private String sinistro;
	
	@JsonIgnore
	@ManyToMany(mappedBy="seguros")
	private List<Veiculo> veiculos = new ArrayList<>();
	
	public Seguro() {
		
	}
	
	public Seguro(Integer id, String nome, String sinistro) {
		super();
		this.id = id;
		this.nome = nome;
		this.sinistro = sinistro;
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

	public String getSinistro() {
		return sinistro;
	}

	public void setSinistro(String sinistro) {
		this.sinistro = sinistro;
	}

	public List<Veiculo> getVeiculos() {
		return veiculos;
	}

	public void setVeiculos(List<Veiculo> veiculos) {
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
		Seguro other = (Seguro) obj;
		return Objects.equals(id, other.id);
	}
	
	
}
