package io.github.crudigor.todo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@SpringBootApplication
@RequestMapping
public class TodoApplication {
	
	@GetMapping("/")
	public String hello() {
		return "hello word";
	}
	
	public static void main(String[] args) {
		SpringApplication.run(TodoApplication.class, args);
	}

}
