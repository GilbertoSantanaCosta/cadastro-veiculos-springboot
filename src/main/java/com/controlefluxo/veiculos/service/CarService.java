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

	public void delete(String board) {

		Car obj = carRepository.findByBoard(board);
		carRepository.deleteById(obj.getId());
	}

	public CarDTO findByBoard(String board) {
		
		Car obj = carRepository.findByBoard(board);
		return new CarDTO(obj);
	}
	
	public CarDTO findByBoard(String board, Integer idWorkshop) {

		Car obj = carRepository.findByBoard(board);
		return new CarDTO(obj);
	}

	public CarFindDTO findByBoardSummary(String board) {
		
		Car obj = carRepository.findByBoard(board);

		return new CarFindDTO(obj);
	}

}
