package com.controlefluxo.veiculos.repositories;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.controlefluxo.veiculos.domain.Servico;
import com.controlefluxo.veiculos.domain.enums.Status;



@Repository
public interface ServicoRepository extends JpaRepository<Servico, Integer> {

	 	
	@Transactional(readOnly = true) 	
	@Query(value ="select * from SERVICO where entrada is not null and entrega is null  order by  PREVISAO_DE_ENTREGA asc", nativeQuery = true)
	List<Servico> findByCarInTheWorkShop();
	
	@Transactional(readOnly = true)
	Servico findBySinistro(String sinistro);
	
	@Transactional(readOnly = true)
	Servico findByCodigoParticular(String codigoParticular);
	
	@Transactional(readOnly = true)
	List<Servico> findByStatus(Status status);
	
}
