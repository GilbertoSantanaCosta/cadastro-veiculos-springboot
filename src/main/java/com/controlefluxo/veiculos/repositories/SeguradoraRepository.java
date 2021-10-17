package com.controlefluxo.veiculos.repositories;



import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.stereotype.Repository;

import com.controlefluxo.veiculos.domain.Seguradora;
import com.controlefluxo.veiculos.domain.Veiculo;


@Repository
public interface SeguradoraRepository extends JpaRepository<Seguradora, Integer> {

	
}
