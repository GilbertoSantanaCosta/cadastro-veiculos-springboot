package com.controlefluxo.veiculos.repositories;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.controlefluxo.veiculos.domain.TipoServico;


@Repository
public interface TipoServicoRepository extends JpaRepository<TipoServico, Integer> {

	
}
