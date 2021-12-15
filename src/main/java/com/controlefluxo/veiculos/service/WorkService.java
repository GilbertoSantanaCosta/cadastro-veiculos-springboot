package com.controlefluxo.veiculos.service;

import java.util.List;
import java.util.stream.Collectors;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.controlefluxo.veiculos.domain.Work;
import com.controlefluxo.veiculos.domain.dto.WorkFindDTO;
import com.controlefluxo.veiculos.domain.dto.WorkInTheWorkShopDTO;
import com.controlefluxo.veiculos.domain.enums.Status;
import com.controlefluxo.veiculos.repositories.WorkRepository;

@Service
public class WorkService {

	@Autowired
	private WorkRepository workRepository;

	public List<WorkFindDTO> findAll() {

		List<Work> obj = workRepository.findAll();
		return obj.stream().map(x -> new WorkFindDTO(x)).collect(Collectors.toList());
	}

	public List<WorkInTheWorkShopDTO> findByCarInTheWorkShop() {

		List<Work> obj = workRepository.findByCarInTheWorkShop();
		return obj.stream().map(x -> new WorkInTheWorkShopDTO(x)).collect(Collectors.toList());
	}

	public WorkInTheWorkShopDTO findBySinister(String sinister) {

		Work obj = workRepository.findBySinister(sinister);
		return new WorkInTheWorkShopDTO(obj);

	}

	public WorkInTheWorkShopDTO findByPrivateCode(String privateCode) {

		Work obj = workRepository.findByPrivateCode(privateCode);
		return new WorkInTheWorkShopDTO(obj);

	}
	
	public List<WorkInTheWorkShopDTO> findByStatus() {

		List<Work> obj = workRepository.findByStatus(Status.RETURN);
		return obj.stream().map(x -> new WorkInTheWorkShopDTO(x)).collect(Collectors.toList());
	}
	
	public List<WorkInTheWorkShopDTO> findByInput(){
		
		List<Work> obj = workRepository.findByInput(null);
		return obj.stream().map(x -> new WorkInTheWorkShopDTO(x)).collect(Collectors.toList());
	}
	
	
	 
}
