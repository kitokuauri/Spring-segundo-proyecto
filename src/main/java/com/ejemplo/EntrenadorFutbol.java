package com.ejemplo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class EntrenadorFutbol implements Entrenador {
	
//	Referencia al servicio
	@Autowired
	private ExperienciaServicio experienciaServicio;

//	Constructor con el servicio inyectado
//	INYECCION CON CONSTRUCTOR
	//@Autowired
	public EntrenadorFutbol(ExperienciaServicio experienciaServicio) {
		System.out.println("Inyección en el constructor");
		this.experienciaServicio = experienciaServicio;
		}
	
	@Autowired
	public void ejecutar1(ExperienciaServicio experienciaServicio) {
		System.out.println("ejecutar1");
		this.experienciaServicio = experienciaServicio;
	}
	
	@Override
	public int getExperienciaEntrenador() {
		// TODO Auto-generated method stub
		return this.experienciaServicio.getExperiencia();
	}
	
//	INYECCION CON METODO SETTER
	@Autowired
	public void setExperienciaServicio(ExperienciaServicio experienciaServicio) {
	System.out.println("Inyección en un método setter");
	this.experienciaServicio = experienciaServicio;
	}
	
//	---------------------------------------------------------------------------
	@Override
	public String getEmail() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getEquipo() {
		// TODO Auto-generated method stub
		return null;
	}

	
}