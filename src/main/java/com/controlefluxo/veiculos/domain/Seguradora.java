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
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;

@Entity
public class Seguradora implements Serializable {

	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	private String nome;
	private String sinistro;
	
	@ManyToMany
	@JoinTable(name="VEICULOS_SEGUROS",
				joinColumns = @JoinColumn (name= "seguradora_sinistro ", referencedColumnName = "sinistro"),
				inverseJoinColumns = @JoinColumn (name= "veiculo_placa", referencedColumnName = "placa"))
	
    private List<Veiculo> veiculos = new ArrayList<>();
	
	@ManyToMany
	@JoinTable(name="SEGUROS_OFICINA",
				joinColumns = @JoinColumn (name= "seguradora_sinistro ", referencedColumnName = "sinistro"),
				inverseJoinColumns = @JoinColumn (name= "oficina_codigoservico", referencedColumnName = "codigoServico"))
	private List<Oficina> oficinas = new ArrayList<>();
	
	public Seguradora() {
		
	}
	
	public Seguradora(int id, String nome, String sinistro) {
		super();
		this.id = id;
		this.nome = nome;
		this.sinistro = sinistro;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
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

	public List<Oficina> getOficinas() {
		return oficinas;
	}

	public void setOficinas(List<Oficina> oficinas) {
		this.oficinas = oficinas;
	}
	
	

	public void setId(Integer id) {
		this.id = id;
	}

	@Override
	public int hashCode() {
		return Objects.hash(id, sinistro);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Seguradora other = (Seguradora) obj;
		return id == other.id && Objects.equals(sinistro, other.sinistro);
	}
	
	
	
}
