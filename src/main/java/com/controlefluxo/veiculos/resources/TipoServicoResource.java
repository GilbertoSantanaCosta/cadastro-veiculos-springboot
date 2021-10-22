package com.controlefluxo.veiculos.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import com.controlefluxo.veiculos.domain.TipoServico;
import com.controlefluxo.veiculos.service.TipoServicoService;

@RestController
@RequestMapping(value = "/tiposervico")
public class TipoServicoResource {

	@Autowired
	public TipoServicoService tipoServicoService;
	
	@RequestMapping(method = RequestMethod.GET)
	public ResponseEntity<List<TipoServico>> findAll(){
		
		List<TipoServico> tipoServicos = tipoServicoService.findAll();
		
		return ResponseEntity.ok().body(tipoServicos);
	}
}
