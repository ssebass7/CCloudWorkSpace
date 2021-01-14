package ejercicio2Examen;

import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ImportResource;

import ejercicio2Examen.entidad.Equipo;
import ejercicio2Examen.entidad.Jugador;

@SpringBootApplication
@ImportResource("classpath:objetosSpring.xml")
public class Ejercicio2ExamenApplication {

	public static ApplicationContext context;

	public static void main(String[] args) {
		context = SpringApplication.run(Ejercicio2ExamenApplication.class, args);
		//List<Jugador> lj = (List<Jugador>) context.getBean("listJugadores", Equipo.class);

		Equipo equipo1 = context.getBean("equipo1", Equipo.class);
		Equipo equipo2 = context.getBean("equipo2", Equipo.class);

		Jugador jugador1 = context.getBean("jugador1", Jugador.class);
		Jugador jugador2 = context.getBean("jugador2", Jugador.class);
		Jugador jugador3 = context.getBean("jugador3", Jugador.class);
		Jugador jugador4 = context.getBean("jugador4", Jugador.class);

		Equipo jugadores1 = context.getBean("arrayJugadoresE1", Equipo.class);
		Equipo jugadores2 = context.getBean("arrayJugadoresE2", Equipo.class);
		Equipo listJ = context.getBean("listJugadores", Equipo.class);
		
		//No supe acabar el array :(((((((((
//		lj.add(jugador1);
//		lj.add(jugador2);
//		equipo1.setListJugadores(lj);
//		System.out.println(equipo1);
//		lj.clear();
//		lj.add(jugador3);
//		lj.add(jugador4);
//		equipo2.setListJugadores(lj);
//		System.out.println(equipo2);

	}

}
