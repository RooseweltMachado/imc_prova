package com.example.demo;

import javax.websocket.server.PathParam;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import org.springframework.web.bind.annotation.RestController;

@RestController
public class TodoController {
	
	@GetMapping("/imc/{altura}/{peso}")
	public String calculoIMC(@PathVariable ("altura") double altura, @PathVariable ("peso") double peso){
		double imc = peso / (altura * altura);
		
		if(imc < 18.5) {
			return "Seu IMC " + imc + "\n Classificação: Abaixo do peso" + "\n Risco para a saúde: Elevado";
		}
		if(imc > 18.5 && imc < 24.99) {
			return "Seu IMC " + imc + "\n Classificação: Peso ideal" + "\n Risco para a saúde: Inexistente";
		}
		if(imc > 25 && imc < 29.99) {
			return "Seu IMC " + imc + "\n Classificação: Excesso de peso" + "\n Risco para a saúde: Elevado";
		}
		if(imc > 30 && imc < 34.99) {
			return "Seu IMC " + imc + "\n Classificação: Obesidade Grau 1" + "\n Risco para a saúde: Muito Elevado";
		}
		if(imc > 35 && imc < 39.99) {
			return "Seu IMC " + imc + "\n Classificação: Obesidade Grau 2" + "\n Risco para a saúde: Muitíssimo Elevado";
		}
		if(imc > 40) {
			return "Seu IMC " + imc + "\n Classificação: Obesidade Grau 3" + "\n Risco para a saúde: Obesidade Mórbida";
		}
		return "error";
	}
}
