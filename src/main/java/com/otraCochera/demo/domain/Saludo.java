package com.otraCochera.demo.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
@SuppressWarnings("all")
public class Saludo {
	@Id
	@Column(unique = true, nullable = false)
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	int id;

	@Column(length = 50)
	String mensaje;

	public Saludo(String _mensaje) {
		mensaje = _mensaje;
	}

}
