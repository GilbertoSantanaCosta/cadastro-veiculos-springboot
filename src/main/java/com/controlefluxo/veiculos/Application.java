package com.controlefluxo.veiculos;


import java.text.SimpleDateFormat;
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
import com.controlefluxo.veiculos.domain.enums.Fornecimento;
import com.controlefluxo.veiculos.domain.enums.Status;
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

	
	
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		
		Veiculo v1 = new Veiculo(null,"abc1234", "1988", "corsa", "gm");
		Veiculo v2 = new Veiculo(null,"sed2547", "2000", "palio", "fiat");
		Veiculo v3 = new Veiculo(null,"teg7845", "1999", "gol", "vw");
		Veiculo v4 = new Veiculo(null,"oeb7894", "2010", "uno", "fiat");
		Veiculo v5 = new Veiculo(null,"lro4812", "2011", "prisma", "gm");
		Veiculo v6 = new Veiculo(null,"rqf8364", "2001", "ka", "ford");
		Veiculo v7 = new Veiculo(null,"beg094", "2004", "207", "peugeot");
		Veiculo v8 = new Veiculo(null,"uen4231", "2012", "versa", "nissan");
		Veiculo v9 = new Veiculo(null,"oen8634", "2014", "strada", "fiat");
		Veiculo v10 = new Veiculo(null,"peo9473", "2020", "bmw", "bmw");
		
		Oficina of1 = new Oficina(null, "flamacar");
		
		Servico t1 = new Servico(null, "3254825", null, Tipo.PARTICULAR,sdf.parse("10/06/2021"),sdf.parse("11/06/2021"),sdf.parse("13/06/2021"),sdf.parse("13/06/2021"),null,Status.ENTREGUE,null,Fornecimento.OFICINA,v1);
		Servico t2 = new Servico(null, "2547878", "582154", Tipo.SEGURO,sdf.parse("08/06/2021"),sdf.parse("10/06/2021"),sdf.parse("16/06/2021"),sdf.parse("30/06/2021"),sdf.parse("25/07/2021"),Status.RETORNO,null,Fornecimento.OFICINA,v2);
		Servico t3 = new Servico(null, "7845892", null, Tipo.SEG_PART,sdf.parse("02/06/2021"),sdf.parse("03/06/2021"),sdf.parse("05/06/2021"),sdf.parse("25/06/2021"),null,Status.ENTREGUE,null,Fornecimento.OFIC_SEG,v3);
		Servico t4 = new Servico(null, "9854758", "585426", Tipo.SEGURO,sdf.parse("15/06/2021"),sdf.parse("16/06/2021"),sdf.parse("20/06/2021"),sdf.parse("15/07/2021"),null,Status.ENTREGUE,null,Fornecimento.OFICINA,v4);
		Servico t5 = new Servico(null, "9847856", null, Tipo.PARTICULAR,sdf.parse("10/07/2021"),sdf.parse("12/07/2021"),sdf.parse("16/07/2021"),null,null,Status.PINTURA,null,Fornecimento.OFICINA,v5);
		Servico t6 = new Servico(null, "3621458", "584741", Tipo.SEG_PART,sdf.parse("09/08/2021"),sdf.parse("10/09/2021"),sdf.parse("13/09/2021"),null,null,Status.FUNILARIA,null,Fornecimento.SEGURO,v6);
		Servico t7 = new Servico(null, "3652485", null, Tipo.PARTICULAR,sdf.parse("16/09/2021"),sdf.parse("18/09/2021"),sdf.parse("27/09/2021"),null,null,Status.MONTAGEM,null,Fornecimento.OFICINA,v7);
		Servico t8 = new Servico(null, "3621458", "968471", Tipo.SEGURO,sdf.parse("21/10/2021"),sdf.parse("25/10/2021"),sdf.parse("26/10/2021"),null,null,Status.DESMONTAGEM,null,Fornecimento.OFIC_SEG,v8);
		Servico t9 = new Servico(null, "3625148", null, Tipo.PARTICULAR,sdf.parse("18/10/2021"),null,null,null,null,Status.LIBERADO,null,null,v9);
		Servico t10 = new Servico(null,"6528499", "362481", Tipo.SEGURO,sdf.parse("19/10/2021"),null,null,null,null,Status.LIBERADO,null,null,v10);
		Servico t11 = new Servico(null, "3254825", null, Tipo.SEGURO,sdf.parse("10/09/2021"),sdf.parse("11/09/2021"),sdf.parse("13/10/2021"),sdf.parse("13/10/2021"),null,Status.ENTREGUE,null,Fornecimento.OFICINA,v1);
		
		
		Cliente c1 = new Cliente(null, "gil", "santana", "37049612804", "425274457");
		Cliente c2 = new Cliente(null, "ramom", "souza", "64736488326", "382977365");
		Cliente c3 = new Cliente(null, "julio", "fernandes", "7845814587", "45218694");
		Cliente c4 = new Cliente(null, "paula", "souza", "874515588", "985647874");
		Cliente c5 = new Cliente(null, "rodolfo", "pereira", "755589556", "489656548");
		Cliente c6 = new Cliente(null, "carlos", "soares", "156489665", "5151665484");
		Cliente c7 = new Cliente(null, "kelly", "costa", "525658295", "844651566");
		Cliente c8 = new Cliente(null, "eduardo", "cantão", "84525466221", "362458715");
		
		
		Seguro sg1 = new Seguro(null, "porto", "123132113");
		
	
		
		
		c1.getVeiculos().addAll(Arrays.asList(v1, v7));
		c2.getVeiculos().addAll(Arrays.asList(v2, v8));
		c3.getVeiculos().addAll(Arrays.asList(v3));
		c4.getVeiculos().addAll(Arrays.asList(v4));
		c5.getVeiculos().addAll(Arrays.asList(v5));
		c6.getVeiculos().addAll(Arrays.asList(v6));
		c7.getVeiculos().addAll(Arrays.asList(v9));
		c8.getVeiculos().addAll(Arrays.asList(v10));
		
		
		v2.getSeguros().addAll(Arrays.asList(sg1));
		v3.getSeguros().addAll(Arrays.asList(sg1));
		v4.getSeguros().addAll(Arrays.asList(sg1));
		v6.getSeguros().addAll(Arrays.asList(sg1));
		v8.getSeguros().addAll(Arrays.asList(sg1));
		v10.getSeguros().addAll(Arrays.asList(sg1));
		
		
		
		v1.getOficinas().addAll(Arrays.asList(of1));
		v2.getOficinas().addAll(Arrays.asList(of1));
		v3.getOficinas().addAll(Arrays.asList(of1));
		v4.getOficinas().addAll(Arrays.asList(of1));
		v5.getOficinas().addAll(Arrays.asList(of1));
		v6.getOficinas().addAll(Arrays.asList(of1));
		v7.getOficinas().addAll(Arrays.asList(of1));
		v8.getOficinas().addAll(Arrays.asList(of1));
		v9.getOficinas().addAll(Arrays.asList(of1));
		v10.getOficinas().addAll(Arrays.asList(of1));
	
		v1.setClientes(c1);
		v2.setClientes(c2);
		v3.setClientes(c3);
		v4.setClientes(c4);
		v5.setClientes(c5);
		v6.setClientes(c6);
		v7.setClientes(c1);
		v8.setClientes(c2);
		v9.setClientes(c7);
		v10.setClientes(c8);
		
		v1.getServico().addAll(Arrays.asList(t1,t11));
		v2.getServico().addAll(Arrays.asList(t2));
		v3.getServico().addAll(Arrays.asList(t3));
		v4.getServico().addAll(Arrays.asList(t4));
		v5.getServico().addAll(Arrays.asList(t5));
		v6.getServico().addAll(Arrays.asList(t6));
		v7.getServico().addAll(Arrays.asList(t7));
		v8.getServico().addAll(Arrays.asList(t8));
		v9.getServico().addAll(Arrays.asList(t9));
		v10.getServico().addAll(Arrays.asList(t10));
		
		of1.getVeiculos().addAll(Arrays.asList(v1,v2,v3,v4,v5,v6,v7,v8,v9,v10));
		
		
		sg1.getVeiculos().addAll(Arrays.asList(v2,v3,v4,v6,v8,v10));
		
		
	
		
		clienteRepository.saveAll(Arrays.asList(c1,c2,c3,c4,c5,c6,c7,c8));
		seguroRepository.saveAll(Arrays.asList(sg1));
		veiculoRepository.saveAll(Arrays.asList(v1,v2,v3,v4,v5,v6,v7,v8,v9,v10));
		oficinaRepository.saveAll(Arrays.asList(of1));
		
	    ServicoRepository.saveAll(Arrays.asList(t1,t2,t3,t4,t5,t6,t7,t8,t9,t10,t11));
		
	   
		
		
		
	}
}
