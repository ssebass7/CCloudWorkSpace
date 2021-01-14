package pruebaCrear;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ImportResource;

import pruebaCrear.entidad.Autor;
import pruebaCrear.entidad.Email;
import pruebaCrear.entidad.Libro;

@SpringBootApplication
@ImportResource("classpath:objetosSpring.xml")
public class PruebaCrearApplication {

	public static ApplicationContext context;
	
	public static void main(String[] args) {
		context = SpringApplication.run(PruebaCrearApplication.class, args);
	
		Email email = context.getBean("email",Email.class);
		
		Email otroEmailDistinto = context.getBean("email",Email.class);
	
		Email email1 = context.getBean("email1",Email.class);
		System.out.println(email1.getId());
		email1.setId(67);
		
		Email elMismoMalditoEmailQueAntes = context.getBean("email1",Email.class);
		System.out.println(elMismoMalditoEmailQueAntes.getId());
		
		Libro libro = context.getBean("libro",Libro.class);
		
		Libro otroLibro = new Libro();
		Autor otroAutor = new Autor();
		otroLibro.setAutor(otroAutor);
		
		System.out.println(libro);
	
	}

}
