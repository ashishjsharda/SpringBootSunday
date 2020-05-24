package com.may24.practice;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class PracticeApplication implements ApplicationRunner {

	public static void main(String[] args) {
		SpringApplication.run(PracticeApplication.class, args);
	}

	@RequestMapping(value = "/")
	public String hello(){
		return "Hello Sunday";
	}

	@Override
	public void run(ApplicationArguments args) throws Exception {
		System.out.println("Inside Application runner");
	}
}
