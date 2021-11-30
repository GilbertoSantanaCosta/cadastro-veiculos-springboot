package com.controlefluxo.veiculos.resources;

import java.text.ParseException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.controlefluxo.veiculos.domain.Veiculo;
import com.controlefluxo.veiculos.domain.dto.CadastroDTO;
import com.controlefluxo.veiculos.domain.dto.VeiculoDTO;
import com.controlefluxo.veiculos.domain.dto.VeiculoFindDTO;
import com.controlefluxo.veiculos.service.CadastroService;
import com.controlefluxo.veiculos.service.VeiculoService;

@RestController
@RequestMapping(value = "/veiculos")
public class VeiculoResource {

	@Autowired
	public VeiculoService veiculoService;
	
	@Autowired
	public CadastroService cadastroService;
	
	
	@GetMapping(value = "/placa")
	public ResponseEntity<VeiculoDTO> findByPlaca(@RequestParam(value = "placa") String placa){
		System.out.println(placa);
		VeiculoDTO veiculo = veiculoService.findByPlaca(placa);
		return ResponseEntity.ok().body(veiculo);
	}
	
	@GetMapping(value = "/find_placa")
	public ResponseEntity<VeiculoFindDTO> findByPlacaSummary(@RequestParam(value = "placa") String placa){
		System.out.println(placa);
		VeiculoFindDTO veiculo = veiculoService.findByPlacaSummary(placa);
		return ResponseEntity.ok().body(veiculo);
	}
	
	@PostMapping
	public ResponseEntity<Void> insert(@Validated @RequestBody CadastroDTO cadastro) throws ParseException{
		
		Veiculo obj = cadastroService.insert(cadastro);
		
		return null;
		
		
	}
}
