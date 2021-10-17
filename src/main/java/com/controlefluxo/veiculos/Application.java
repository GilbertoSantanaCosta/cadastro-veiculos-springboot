package com.controlefluxo.veiculos;


import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RestController;

import com.controlefluxo.veiculos.domain.Oficina;
import com.controlefluxo.veiculos.domain.Seguradora;
import com.controlefluxo.veiculos.domain.Veiculo;
import com.controlefluxo.veiculos.domain.enums.Tipo;
import com.controlefluxo.veiculos.repositories.OficinaRepository;
import com.controlefluxo.veiculos.repositories.SeguradoraRepository;
import com.controlefluxo.veiculos.repositories.VeiculoRepository;
@RestController
@SpringBootApplication
public class Application implements CommandLineRunner{

	@Autowired
	private VeiculoRepository veiculoRepository;
	
	@Autowired
	private OficinaRepository oficinaRepository;
	
	@Autowired
	private SeguradoraRepository seguradoraRepository;
	
	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);	
	}
	
	
	@Override
	public void run(String... args) throws Exception{

	
		Veiculo v1 = new Veiculo("abc123", "1988", "corsa", "gm");
		veiculoRepository.saveAll(Arrays.asList(v1));
		
		Oficina of1 = new Oficina(0, "flamacar", Tipo.SEGURO, null);
		oficinaRepository.saveAll(Arrays.asList(of1));
		
		
		Seguradora seg1 = new Seguradora(1, "porto", "111");
		seguradoraRepository.saveAll(Arrays.asList(seg1));
		
		
		v1.getOficinas().addAll(Arrays.asList(of1));
		v1.getseguradoras().addAll(Arrays.asList(seg1));
		
		of1.getVeiculos().addAll(Arrays.asList(v1));
		of1.getSeguradoras().addAll(Arrays.asList(seg1));
		
		seg1.getVeiculos().addAll(Arrays.asList(v1));
		seg1.getOficinas().addAll(Arrays.asList(of1));
		
		
	}
}
