package com.controlefluxo.veiculos.domain.dto;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import com.controlefluxo.veiculos.domain.Work;

import com.controlefluxo.veiculos.domain.Car;

public class CarDTO implements Serializable {

	private static final long serialVersionUID = 1L;

	private Integer id;
	private String board;
	private String year;
	private String name;
	private String brand;
	private String model;
	private List<Work> work = new ArrayList<>();

	public CarDTO() {

	}

	public CarDTO(Integer id, String board, String year, String name, String brand, String model, List<Work> work) {
		super();
		this.id = id;
		this.board = board;
		this.year = year;
		this.name = name;
		this.brand = brand;
		this.model = model;
		this.work = work;
	}

	public CarDTO(Car car) {
		super();
		this.id = car.getId();
		this.name = car.getName();
		this.board = car.getBoard();
		this.year = car.getYear();
		this.model = car.getModel();
		this.brand = car.getBoard();
		this.work = car.getWork();

	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getBoard() {
		return board;
	}

	public void setBoard(String board) {
		this.board = board;
	}

	public String getYear() {
		return year;
	}

	public void setYear(String year) {
		this.year = year;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public List<Work> getWork() {
		return work;
	}

	public void setWork(List<Work> work) {
		this.work = work;
	}

}
