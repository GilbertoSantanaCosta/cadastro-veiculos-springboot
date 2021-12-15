package com.controlefluxo.veiculos.service;

import java.text.ParseException;
import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.controlefluxo.veiculos.domain.Client;
import com.controlefluxo.veiculos.domain.Workshop;
import com.controlefluxo.veiculos.domain.Safe;
import com.controlefluxo.veiculos.domain.Work;
import com.controlefluxo.veiculos.domain.Car;
import com.controlefluxo.veiculos.domain.dto.RegisterDTO;
import com.controlefluxo.veiculos.repositories.ClientRepository;
import com.controlefluxo.veiculos.repositories.WorkshopRepository;
import com.controlefluxo.veiculos.repositories.SafeRepository;
import com.controlefluxo.veiculos.repositories.WorkRepository;
import com.controlefluxo.veiculos.repositories.CarRepository;

@Service
public class RegisterService {

	@Autowired
	public CarRepository veiculo;

	@Autowired
	public ClientRepository cliente;

	@Autowired
	public WorkRepository servico;

	@Autowired
	public WorkshopRepository oficina;

	@Autowired
	public SafeRepository seguro;
	
	

	public Car insert(RegisterDTO register) throws ParseException {
	
		Car v1 = new Car(null, register.getBoard(), register.getYear(), register.getNameCar(),
				register.getBrand(), register.getModel());
		
		Workshop of1 = new Workshop(register.getIdWorkshop(), register.getNameWorkshop());

		Client c1 = new Client(null, register.getName(), register.getSurname(), register.getCpf(), register.getRg(),
				register.getEmail());
		c1.getTelephone()
				.addAll(Arrays.asList(register.getTelephone1(), register.getTelephone2(), register.getTelephone3()));

		Work t1 = new Work(null, register.getPrivateCode(), register.getSinister(), register.getType(),
				register.getEntryForecast(), register.getInput(), register.getDeliveryForecast(),
				register.getDelivery(), register.getReturnDelivery(), register.getStatus(), register.getNote(),
				register.getSupply(), v1, c1);

		Safe sg1 = new Safe(register.getIdSafe(), register.getNameSafe());
		
		of1.getWork().addAll(Arrays.asList(t1));
		sg1.getWork().addAll(Arrays.asList(t1));

		c1.getWork().addAll(Arrays.asList(t1));
		v1.getWork().addAll(Arrays.asList(t1));
		
		t1.setWorkshop(of1);
		t1.setSafe(sg1);

		cliente.saveAll(Arrays.asList(c1));
		 seguro.saveAll(Arrays.asList(sg1));
		veiculo.saveAll(Arrays.asList(v1));
		 oficina.saveAll(Arrays.asList(of1));
		servico.saveAll(Arrays.asList(t1));

		return v1;
	}

	public Car update(RegisterDTO register) throws ParseException {

		
		Car v1 = new Car(register.getIdCar(), register.getBoard(), register.getYear(),
				register.getNameCar(), register.getBrand(), register.getModel());
		v1.setId(register.getIdCar());
		
		// Workshop statica apenas para teste
		Workshop of1 = new Workshop(register.getIdWorkshop(), register.getNameWorkshop());

		Client c1 = new Client(register.getIdClient(), register.getName(), register.getSurname(),
				register.getCpf(), register.getRg(), register.getEmail());
		c1.getTelephone()
				.addAll(Arrays.asList(register.getTelephone1(), register.getTelephone2(), register.getTelephone3()));

		Work t1 = new Work(register.getIdWork(), register.getPrivateCode(), register.getSinister(),
				register.getType(), register.getEntryForecast(), register.getInput(),
				register.getDeliveryForecast(), register.getDelivery(), register.getReturnDelivery(),
				register.getStatus(), register.getNote(), register.getSupply(), v1, c1);

		// Seguro teste
		Safe sg1 = new Safe(register.getIdSafe(), register.getNameSafe());

		of1.getWork().addAll(Arrays.asList(t1));
		sg1.getWork().addAll(Arrays.asList(t1));

		c1.getWork().addAll(Arrays.asList(t1));
		v1.getWork().addAll(Arrays.asList(t1));
		
		t1.setWorkshop(of1);
		t1.setSafe(sg1);
		

		cliente.save(c1);
		seguro.save(sg1);
		veiculo.save(v1);
		oficina.save(of1);
		servico.save(t1);

		return v1;
	}
}
