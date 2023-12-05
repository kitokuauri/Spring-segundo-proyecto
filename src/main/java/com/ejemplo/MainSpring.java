package com.ejemplo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainSpring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		abre el contexto a partir del archivo de configuración
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		Entrenador entrenadorF = context.getBean("entrenadorFutbol", Entrenador.class);
		Entrenador entrenadorB = context.getBean("entrenadorBaloncesto", Entrenador.class);
		
		System.out.println(entrenadorF.getExperienciaEntrenador());
		
//		Inyección de valores literales
		System.out.println(entrenadorB.getEmail());
		System.out.println(entrenadorB.getEquipo());
		
		// cierra el contexto
		context.close();
		
	}

}
