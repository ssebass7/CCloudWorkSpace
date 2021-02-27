package game;

import java.util.ArrayList;
import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainPrincipal {
	private static ApplicationContext context = new ClassPathXmlApplicationContext("recursos/context.xml");

	public static void main(String[] args) {

		Personaje G1 = context.getBean("guerrero", Guerrero.class);
		Personaje C1 = context.getBean("curandero", Curandero.class);
		Personaje M1 = context.getBean("mago", Mago.class);
		Arma e1 = context.getBean("espada", Arma.class);
		Arma e2 = context.getBean("rezo", Arma.class);
		Arma e3 = context.getBean("arco", Arma.class);

		G1.setNombre("Felix");
		G1.setNivel(5);
		G1.setSalud(200);
		G1.setIniciativa(5);
		G1.setArma(e1);
		e1.setDa�omaximo(20);
		e1.setDa�oMinimo(5);

		C1.setNombre("Jose Antonio");
		C1.setNivel(5);
		C1.setSalud(200);
		C1.setIniciativa(5);
		C1.setArma(e2);
		e2.setDa�omaximo(20);
		e2.setDa�oMinimo(5);
		Curandero H1 = (Curandero) C1;
		H1.setSabiduria(5);

		List<Personaje> listaPersonajes = new ArrayList<Personaje>();
		listaPersonajes.add(G1);
		listaPersonajes.add(C1);
		listaPersonajes.add(M1);

		int contrincante1 = Util.generadornumeros(0, 3);
		int contrincante2 = 0;
		do {
			contrincante2 = Util.generadornumeros(0, 3);
		} while (contrincante1 == contrincante2);

		Personaje luchador1 = listaPersonajes.get(contrincante1);
		Personaje luchador2 = listaPersonajes.get(contrincante2);

		Arena combate = new Arena(G1, C1);

		Personaje Ganador = combate.combate();
		System.out.println("Ganador es: " + Ganador.getNombre());

	}

}
