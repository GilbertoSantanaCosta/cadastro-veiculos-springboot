package com.controlefluxo.veiculos.service;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.controlefluxo.veiculos.domain.Veiculo;
import com.controlefluxo.veiculos.domain.dto.VeiculoFindDTO;
import com.controlefluxo.veiculos.domain.dto.VeiculoDTO;
import com.controlefluxo.veiculos.repositories.VeiculoRepository;

@Service
public class VeiculoService {

	@Autowired
	private VeiculoRepository veiculoRepository;

	public List<VeiculoDTO> findAll() {

		List<Veiculo> obj = veiculoRepository.findAll();
		return obj.stream().map(x -> new VeiculoDTO(x)).collect(Collectors.toList());
	}

	public VeiculoDTO findByPlaca(String placa) {

		Veiculo obj = veiculoRepository.findByPlaca(placa);
		return new VeiculoDTO(obj);
	}

	public VeiculoFindDTO findByPlacaSummary(String placa) {

		Veiculo obj = veiculoRepository.findByPlaca(placa);

		return new VeiculoFindDTO(obj);
	}
}
