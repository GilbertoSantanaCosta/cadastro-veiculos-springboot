package com.controlefluxo.veiculos.repositories;



import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.controlefluxo.veiculos.domain.Veiculo;


@Repository
public interface VeiculoRepository extends JpaRepository<Veiculo, Integer> {
	
	@Transactional(readOnly=true)
	Veiculo findByPlaca(String placa);
	
}
