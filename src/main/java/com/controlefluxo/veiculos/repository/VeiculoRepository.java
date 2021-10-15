package com.controlefluxo.veiculos.repository;

import javax.persistence.EntityManager;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.support.SimpleJpaRepository;
import org.springframework.stereotype.Repository;

import com.controlefluxo.veiculos.domain.Veiculo;


@Repository
public class VeiculoRepository extends SimpleJpaRepository<Veiculo, String> {

	public VeiculoRepository(Class<Veiculo> domainClass, EntityManager em) {
		super(domainClass, em);
		// TODO Auto-generated constructor stub
	}

}
