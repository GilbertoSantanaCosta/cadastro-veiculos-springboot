package com.controlefluxo.veiculos.domain.dto;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import com.controlefluxo.veiculos.domain.Cliente;
import com.controlefluxo.veiculos.domain.Oficina;
import com.controlefluxo.veiculos.domain.Seguro;
import com.controlefluxo.veiculos.domain.Veiculo;



public class VeiculoDTO implements Serializable {

	private static final long serialVersionUID = 1L;
	
	private Integer id;
	private String placa;
	private String ano;
	private String modelo;
	private String marca;
	

	
	private List<Oficina> oficinas = new ArrayList<>();
	private List<Seguro> seguros = new ArrayList<>();
	private Cliente clientes;
	
	public VeiculoDTO() {

	}
	
	public VeiculoDTO(Integer id,String placa, String ano, String modelo, String marca) {
		super();
		this.id = id;
		this.placa = placa;
		this.ano = ano;
		this.modelo = modelo;
		this.marca = marca;
	}
	
	public VeiculoDTO(Veiculo veiculo) {
		super();
		this.id = veiculo.getId();
		this.placa = veiculo.getPlaca();
		this.ano = veiculo.getAno();
		this.modelo = veiculo.getModelo();
		this.marca = veiculo.getMarca();
		
	}

	
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
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

	public List<Oficina> getOficinas() {
		return oficinas;
	}

	public void setOficinas(List<Oficina> oficinas) {
		this.oficinas = oficinas;
	}
	
	
	public List<Seguro> getSeguros() {
		return seguros;
	}

	public void setSeguros(List<Seguro> seguros) {
		this.seguros = seguros;
	}
	
	
	public Cliente getClientes() {
		return clientes;
	}

	public void setClientes(Cliente clientes) {
		this.clientes = clientes;
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
		VeiculoDTO other = (VeiculoDTO) obj;
		return Objects.equals(placa, other.placa);
	}
	
	
	
	
}
