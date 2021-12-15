package com.controlefluxo.veiculos.domain.dto;

import java.io.Serializable;
import com.controlefluxo.veiculos.domain.Car;

public class CarInTheWorkShopDTO implements Serializable {

	private static final long serialVersionUID = 1L;

	private String name;
	private String board;

	public CarInTheWorkShopDTO() {

	}

	public CarInTheWorkShopDTO(Car obj) {
		super();

		this.name = obj.getName();
		this.board = obj.getBoard();
		
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getBoard() {
		return board;
	}

	public void setBoard(String board) {
		this.board = board;
	}

}
