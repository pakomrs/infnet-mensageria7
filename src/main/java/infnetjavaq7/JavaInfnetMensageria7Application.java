package infnetjavaq7;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class JavaInfnetMensageria7Application implements CommandLineRunner{

	@Autowired
	private JMSService service;
	
	public static void main(String[] args) {
		SpringApplication.run(JavaInfnetMensageria7Application.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		service.enviaJMS();
		
	}

}
