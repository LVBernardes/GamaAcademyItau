package com.itau.hello.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.itau.hello.model.Produto;

@RestController
public class HelloController {
	
	@GetMapping("/hello")
	public String sayHello () {
		return "Início do Controller";
	}
	
	@GetMapping("/produto")
	public Produto exibirProduto() {
		Produto p = new Produto();
		p.setId(1);
		p.setNome("Produto Teste 1");
		p.setPreco(149.90);
		return p;
		
	}

}
