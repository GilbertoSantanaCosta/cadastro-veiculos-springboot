package com.controlefluxo.veiculos.service;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.controlefluxo.veiculos.domain.TipoServico;
import com.controlefluxo.veiculos.repositories.TipoServicoRepository;



@Service
public class TipoServicoService {

	@Autowired
	private TipoServicoRepository tipoSevicoRepository;
	
	public List<TipoServico> findAll() {
		
		List<TipoServico> tipoServico = tipoSevicoRepository.findAll();
		return tipoServico;
	}
}
