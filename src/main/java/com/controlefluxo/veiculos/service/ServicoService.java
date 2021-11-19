package com.controlefluxo.veiculos.service;

import java.util.List;
import java.util.stream.Collectors;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.controlefluxo.veiculos.domain.Servico;
import com.controlefluxo.veiculos.domain.dto.ServicoFindDTO;
import com.controlefluxo.veiculos.repositories.ServicoRepository;

@Service
public class ServicoService {

	@Autowired
	private ServicoRepository tipoSevicoRepository;


	 public List<ServicoFindDTO> findAll() {
		  
		  List<Servico> tipoServico = tipoSevicoRepository.findAll(); return
		  tipoServico.stream().map(x -> new
		  ServicoFindDTO(x)).collect(Collectors.toList()); }
	 

	public List<Servico> findByCarInTheWorkShop() {

		List<Servico> tipoServico = tipoSevicoRepository.entradaGroupedByServico();
		return tipoServico;
	}
	
	 
	 
}
