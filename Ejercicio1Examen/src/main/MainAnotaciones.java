package main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import modelo.entidad.Empleado;


public class MainAnotaciones {
	public static void main(String[] args) {
		ApplicationContext context = 
				new ClassPathXmlApplicationContext("recursos/context.xml");
		
		Empleado empleado1 = context.getBean("empleado", Empleado.class);
		System.out.println(empleado1);
		
		Empleado empleado2 = context.getBean("empleado", Empleado.class);
		
		empleado2.setNombre("Julian");
		System.out.println(empleado2);
	}
}
