package com.controlefluxo.veiculos.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.controlefluxo.veiculos.domain.Veiculo;
import com.controlefluxo.veiculos.service.VeiculoService;

@RestController
@RequestMapping(value = "/veiculos")
public class VeiculoResource {

	@Autowired
	public VeiculoService veiculoService;
	
	@RequestMapping(method = RequestMethod.GET)
	public ResponseEntity<List<Veiculo>> findAll(){
		
		List<Veiculo> veiculo = veiculoService.findAll();
		
		return ResponseEntity.ok().body(veiculo);
	}
	
	@GetMapping(value = "/placa")
	public ResponseEntity<Veiculo> findByPlaca(@RequestParam(value = "placa") String placa){
		System.out.println(placa);
		Veiculo veiculo = veiculoService.findByPlaca(placa);
		return ResponseEntity.ok().body(veiculo);
	}
}
