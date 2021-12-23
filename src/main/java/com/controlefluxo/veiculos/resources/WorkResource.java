package com.controlefluxo.veiculos.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
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
	public ResponseEntity<List<WorkInTheWorkShopDTO>> findByCarInTheWorkShop(@PathVariable Integer idWorkshop) {

		List<WorkInTheWorkShopDTO> typeWork = workService.findByCarInTheWorkShop(idWorkshop);

		return ResponseEntity.ok().body(typeWork);
	}

	@GetMapping(value = "/sinister/{sinister}")
	public ResponseEntity<WorkInTheWorkShopDTO> findBySinister(@PathVariable String sinister) {

		WorkInTheWorkShopDTO obj = workService.findBySinister(sinister);

		return ResponseEntity.ok().body(obj);
	}

	@GetMapping(value = "/privateCode/{privateCode}")
	public ResponseEntity<WorkInTheWorkShopDTO> findByCodigoParticular(@PathVariable String privateCode) {

		WorkInTheWorkShopDTO obj = workService.findByPrivateCode(privateCode);

		return ResponseEntity.ok().body(obj);
	}

	@RequestMapping(value = "/status", method = RequestMethod.GET)
	public ResponseEntity<List<WorkInTheWorkShopDTO>> findByStatus() {

		List<WorkInTheWorkShopDTO> typeWork = workService.findByStatus();

		return ResponseEntity.ok().body(typeWork);
	}

	@GetMapping(value = "/input")
	public ResponseEntity<List<WorkInTheWorkShopDTO>> findByInput() {

		List<WorkInTheWorkShopDTO> obj = workService.findByInput();

		return ResponseEntity.ok().body(obj);
	}

}
