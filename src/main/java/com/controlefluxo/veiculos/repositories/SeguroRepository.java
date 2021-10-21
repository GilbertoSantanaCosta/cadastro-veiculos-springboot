package com.controlefluxo.veiculos.repositories;



import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.stereotype.Repository;

import com.controlefluxo.veiculos.domain.Seguro;



@Repository
public interface SeguroRepository extends JpaRepository<Seguro, Integer> {

	
}
