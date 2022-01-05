package com.controlefluxo.veiculos;


import java.text.SimpleDateFormat;
import java.util.Arrays;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.web.bind.annotation.RestController;
import com.controlefluxo.veiculos.domain.Client;
import com.controlefluxo.veiculos.domain.Workshop;
import com.controlefluxo.veiculos.domain.Safe;
import com.controlefluxo.veiculos.domain.User;
import com.controlefluxo.veiculos.domain.Work;
import com.controlefluxo.veiculos.domain.Car;
import com.controlefluxo.veiculos.domain.enums.Supply;
import com.controlefluxo.veiculos.domain.enums.Status;
import com.controlefluxo.veiculos.domain.enums.Type;
import com.controlefluxo.veiculos.repositories.ClientRepository;
import com.controlefluxo.veiculos.repositories.WorkshopRepository;
import com.controlefluxo.veiculos.repositories.SafeRepository;
import com.controlefluxo.veiculos.repositories.UserRepository;
import com.controlefluxo.veiculos.repositories.WorkRepository;
import com.controlefluxo.veiculos.repositories.CarRepository;

@RestController
@SpringBootApplication
public class Application implements CommandLineRunner{

	@Autowired
	private CarRepository carRepository;
	
	@Autowired
	private WorkshopRepository workshopRepository;
	
	@Autowired
	private SafeRepository safeRepository;
	
	@Autowired
	private WorkRepository WorkRepository;
	
	@Autowired
	private ClientRepository clientRepository;
	
	@Autowired
	private UserRepository userRepository;
	
