package com.controlefluxo.veiculos.repositories;



import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.stereotype.Repository;

import com.controlefluxo.veiculos.domain.Safe;



@Repository
public interface SafeRepository extends JpaRepository<Safe, Integer> {

	
}
