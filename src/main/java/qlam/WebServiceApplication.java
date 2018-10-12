package qlam;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;import org.springframework.web.context.WebApplicationContext;

@SpringBootApplication(scanBasePackages=("qlam"))
public class WebServiceApplication {
	public static void main(String[] args) {
		SpringApplication.run(WebServiceApplication.class, args);
	}
}
