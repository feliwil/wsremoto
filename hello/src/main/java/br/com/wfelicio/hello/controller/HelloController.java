package br.com.wfelicio.hello.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController 
public class HelloController {
	
	@GetMapping("/helloworld")
	public String sayHello() {
		return "Hello World!!!Teste 2";
	}
}
