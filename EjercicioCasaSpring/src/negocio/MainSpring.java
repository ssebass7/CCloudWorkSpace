package negocio;



import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import entidad.Persona;

public class MainSpring {

	// Tendremos que guardar una refernencia al contexto
	// de Spring

	public static ApplicationContext context = null;

	public static void main(String[] args) {
		context = new ClassPathXmlApplicationContext("recursos/context.xml");

		Persona p1 = (Persona) context.getBean("persona1");

		p1.setNombre("Harry");
		p1.setEdad(20);
		p1.setPeso(76.6);

		// p1 = null;

		cambiarNombre("Hermione");

		Persona p2 = new Persona();

		// p2 = null;

		p2 = p1;
		System.out.println(p2.getNombre());

		p1 = context.getBean("persona2", Persona.class);// Tambien vale para castear
		System.out.println(p1);
		Persona p3 = context.getBean("personaPrototype", Persona.class);
		System.out.println(p3);
		p3.setEdad(45);
		p3.setNombre("Gandalf");
		
		List<Persona> lp = context.getBean("listaPersonas",List.class);
		lp.add(p3);	
		
		p3 = context.getBean("persona3",Persona.class);
		System.out.println(p3);
		
		p3 = context.getBean("persona4",Persona.class);
		System.out.println(p3);
	
	
	}

	public static void cambiarNombre(String nombre) {
		Persona p1 = (Persona) context.getBean("persona1");
		p1.setNombre(nombre);
	}

}
