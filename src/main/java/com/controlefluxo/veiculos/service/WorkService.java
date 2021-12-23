package com.controlefluxo.veiculos.service;

import java.util.List;
import java.util.stream.Collectors;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.controlefluxo.veiculos.domain.Work;
import com.controlefluxo.veiculos.domain.Workshop;
import com.controlefluxo.veiculos.domain.dto.WorkFindDTO;
import com.controlefluxo.veiculos.domain.dto.WorkInTheWorkShopDTO;
import com.controlefluxo.veiculos.domain.enums.Status;
import com.controlefluxo.veiculos.repositories.WorkRepository;
import com.controlefluxo.veiculos.repositories.WorkshopRepository;

@Service
public class WorkService {

	@Autowired
	private WorkRepository workRepository;
	
	@Autowired
	private WorkshopRepository workshopRepository;

	public List<WorkFindDTO> findAll() {

		List<Work> obj = workRepository.findAll();
		return obj.stream().map(x -> new WorkFindDTO(x)).collect(Collectors.toList());
	}

	public List<WorkInTheWorkShopDTO> findByCarInTheWorkShop(Integer idWorkshop) {
		
		Workshop workshop = workshopRepository.findById(idWorkshop).get();
		List<Work> obj = workRepository.findByCarInTheWorkShop(workshop);
		return obj.stream().map(x -> new WorkInTheWorkShopDTO(x)).collect(Collectors.toList());
	}

	public WorkInTheWorkShopDTO findBySinister(String sinister, Integer idWorkshop) {
		
		Workshop workshop = workshopRepository.findById(idWorkshop).get();
		Work obj = workRepository.findBySinisterAndWorkshop(sinister, workshop);
		return new WorkInTheWorkShopDTO(obj);
 
	}

	public WorkInTheWorkShopDTO findByPrivateCode(String privateCode, Integer idWorkshop) {

		Workshop workshop = workshopRepository.findById(idWorkshop).get();
		Work obj = workRepository.findByPrivateCodeAndWorkshop(privateCode, workshop);
		return new WorkInTheWorkShopDTO(obj);

	}
	
	public List<WorkInTheWorkShopDTO> findByStatus(Integer idWorkshop) {

		Workshop workshop = workshopRepository.findById(idWorkshop).get();
		List<Work> obj = workRepository.findByStatusAndWorkshop(Status.RETURN, workshop );
		return obj.stream().map(x -> new WorkInTheWorkShopDTO(x)).collect(Collectors.toList());
	}
	
	public List<WorkInTheWorkShopDTO> findByInput(Integer idWorkshop){
		
		Workshop workshop = workshopRepository.findById(idWorkshop).get();
		List<Work> obj = workRepository.findByInputAndWorkshop(null, workshop);
		return obj.stream().map(x -> new WorkInTheWorkShopDTO(x)).collect(Collectors.toList());
	}
	
	
	 
}
