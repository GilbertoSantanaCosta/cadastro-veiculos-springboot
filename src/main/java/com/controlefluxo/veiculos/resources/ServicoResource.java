package com.controlefluxo.veiculos.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.controlefluxo.veiculos.domain.Servico;

import com.controlefluxo.veiculos.service.ServicoService;

@RestController
@RequestMapping(value = "/servico")
public class ServicoResource {

	@Autowired
	public ServicoService tipoServicoService;
	
	@RequestMapping(method = RequestMethod.GET)
	public ResponseEntity<List<Servico>> findAll(){
		
		List<Servico> tipoServicos = tipoServicoService.findAll();
		
		return ResponseEntity.ok().body(tipoServicos);
	}
}
