package com.otraCochera.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping
public class SaludoController {

	@GetMapping("/")
	String saludo() {
		return "Hola, te saludo si pones: /saludo/TU-NOMRE adelante de la url";
	}

	@GetMapping("/saludo/{nombre}")
	String saludo(@PathVariable String nombre) {
		return "Hola " + nombre;
	}
}
