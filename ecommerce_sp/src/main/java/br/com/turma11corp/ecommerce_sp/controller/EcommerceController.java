package br.com.turma11corp.ecommerce_sp.controller;

import javax.swing.JOptionPane;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EcommerceController {

	@GetMapping ("/boasvindas")
	public String sayWelcome () {
		return "Boas Vindas!";
	}

	@GetMapping("/teste")
	public String sayTest () {
		return "Teste de mensagem!";
	}


	
}


