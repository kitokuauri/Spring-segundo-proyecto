package com.ejemplo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class EntrenadorBaloncesto implements Entrenador {
	
//	atributos
	@Value("${datos.email}")
	private String email;
	
	@Value("${datos.equipo}")
	private String equipo;
	
	private ExperienciaServicio experienciaServicio;
	
	@Autowired
	public void ejecutar2(ExperienciaServicio experienciaServicio) {
		System.out.println("ejecutar2");
		this.experienciaServicio = experienciaServicio;
	}
	
	public void setEmail(String email) {
		System.out.println("Inyección de un literal en un método setter: " + email);
		this.email = email;
	}

	public void setEquipo(String equipo) {
		System.out.println("Inyección de un literal en un método setter: " + equipo);
		this.equipo = equipo;
	}

	public String getEquipo() {
		// TODO Auto-generated method stub
		return equipo;
	}

	public String getEmail() {
		// TODO Auto-generated method stub
		return email;
	}
	
	

//	--------------------------------------------------------------------------------

	
	public int getExperienciaEntrenador() {
		// TODO Auto-generated method stub
		return 0;
	}


}


	