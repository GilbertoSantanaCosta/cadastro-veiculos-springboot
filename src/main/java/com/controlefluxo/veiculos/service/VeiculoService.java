package com.controlefluxo.veiculos.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.controlefluxo.veiculos.domain.Veiculo;
import com.controlefluxo.veiculos.repositories.VeiculoRepository;

@Service
public class VeiculoService {

	@Autowired
	private VeiculoRepository veiculoRepository;
	
	public List<Veiculo> findAll() {
		
		return veiculoRepository.findAll();
	}
}
