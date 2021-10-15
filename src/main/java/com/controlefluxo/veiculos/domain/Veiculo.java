package com.controlefluxo.veiculos.domain;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;


import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;

@Entity
public class Veiculo implements Serializable {

	private static final long serialVersionUID = 1L;
	
	@Id
	private String placa;
	private String ano;
	private String modelo;
	private String marca;
	
	@ManyToMany(mappedBy="veiculos")
	private List<Seguradora> seguradoras = new ArrayList<>();

	@ManyToMany
	@JoinTable(name="VEICULO_OFICINA",
				joinColumns= @JoinColumn (name= "veiculo_placa"),
				inverseJoinColumns= @JoinColumn(name= "oficina_id")
			)
	private List<Oficina> oficinas = new ArrayList<>();
	
	public Veiculo() {

	}
	
	public Veiculo(String placa, String ano, String modelo, String marca) {
		super();
		this.placa = placa;
		this.ano = ano;
		this.modelo = modelo;
		this.marca = marca;
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
	
	

	public List<Seguradora> getseguradoras() {
		return seguradoras;
	}

	public void setSeguros(List<Seguradora> seguradoras) {
		this.seguradoras = seguradoras;
	}

	public List<Oficina> getOficinas() {
		return oficinas;
	}

	public void setOficinas(List<Oficina> oficinas) {
		this.oficinas = oficinas;
	}

	@Override
	public int hashCode() {
		return Objects.hash(placa);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Veiculo other = (Veiculo) obj;
		return Objects.equals(placa, other.placa);
	}
	
	
	
	
}
