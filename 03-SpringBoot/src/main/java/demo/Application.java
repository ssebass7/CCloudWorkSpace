package demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import demo.modelo.entidad.Persona;

// Estaclase de aqui va a ser nuestro punto de entrada de la aplicacion
//Esta anotacion de aqui carga todo el contexto de spring y autconfigura
//la aplicacion para funcionar
//
@SpringBootApplication
public class Application {

	public static ApplicationContext context = null;

	public static void main(String[] args) {
		context = SpringApplication.run(Application.class, args);
		
		Persona p = context.getBean("persona", Persona.class);
		p.setNombre("Harry Potter");
		System.out.println(p);
		
		Persona p2 = context.getBean("persona", Persona.class);
		p2.setNombre("Jose Potter");
		System.out.println(p2);
		
	}

}
