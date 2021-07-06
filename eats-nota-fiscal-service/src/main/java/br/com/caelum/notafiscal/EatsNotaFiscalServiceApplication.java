package br.com.caelum.notafiscal;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@EnableFeignClients
@SpringBootApplication
public class EatsNotaFiscalServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(EatsNotaFiscalServiceApplication.class, args);
	}

}
