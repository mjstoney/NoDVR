package dev.mstoney.nodvr;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@SpringBootApplication
@RestController
public class NodvrApplication {

	public static void main(String[] args) {
		SpringApplication.run(NodvrApplication.class, args);
	}

	@RequestMapping("/")
	public String hello() {
		return "Hello from San Jose";
	}

}
