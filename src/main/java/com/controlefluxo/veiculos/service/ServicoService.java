package com.controlefluxo.veiculos.service;

import java.util.List;
import java.util.stream.Collectors;

import org.hibernate.mapping.Collection;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.controlefluxo.veiculos.domain.Servico;
import com.controlefluxo.veiculos.domain.dto.ServicoDTO;
import com.controlefluxo.veiculos.repositories.ServicoRepository;

@Service
public class ServicoService {

	@Autowired
	private ServicoRepository tipoSevicoRepository;

	public List<Servico> findAll() {

		List<Servico> tipoServico = tipoSevicoRepository.findAll();
		return tipoServico;
	}

	//public List<ServicoDTO> findAll() {

		//List<Servico> tipoServico = tipoSevicoRepository.findAll();
		//return tipoServico.stream().map(x -> new ServicoDTO(x)).collect(Collectors.toList());
	//}
}