	@Autowired
	private BCryptPasswordEncoder pe;
	
	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);	
	}
	
	
	@Override
	public void run(String... args) throws Exception{

	
	
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		
		
		
		Car v1 = new Car(null,"abc1234", "1988", "corsa", "gm" , "wind" );
		Car v2 = new Car(null,"sed2547", "2000", "palio", "fiat", "fire");
		Car v3 = new Car(null,"teg7845", "1999", "gol", "vw", "1000");
		Car v4 = new Car(null,"oeb7894", "2010", "uno", "fiat", "fire");
		Car v5 = new Car(null,"lro4812", "2011", "prisma", "gm" , "joy");
		Car v6 = new Car(null,"rqf8364", "2001", "ka", "ford", "zotac");
		Car v7 = new Car(null,"beg094", "2004", "207", "peugeot", "prime");
		Car v8 = new Car(null,"uen4231", "2012", "versa", "nissan", "1.8");
		Car v9 = new Car(null,"oen8634", "2014", "strada", "fiat", "1.6");
		Car v10 = new Car(null,"peo9473", "2020", "bmw", "bmw", "prime");
		
		Workshop of1 = new Workshop(null, "flamacar");
		Workshop of2 = new Workshop(null, "coronato");
		
		User u1 = new User(null, "Regina", "3865415154", "678565564", "regi1", pe.encode("1234"), of1);
		User u2 = new User(null, "marcos", "365417852", "98547561", "marcos1", pe.encode("4321"), of2);
		
		Client c1 = new Client(null, "gil", "santana", "37049612804", "425274457", "gil@gmail.com");
		c1.getTelephone().addAll(Arrays.asList("27363323", "93838393"));
		
		Client c2 = new Client(null, "ramom", "souza", "64736488326", "382977365", "ramom@gmail.com");
		c2.getTelephone().addAll(Arrays.asList("2424-5332", "98473-9283"));
		
		Client c3 = new Client(null, "julio", "fernandes", "7845814587", "45218694", "julio@gmail.com");
		c3.getTelephone().addAll(Arrays.asList("4635-6253", "93838-3930"));
		
		Client c4 = new Client(null, "paula", "souza", "874515588", "985647874", "paula@gmail.com");
		c4.getTelephone().addAll(Arrays.asList("93847-6254", "93876-5142"));
		
		Client c5 = new Client(null, "rodolfo", "pereira", "755589556", "489656548", "rodolfo@gmail.com");
		c5.getTelephone().addAll(Arrays.asList("5635-4747", "90847-3732"));
		
		Client c6 = new Client(null, "carlos", "soares", "156489665", "5151665484", "carlos@gmail.com");
		c6.getTelephone().addAll(Arrays.asList("3524-5635", "97365-4142"));
		
		Client c7 = new Client(null, "kelly", "costa", "525658295", "844651566", "kelly@gmail.com");
		c7.getTelephone().addAll(Arrays.asList("3425-4345", "98237-9263"));
		
		Client c8 = new Client(null, "eduardo", "cantão", "84525466221", "362458715", "eduardo@gmail.com");
		c8.getTelephone().addAll(Arrays.asList("4635-7263", "98473-2324"));
		
		Work t1 = new Work(null, "3254825", null, Type.PARTICLE,sdf.parse("10/06/2021"),sdf.parse("11/06/2021"),sdf.parse("13/06/2021"),sdf.parse("13/06/2021"),null,Status.DELIVERED,null,Supply.WORKSHOP,v1,c1);
		Work t2 = new Work(null, "2547878", "582154", Type.SAFE,sdf.parse("08/06/2021"),sdf.parse("10/06/2021"),sdf.parse("16/06/2021"),sdf.parse("30/06/2021"),sdf.parse("25/07/2021"),Status.RETURN,null,Supply.WORKSHOP,v2,c2);
		Work t3 = new Work(null, "7845892", null, Type.SAFE_PARTICLE,sdf.parse("02/06/2021"),sdf.parse("03/06/2021"),sdf.parse("05/06/2021"),sdf.parse("25/06/2021"),null,Status.DELIVERED,null,Supply.WORKSHOP_SAFE,v3,c3);
		Work t4 = new Work(null, "9854758", "585426", Type.SAFE,sdf.parse("15/06/2021"),sdf.parse("16/06/2021"),sdf.parse("20/06/2021"),sdf.parse("15/07/2021"),null,Status.DELIVERED,null,Supply.WORKSHOP,v4, c4);
		Work t5 = new Work(null, "9847856", null, Type.PARTICLE,sdf.parse("10/07/2021"),sdf.parse("12/07/2021"),sdf.parse("16/07/2021"),null,null,Status.PAINTING,null,Supply.WORKSHOP,v5, c5);
		Work t6 = new Work(null, "3621458", "584741", Type.SAFE_PARTICLE,sdf.parse("09/08/2021"),sdf.parse("10/09/2021"),sdf.parse("13/09/2021"),null,null,Status.TUBE,null,Supply.SAFE,v6, c6);
		Work t7 = new Work(null, "3652485", null, Type.PARTICLE,sdf.parse("16/09/2021"),sdf.parse("18/09/2021"),sdf.parse("27/09/2021"),null,null,Status.DISASSEMBLY,null,Supply.WORKSHOP,v7 , c7);
		Work t8 = new Work(null, "3621858", "968471", Type.SAFE,sdf.parse("21/10/2021"),sdf.parse("25/10/2021"),sdf.parse("26/10/2021"),null,null,Status.DELIVERED,null,Supply.WORKSHOP_SAFE,v8 , c8);
		Work t9 = new Work(null, "3625148", null, Type.PARTICLE,sdf.parse("18/10/2021"),null,null,null,null,Status.RELEASED,null,null,v9 , c1);
		Work t10 = new Work(null,"6528499", "362481", Type.SAFE,sdf.parse("19/10/2021"),null,null,null,null,Status.RELEASED,null,null,v10 , c2);
		Work t11 = new Work(null, "3254887", null, Type.SAFE,sdf.parse("10/09/2021"),sdf.parse("11/09/2021"),sdf.parse("13/10/2021"),sdf.parse("13/10/2021"),null,Status.RELEASED,null,Supply.WORKSHOP,v1 , c3);
		
		Safe sg1 = new Safe(null, "porto");
		
		c1.getWork().addAll(Arrays.asList(t1, t9));
		c2.getWork().addAll(Arrays.asList(t2, t10));
		c3.getWork().addAll(Arrays.asList(t3));
		c4.getWork().addAll(Arrays.asList(t4));
		c5.getWork().addAll(Arrays.asList(t5));
		c6.getWork().addAll(Arrays.asList(t6));
		c7.getWork().addAll(Arrays.asList(t7));
		c8.getWork().addAll(Arrays.asList(t8));
		
		
		v1.getWork().addAll(Arrays.asList(t1,t11));
		v2.getWork().addAll(Arrays.asList(t2));
		v3.getWork().addAll(Arrays.asList(t3));
		v4.getWork().addAll(Arrays.asList(t4));
		v5.getWork().addAll(Arrays.asList(t5));
		v6.getWork().addAll(Arrays.asList(t6));
		v7.getWork().addAll(Arrays.asList(t7));
		v8.getWork().addAll(Arrays.asList(t8));
		v9.getWork().addAll(Arrays.asList(t9));
		v10.getWork().addAll(Arrays.asList(t10));
		
		of1.getWork().addAll(Arrays.asList(t1,t2,t3,t4,t6,t7,t8,t9,t10));
		of1.getWork().addAll(Arrays.asList(t5,t11));
		
		of1.getUser().addAll(Arrays.asList(u1));
		of2.getUser().addAll(Arrays.asList(u2));
		
		sg1.getWork().addAll(Arrays.asList(t1,t2,t3,t4,t5,t6,t7,t8,t9,t10,t11));
		
		t1.setWorkshop(of1);
		t2.setWorkshop(of1);
		t3.setWorkshop(of1);
		t4.setWorkshop(of1);
		t5.setWorkshop(of2);
		t6.setWorkshop(of1);
		t7.setWorkshop(of1);
		t8.setWorkshop(of1);
		t9.setWorkshop(of1);
		t10.setWorkshop(of1);
		t11.setWorkshop(of2);
		
		t1.setSafe(sg1);
		t2.setSafe(sg1);
		t3.setSafe(sg1);
		t4.setSafe(sg1);
		t5.setSafe(sg1);
		t6.setSafe(sg1);
		t7.setSafe(sg1);
		t8.setSafe(sg1);
		t9.setSafe(sg1);
		t10.setSafe(sg1);
		t11.setSafe(sg1);
		
		
		clientRepository.saveAll(Arrays.asList(c1,c2,c3,c4,c5,c6,c7,c8));
		safeRepository.saveAll(Arrays.asList(sg1));
		carRepository.saveAll(Arrays.asList(v1,v2,v3,v4,v5,v6,v7,v8,v9,v10));
		workshopRepository.saveAll(Arrays.asList(of1,of2));
	    WorkRepository.saveAll(Arrays.asList(t1,t2,t3,t4,t5,t6,t7,t8,t9,t10,t11));
		userRepository.saveAll(Arrays.asList(u1,u2));
	   
		
		
		
	}
}
