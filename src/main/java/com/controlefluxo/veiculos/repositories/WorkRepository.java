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
	Work findBySinisterAndWorkshop(String sinister, Workshop workshop);
	
	@Transactional(readOnly = true)
	Work findByPrivateCodeAndWorkshop(String privateCode, Workshop workshop);
	
	@Transactional(readOnly = true)
	List<Work> findByStatusAndWorkshop(Status status, Workshop workshop);
	
	@Transactional(readOnly = true)
	List<Work> findByInputAndWorkshop(Date input, Workshop workshop);
	
}
