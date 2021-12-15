package com.controlefluxo.veiculos.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.controlefluxo.veiculos.domain.Car;
import com.controlefluxo.veiculos.domain.dto.CarFindDTO;
import com.controlefluxo.veiculos.domain.dto.CarDTO;
import com.controlefluxo.veiculos.repositories.CarRepository;

@Service
public class CarService {

	@Autowired
	private CarRepository carRepository;

	
	public CarDTO findByPlaca(String board) {

		Car obj = carRepository.findByBoard(board);
		return new CarDTO(obj);
	}

	public CarFindDTO findByBoardSummary(String board) {

		Car obj = carRepository.findByBoard(board);

		return new CarFindDTO(obj);
	}
}