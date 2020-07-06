package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
@CrossOrigin(origins = "http://localhost:4200")
public class JavaSampleProjectApplication {

	public static void main(String[] args) {
		SpringApplication.run(JavaSampleProjectApplication.class, args);
	}
	
	@RequestMapping("/")
	public String test()
	{
		return "Hello World";
	}
	
	@GetMapping("/getRequest")
	public String getRequest()
	{
		return " Working...";
	}

}
