package springangularjs.springangularjs;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import springangularjs.springangularjs.entities.Operadora;
import springangularjs.springangularjs.entities.Server;
import springangularjs.springangularjs.repositories.OperadoraRepository;
import springangularjs.springangularjs.repositories.ServerRepository;

@SpringBootApplication
public class SpringAngularjsApplication  implements CommandLineRunner {

	@Autowired
	private OperadoraRepository operadoraRepository;

	@Autowired
	private ServerRepository serverRepository;

	public static void main(String[] args) {
		SpringApplication.run(SpringAngularjsApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub

//		serverRepository.save(new Server(null, "Server 1"));
//		serverRepository.save(new Server(null, "Server 2"));

//		operadoraRepository.save(new Operadora("Oi","14","Celular","2"));
//		operadoraRepository.save(new Operadora("Vivo","15","Celular","1"));
//		operadoraRepository.save(new Operadora("Tim","41","Celular","3"));

	}
}
