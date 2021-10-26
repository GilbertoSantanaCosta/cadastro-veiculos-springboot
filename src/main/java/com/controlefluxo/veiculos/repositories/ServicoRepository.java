package com.controlefluxo.veiculos.repositories;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.controlefluxo.veiculos.domain.Servico;


@Repository
public interface ServicoRepository extends JpaRepository<Servico, Integer> {

	
}
