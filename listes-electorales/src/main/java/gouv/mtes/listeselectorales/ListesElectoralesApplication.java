package gouv.mtes.listeselectorales;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

@SpringBootApplication
public class ListesElectoralesApplication extends SpringBootServletInitializer {

	public static void main(String[] args) {
		SpringApplication.run(ListesElectoralesApplication.class, args);

	}

}
