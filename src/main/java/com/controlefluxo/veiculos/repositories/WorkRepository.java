package com.controlefluxo.veiculos.repositories;
import java.util.Date;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.controlefluxo.veiculos.domain.Work;
import com.controlefluxo.veiculos.domain.Workshop;
import com.controlefluxo.veiculos.domain.enums.Status;



@Repository
public interface WorkRepository extends JpaRepository<Work, Integer> {

	 	
	@Transactional(readOnly = true) 	
	@Query("select w from Work AS w where w.workshop = :workshop and w.input is not null and w.delivery is null order by w.deliveryForecast asc ")
	List<Work> findByCarInTheWorkShop(@Param("workshop") Workshop workshop);
	
	@Transactional(readOnly = true)
	Work findBySinister(String sinister);
	
	@Transactional(readOnly = true)
	Work findByPrivateCode(String privateCode);
	
	@Transactional(readOnly = true)
	List<Work> findByStatus(Status status);
	
	@Transactional(readOnly = true)
	List<Work> findByInput(Date input);
	
}
