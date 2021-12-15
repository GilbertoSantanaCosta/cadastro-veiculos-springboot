package com.controlefluxo.veiculos.repositories;
import java.util.Date;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.controlefluxo.veiculos.domain.Work;
import com.controlefluxo.veiculos.domain.enums.Status;



@Repository
public interface WorkRepository extends JpaRepository<Work, Integer> {

	 	
	@Transactional(readOnly = true) 	
	@Query(value ="select * from SERVICO where entrada is not null and entrega is null  order by  PREVISAO_DE_ENTREGA asc", nativeQuery = true)
	List<Work> findByCarInTheWorkShop();
	
	@Transactional(readOnly = true)
	Work findBySinister(String sinister);
	
	@Transactional(readOnly = true)
	Work findByPrivateCode(String privateCode);
	
	@Transactional(readOnly = true)
	List<Work> findByStatus(Status status);
	
	@Transactional(readOnly = true)
	List<Work> findByInput(Date input);
	
}
