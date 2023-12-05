package com.ejemplo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Prueba {
	
	public Prueba(@Qualifier("entrenadorFutbol") Entrenador entrenador) {
		this.entrenador = entrenador;
		}

	@Autowired
//	Especifica qué bean se inyecta
	@Qualifier("entrenadorFutbol")
	private Entrenador entrenador;
	
	public int getExperienciaEntrenador() {
		return entrenador.getExperienciaEntrenador();
	}
	
}
