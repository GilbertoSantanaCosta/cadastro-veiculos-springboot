package com.controlefluxo.veiculos.repositories;



import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.stereotype.Repository;

import com.controlefluxo.veiculos.domain.Oficina;



@Repository
public interface OficinaRepository extends JpaRepository<Oficina, Integer> {

	
}
