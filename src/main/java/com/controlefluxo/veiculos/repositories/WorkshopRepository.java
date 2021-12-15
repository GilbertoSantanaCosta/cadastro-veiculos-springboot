package com.controlefluxo.veiculos.repositories;



import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.stereotype.Repository;

import com.controlefluxo.veiculos.domain.Workshop;



@Repository
public interface WorkshopRepository extends JpaRepository<Workshop, Integer> {

	
}
