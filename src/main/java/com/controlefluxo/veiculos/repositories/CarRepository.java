package com.controlefluxo.veiculos.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import com.controlefluxo.veiculos.domain.Car;

@Repository
public interface CarRepository extends JpaRepository<Car, Integer> {

	@Transactional(readOnly = true)
	Car findByBoard(String board);

}
