package com.example.consumingwebservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class ConsumingWebServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(ConsumingWebServiceApplication.class, args);
	}

	@Bean
	public String runTest(ConsultaCepWS consultaCepWS) {
		String endereco = consultaCepWS.getEndereco("12227570");
		System.out.println(endereco);
		return endereco;
	}

}
