package com.otraCochera.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.otraCochera.demo.domain.Saludo;
import com.otraCochera.demo.repo.RepoSaludo;

@RestController
@RequestMapping
public class SaludoController {

	@Autowired
	RepoSaludo repoSaludo;

	@GetMapping("/")
	String saludo() {
		return "Hola, te saludo si pones: /saludo/TU-NOMRE adelante de la url";
	}

	@GetMapping("/saludo/{nombre}")
	String saludo(@PathVariable String nombre) {
		return "Hola " + nombre;
	}

	@GetMapping("/crearSaludo/{saludo}")
	String crearSaludo(@PathVariable String saludo) {
		repoSaludo.crear(new Saludo(saludo));
		return "Saludo: " + saludo + "creado con exito.";
	}
}
