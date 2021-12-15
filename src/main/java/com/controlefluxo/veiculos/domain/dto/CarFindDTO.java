package com.controlefluxo.veiculos.domain.dto;

import java.io.Serializable;
import java.util.ArrayList;

import java.util.List;
import java.util.stream.Collectors;

import com.controlefluxo.veiculos.domain.Car;



public class CarFindDTO implements Serializable {

	private static final long serialVersionUID = 1L;

	private String name;
	private String board;
	private List<WorkFindDTO> work = new ArrayList<>();

	public CarFindDTO() {

	}

	public CarFindDTO(Car obj) {
		super();

		this.name = obj.getName();
		this.board = obj.getBoard();
		this.work = obj.getWork().stream().map(x -> new WorkFindDTO(x)).collect(Collectors.toList());

	}

	public String getVeiculo() {
		return name;
	}

	public void setVeiculo(String name) {
		this.name = name;
	}

	public String getPlaca() {
		return board;
	}

	public void setPlaca(String board) {
		this.board = board;
	}

	public List<WorkFindDTO> getWork() {
		return work;
	}

	public void setWork(List<WorkFindDTO> work) {
		this.work = work;
	}

}
