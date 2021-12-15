package com.controlefluxo.veiculos.resources;

import java.net.URI;
import java.text.ParseException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;
import com.controlefluxo.veiculos.domain.Car;
import com.controlefluxo.veiculos.domain.dto.RegisterDTO;
import com.controlefluxo.veiculos.domain.dto.CarDTO;
import com.controlefluxo.veiculos.domain.dto.CarFindDTO;
import com.controlefluxo.veiculos.service.RegisterService;
import com.controlefluxo.veiculos.service.CarService;

@RestController
@RequestMapping(value = "/Car")
public class CarResource {

	@Autowired
	public CarService carService;

	@Autowired
	public RegisterService registerService;

	@GetMapping(value = "/{board}")
	public ResponseEntity<CarDTO> findByBoard(@PathVariable String board) {

		CarDTO car = carService.findByPlaca(board);
		return ResponseEntity.ok().body(car);
	}

	@GetMapping(value = "/find_board/{board}")
	public ResponseEntity<CarFindDTO> findByBoardSummary(@PathVariable String board) {

		CarFindDTO car = carService.findByBoardSummary(board);
		return ResponseEntity.ok().body(car);
	}

	@PostMapping
	public ResponseEntity<Void> insert(@Validated @RequestBody RegisterDTO register) throws ParseException {

		Car obj = registerService.insert(register);

		URI uri = ServletUriComponentsBuilder.fromCurrentRequest().path("/{board}").buildAndExpand(obj.getBoard())
				.toUri();

		return ResponseEntity.created(uri).build();

	}

	@PutMapping
	public ResponseEntity<Void> update(@Validated @RequestBody RegisterDTO register) throws ParseException {

		Car obj = registerService.update(register);

		URI uri = ServletUriComponentsBuilder.fromCurrentRequest().path("/{board}").buildAndExpand(obj.getBoard())
				.toUri();

		return ResponseEntity.created(uri).build();

	}
}
