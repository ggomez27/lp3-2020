package py.edu.uc.lp3;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@ComponentScan(basePackages = {"py.ed.uc.lp3.tp"})
@EnableJpaRepositories(basePackages = {"py.ed.uc.lp3.tp"})
@EntityScan(basePackages = {"py.ed.uc.lp3.tp"})
public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}
}
