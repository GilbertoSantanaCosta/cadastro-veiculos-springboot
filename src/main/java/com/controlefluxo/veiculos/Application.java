package com.controlefluxo.veiculos;


import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RestController;
import com.controlefluxo.veiculos.domain.Oficina;
import com.controlefluxo.veiculos.domain.Seguro;
import com.controlefluxo.veiculos.domain.TipoServico;
import com.controlefluxo.veiculos.domain.Veiculo;
import com.controlefluxo.veiculos.domain.enums.Tipo;
import com.controlefluxo.veiculos.repositories.OficinaRepository;
import com.controlefluxo.veiculos.repositories.SeguroRepository;
import com.controlefluxo.veiculos.repositories.TipoServicoRepository;
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
	private TipoServicoRepository tipoServicoRepository;
	

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);	
	}
	
	
	@Override
	public void run(String... args) throws Exception{

	
		Veiculo v1 = new Veiculo(null,"abc1234", "1988", "corsa", "gm");
		Veiculo v2 = new Veiculo(null,"abc4321", "2000", "palio", "fiat");
		Oficina of1 = new Oficina(null, "flamacar", Tipo.SEGURO);
		TipoServico t1 = new TipoServico(null, "1111", null, Tipo.PARTICULAR);
		TipoServico t2 = new TipoServico(null, "2222", "33333", Tipo.SEGURO);
		
		Seguro sg1 = new Seguro(null, "porto", "123132113");
		
		v1.getSeguros().addAll(Arrays.asList(sg1));
		v1.getOficinas().addAll(Arrays.asList(of1));
		v2.getOficinas().addAll(Arrays.asList(of1));
		
		of1.getVeiculos().addAll(Arrays.asList(v1));
		of1.getVeiculos().addAll(Arrays.asList(v2));
		
		sg1.getVeiculos().addAll(Arrays.asList(v1));
		
		t1.setVeiculos(v2);
		t2.setVeiculos(v1);
		
		
		v1.getTipoServicos().addAll(Arrays.asList(t2));
		v2.getTipoServicos().addAll(Arrays.asList(t1));
	
		seguroRepository.saveAll(Arrays.asList(sg1));
		veiculoRepository.saveAll(Arrays.asList(v1,v2));
		oficinaRepository.saveAll(Arrays.asList(of1));
		
		tipoServicoRepository.saveAll(Arrays.asList(t1,t2));
		
		
		
		
		
	}
}
