package com.controlefluxo.veiculos.domain;

import java.io.Serializable;
import java.lang.Enum.EnumDesc;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Optional;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;

import com.controlefluxo.veiculos.domain.enums.Tipo;

@Entity
public class Oficina implements Serializable {


	private static final long serialVersionUID = 1L;
	
	@Id
	private int id;
	private String nome;
	private Tipo tipo;
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer codigoServico;
	
	@ManyToMany
	@JoinTable(name="OFICINA_VEICULO",
				joinColumns = @JoinColumn (name= "oficina_codigoServico", referencedColumnName = "codigoServico"),
				inverseJoinColumns = @JoinColumn (name= "veiculo_placa", referencedColumnName = "placa"))
	private List<Veiculo> veiculos = new ArrayList<>();
	
	@ManyToMany(mappedBy="oficinas")
	private List<Seguradora> seguradoras = new ArrayList<>();

	public Oficina() {
		
	}
	
	public Oficina(int id, String nome, Tipo tipo, Integer codigoServico ) {
		super();
		this.id = id;
		this.nome = nome;
		this.tipo = tipo;
		this.codigoServico = codigoServico;
		
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

	

	public final String name() {
		return tipo.name();
	}

	public final int ordinal() {
		return tipo.ordinal();
	}

	public String toString() {
		return tipo.toString();
	}

	public final int compareTo(Tipo o) {
		return tipo.compareTo(o);
	}

	public final Class<Tipo> getDeclaringClass() {
		return tipo.getDeclaringClass();
	}

	public final Optional<EnumDesc<Tipo>> describeConstable() {
		return tipo.describeConstable();
	}

	
	public List<Veiculo> getVeiculos() {
		return veiculos;
	}

	public void setVeiculos(List<Veiculo> veiculos) {
		this.veiculos = veiculos;
	}

	public List<Seguradora> getSeguradoras() {
		return seguradoras;
	}

	public void setSeguradoras(List<Seguradora> seguradoras) {
		this.seguradoras = seguradoras;
	}
	
	

	public Tipo getTipo() {
		return tipo;
	}

	public void setTipo(Tipo tipo) {
		this.tipo = tipo;
	}

	public Integer getCodigoServico() {
		return codigoServico;
	}

	public void setCodigoServico(Integer codigoServico) {
		this.codigoServico = codigoServico;
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
		Oficina other = (Oficina) obj;
		return id == other.id;
	}
	
	
	
}
