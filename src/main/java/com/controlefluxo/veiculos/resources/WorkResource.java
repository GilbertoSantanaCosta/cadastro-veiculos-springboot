package com.controlefluxo.veiculos.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.controlefluxo.veiculos.domain.dto.WorkDTO;
import com.controlefluxo.veiculos.domain.dto.WorkFindDTO;
import com.controlefluxo.veiculos.domain.dto.WorkInTheWorkShopDTO;
import com.controlefluxo.veiculos.repositories.WorkshopRepository;
import com.controlefluxo.veiculos.service.WorkService;

@RestController
@RequestMapping(value = "/work")
public class WorkResource {

	@Autowired
	public WorkService workService;

	public WorkshopRepository workRepository;

	@RequestMapping(method = RequestMethod.GET)
	public ResponseEntity<List<WorkFindDTO>> findAll() {

		List<WorkFindDTO> typeWork = workService.findAll();

		return ResponseEntity.ok().body(typeWork);
	}

	@RequestMapping(value = "/in_the_workshop/{idWorkshop}", method = RequestMethod.GET)
	public ResponseEntity<List<WorkInTheWorkShopDTO>> findByCarInTheWorkShop(@PathVariable("idWorkshop") Integer idWorkshop) {

		List<WorkInTheWorkShopDTO> typeWork = workService.findByCarInTheWorkShop(idWorkshop);

		return ResponseEntity.ok().body(typeWork);
	}

	@GetMapping(value = "/sinister/{sinister}/workshop/{idWorkshop}")
	public ResponseEntity<WorkDTO> findBySinister(@PathVariable("sinister") String sinister, @PathVariable("idWorkshop") Integer idWorkshop ) {

		WorkDTO obj = workService.findBySinister(sinister, idWorkshop);

		return ResponseEntity.ok().body(obj);
	}

	@GetMapping(value = "/privateCode/{privateCode}/workshop/{idWorkshop}")
	public ResponseEntity<WorkDTO> findByCodigoParticular(@PathVariable("privateCode") String privateCode , @PathVariable("idWorkshop") Integer idWorkshop) {

		WorkDTO obj = workService.findByPrivateCode(privateCode, idWorkshop);

		return ResponseEntity.ok().body(obj);
	}

	@RequestMapping(value = "/status/workshop/{idWorkshop}", method = RequestMethod.GET)
	public ResponseEntity<List<WorkInTheWorkShopDTO>> findByStatus(@PathVariable("idWorkshop") Integer idWorkshop) {

		List<WorkInTheWorkShopDTO> typeWork = workService.findByStatus(idWorkshop);

		return ResponseEntity.ok().body(typeWork);
	}

	@GetMapping(value = "/input/workshop/{idWorkshop}")
	public ResponseEntity<List<WorkInTheWorkShopDTO>> findByInput(@PathVariable("idWorkshop") Integer idWorkshop) {

		List<WorkInTheWorkShopDTO> obj = workService.findByInput(idWorkshop);

		return ResponseEntity.ok().body(obj);
	}
	
	@GetMapping(value = "/car/{board}/workshop/{idWorkshop}")
	public ResponseEntity<List<WorkInTheWorkShopDTO>> findByCarAndWorkshop(@PathVariable("board") String board , @PathVariable("idWorkshop") Integer idWorkshop) {

		List<WorkInTheWorkShopDTO> obj = workService.findByCarAndWorkshop(board, idWorkshop);

		return ResponseEntity.ok().body(obj);
	}

}
