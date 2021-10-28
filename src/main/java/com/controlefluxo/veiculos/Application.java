package com.controlefluxo.veiculos;


import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RestController;

import com.controlefluxo.veiculos.domain.Cliente;
import com.controlefluxo.veiculos.domain.Oficina;
import com.controlefluxo.veiculos.domain.Seguro;
import com.controlefluxo.veiculos.domain.Servico;

import com.controlefluxo.veiculos.domain.Veiculo;
import com.controlefluxo.veiculos.domain.enums.Tipo;
import com.controlefluxo.veiculos.repositories.ClienteRepository;
import com.controlefluxo.veiculos.repositories.OficinaRepository;
import com.controlefluxo.veiculos.repositories.SeguroRepository;
import com.controlefluxo.veiculos.repositories.ServicoRepository;
import com.controlefluxo.veiculos.repositories.VeiculoRepository;
@RestController
@SpringBootApplication
public class Application implements CommandLineRunner{

	@Autowired
	private VeiculoRepository veiculoRepository;
	
	@Autowired
	private OficinaRepository oficinaRepository;
	
	@Autowired
	private SeguroRepository seguroRepository;
	
	@Autowired
	private ServicoRepository ServicoRepository;
	
	@Autowired
	private ClienteRepository clienteRepository;
	

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);	
	}
	
	
	@Override
	public void run(String... args) throws Exception{

	
		Veiculo v1 = new Veiculo(null,"abc1234", "1988", "corsa", "gm");
		Veiculo v2 = new Veiculo(null,"abc4321", "2000", "palio", "fiat");
		Oficina of1 = new Oficina(null, "flamacar", Tipo.SEGURO);
		Servico t1 = new Servico(null, "1111", null, Tipo.PARTICULAR,null,null,null,null,null,null,null,null);
		Servico t2 = new Servico(null, "2222", "33333", Tipo.SEGURO,null,null,null,null,null,null,null,null);
		Cliente c1 = new Cliente(null, "gil", "santana", "37049612804", "425274457");
		Cliente c2 = new Cliente(null, "ramom", "souza", "64736488326", "382977365");
		
		Seguro sg1 = new Seguro(null, "porto", "123132113");
		
		c1.getServicos().addAll(Arrays.asList(t1));
		c2.getServicos().addAll(Arrays.asList(t2));
		c1.getVeiculos().addAll(Arrays.asList(v2));
		c2.getVeiculos().addAll(Arrays.asList(v1));
		
		v1.getSeguros().addAll(Arrays.asList(sg1));
		v1.getOficinas().addAll(Arrays.asList(of1));
		v2.getOficinas().addAll(Arrays.asList(of1));
	
		v1.setClientes(c2);
		v2.setClientes(c1);
		
		
		of1.getVeiculos().addAll(Arrays.asList(v1));
		of1.getVeiculos().addAll(Arrays.asList(v2));
		
		sg1.getVeiculos().addAll(Arrays.asList(v1));
		
		
		t1.setClientes(c1);
		t2.setClientes(c2);
		
		clienteRepository.saveAll(Arrays.asList(c1,c2));
		seguroRepository.saveAll(Arrays.asList(sg1));
		veiculoRepository.saveAll(Arrays.asList(v1,v2));
		oficinaRepository.saveAll(Arrays.asList(of1));
		
	    ServicoRepository.saveAll(Arrays.asList(t1,t2));
		
		
		
		
		
	}
}
