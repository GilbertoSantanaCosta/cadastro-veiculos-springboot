package com.controlefluxo.veiculos.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.controlefluxo.veiculos.domain.dto.ServicoFindDTO;
import com.controlefluxo.veiculos.domain.dto.ServicoInTheWorkShopDTO;
import com.controlefluxo.veiculos.service.ServicoService;

@RestController
@RequestMapping(value = "/servico")
public class ServicoResource {

	@Autowired
	public ServicoService servicoService;

	@RequestMapping(method = RequestMethod.GET)
	public ResponseEntity<List<ServicoFindDTO>> findAll() {

		List<ServicoFindDTO> tipoServicos = servicoService.findAll();

		return ResponseEntity.ok().body(tipoServicos);
	}

	@RequestMapping(value = "/in_the_workshop", method = RequestMethod.GET)
	public ResponseEntity<List<ServicoInTheWorkShopDTO>> findByCarInTheWorkShop() {

		List<ServicoInTheWorkShopDTO> tipoServicos = servicoService.findByCarInTheWorkShop();

		return ResponseEntity.ok().body(tipoServicos);
	}

	@GetMapping(value = "/sinistro")
	public ResponseEntity<ServicoInTheWorkShopDTO> findBySinistro(@RequestParam(value = "sinistro") String sinistro) {

		ServicoInTheWorkShopDTO obj = servicoService.findBySinistro(sinistro);

		return ResponseEntity.ok().body(obj);
	}

	@GetMapping(value = "/codigoParticular")
	public ResponseEntity<ServicoInTheWorkShopDTO> findByCodigoParticular(
			@RequestParam(value = "codigoParticular") String codigoParticular) {

		ServicoInTheWorkShopDTO obj = servicoService.findByCodigoParticular(codigoParticular);

		return ResponseEntity.ok().body(obj);
	}
	
	@RequestMapping(value = "/status", method = RequestMethod.GET)
	public ResponseEntity<List<ServicoInTheWorkShopDTO>> findByStatus() {

		List<ServicoInTheWorkShopDTO> tipoServicos = servicoService.findByStatus();

		return ResponseEntity.ok().body(tipoServicos);
	}
	
	
	
}
