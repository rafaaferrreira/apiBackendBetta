package br.com.projeto.betta.apiBackendBetta;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@SpringBootApplication
@EntityScan({"br.com.projeto.betta.entity"})
@EnableJpaRepositories({"br.com.projeto.betta.repository"})
@ComponentScan(basePackages = { "br.com.projeto.betta.*" })
@EnableWebMvc
public class ApiBackendBettaApplication {

	public static void main(String[] args) {
		SpringApplication.run(ApiBackendBettaApplication.class, args);
	}
}
