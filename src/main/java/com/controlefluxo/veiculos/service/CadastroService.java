package com.controlefluxo.veiculos.service;

import java.text.ParseException;
import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.controlefluxo.veiculos.domain.Cliente;
import com.controlefluxo.veiculos.domain.Oficina;
import com.controlefluxo.veiculos.domain.Seguro;
import com.controlefluxo.veiculos.domain.Servico;
import com.controlefluxo.veiculos.domain.Veiculo;
import com.controlefluxo.veiculos.domain.dto.CadastroDTO;
import com.controlefluxo.veiculos.repositories.ClienteRepository;
import com.controlefluxo.veiculos.repositories.OficinaRepository;
import com.controlefluxo.veiculos.repositories.SeguroRepository;
import com.controlefluxo.veiculos.repositories.ServicoRepository;
import com.controlefluxo.veiculos.repositories.VeiculoRepository;

@Service
public class CadastroService {

	@Autowired
	public VeiculoRepository veiculo;

	@Autowired
	public ClienteRepository cliente;

	@Autowired
	public ServicoRepository servico;

	@Autowired
	public OficinaRepository oficina;

	@Autowired
	public SeguroRepository seguro;
	
	

	public Veiculo insert(CadastroDTO cadastro) throws ParseException {
	
		Veiculo v1 = new Veiculo(null, cadastro.getPlaca(), cadastro.getAno(), cadastro.getNomeVeiculo(),
				cadastro.getMarca(), cadastro.getModelo());
		
		Oficina of1 = new Oficina(cadastro.getIdOficina(), cadastro.getNomeOficina());

		Cliente c1 = new Cliente(null, cadastro.getNome(), cadastro.getSobrenome(), cadastro.getCpf(), cadastro.getRg(),
				cadastro.getEmail());
		c1.getTelefones()
				.addAll(Arrays.asList(cadastro.getTelefone1(), cadastro.getTelefone2(), cadastro.getTelefone3()));

		Servico t1 = new Servico(null, cadastro.getCodigoParticular(), cadastro.getSinistro(), cadastro.getTipo(),
				cadastro.getPrevisaoDeEntrada(), cadastro.getEntrada(), cadastro.getPrevisaoDeEntrega(),
				cadastro.getEntrega(), cadastro.getEntregaRetorno(), cadastro.getStatus(), cadastro.getObs(),
				cadastro.getForn(), v1, c1);

		Seguro sg1 = new Seguro(cadastro.getIdSeguro(), cadastro.getNomeSeguro());
		
		of1.getServicos().addAll(Arrays.asList(t1));
		sg1.getServicos().addAll(Arrays.asList(t1));

		c1.getServicos().addAll(Arrays.asList(t1));
		v1.getServico().addAll(Arrays.asList(t1));
		
		t1.setOficina(of1);
		t1.setSeguro(sg1);

		cliente.saveAll(Arrays.asList(c1));
		 seguro.saveAll(Arrays.asList(sg1));
		veiculo.saveAll(Arrays.asList(v1));
		 oficina.saveAll(Arrays.asList(of1));
		servico.saveAll(Arrays.asList(t1));

		return v1;
	}

	public Veiculo update(CadastroDTO cadastro) throws ParseException {

		
		Veiculo v1 = new Veiculo(cadastro.getIdVeiculo(), cadastro.getPlaca(), cadastro.getAno(),
				cadastro.getNomeVeiculo(), cadastro.getMarca(), cadastro.getModelo());
		v1.setId(cadastro.getIdVeiculo());
		
		// Oficina statica apenas para teste
		Oficina of1 = new Oficina(cadastro.getIdOficina(), cadastro.getNomeOficina());

		Cliente c1 = new Cliente(cadastro.getIdCliente(), cadastro.getNome(), cadastro.getSobrenome(),
				cadastro.getCpf(), cadastro.getRg(), cadastro.getEmail());
		c1.getTelefones()
				.addAll(Arrays.asList(cadastro.getTelefone1(), cadastro.getTelefone2(), cadastro.getTelefone3()));

		Servico t1 = new Servico(cadastro.getIdServico(), cadastro.getCodigoParticular(), cadastro.getSinistro(),
				cadastro.getTipo(), cadastro.getPrevisaoDeEntrada(), cadastro.getEntrada(),
				cadastro.getPrevisaoDeEntrega(), cadastro.getEntrega(), cadastro.getEntregaRetorno(),
				cadastro.getStatus(), cadastro.getObs(), cadastro.getForn(), v1, c1);

		// Seguro teste
		Seguro sg1 = new Seguro(cadastro.getIdSeguro(), cadastro.getNomeSeguro());

		of1.getServicos().addAll(Arrays.asList(t1));
		sg1.getServicos().addAll(Arrays.asList(t1));

		c1.getServicos().addAll(Arrays.asList(t1));
		v1.getServico().addAll(Arrays.asList(t1));
		
		t1.setOficina(of1);
		t1.setSeguro(sg1);
		

		cliente.save(c1);
		seguro.save(sg1);
		veiculo.save(v1);
		oficina.save(of1);
		servico.save(t1);

		return v1;
	}
}
