package com.controlefluxo.veiculos.repositories;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.controlefluxo.veiculos.domain.Servico;



@Repository
public interface ServicoRepository extends JpaRepository<Servico, Integer> {

	 	
	@Query(value ="select * from SERVICO where entrada is not null and entrega is null  order by  PREVISAO_DE_ENTREGA asc", nativeQuery = true)
	List<Servico> findByCarInTheWorkShop();
	
}
