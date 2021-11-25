package com.controlefluxo.veiculos.service;

import java.util.List;
import java.util.stream.Collectors;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.controlefluxo.veiculos.domain.Servico;
import com.controlefluxo.veiculos.domain.dto.ServicoFindDTO;
import com.controlefluxo.veiculos.domain.dto.ServicoInTheWorkShopDTO;
import com.controlefluxo.veiculos.domain.enums.Status;
import com.controlefluxo.veiculos.repositories.ServicoRepository;

@Service
public class ServicoService {

	@Autowired
	private ServicoRepository servicoRepository;

	public List<ServicoFindDTO> findAll() {

		List<Servico> obj = servicoRepository.findAll();
		return obj.stream().map(x -> new ServicoFindDTO(x)).collect(Collectors.toList());
	}

	public List<ServicoInTheWorkShopDTO> findByCarInTheWorkShop() {

		List<Servico> obj = servicoRepository.findByCarInTheWorkShop();
		return obj.stream().map(x -> new ServicoInTheWorkShopDTO(x)).collect(Collectors.toList());
	}

	public ServicoInTheWorkShopDTO findBySinistro(String sinistro) {

		Servico obj = servicoRepository.findBySinistro(sinistro);
		return new ServicoInTheWorkShopDTO(obj);

	}

	public ServicoInTheWorkShopDTO findByCodigoParticular(String codigoParticular) {

		Servico obj = servicoRepository.findByCodigoParticular(codigoParticular);
		return new ServicoInTheWorkShopDTO(obj);

	}
	
	public List<ServicoInTheWorkShopDTO> findByStatus() {

		List<Servico> obj = servicoRepository.findByStatus(Status.RETORNO);
		return obj.stream().map(x -> new ServicoInTheWorkShopDTO(x)).collect(Collectors.toList());
	}
	
	
	 
}
