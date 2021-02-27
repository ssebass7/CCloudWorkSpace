package game;

import java.util.Scanner;

import org.springframework.beans.factory.annotation.Autowired;

public class Arena {
	@Autowired
	private Personaje p1;
	@Autowired
	private Personaje p2;

	public Arena(Personaje p1, Personaje p2) {
		this.p1 = p1;
		this.p2 = p2;

	}

	public Personaje combate() {
		Personaje ganador = null;
		boolean acabado = false;

		Personaje pi = null;
		Personaje pf = null;
		if (p1.getIniciativa() >= p2.getIniciativa()) {
			pi = p1;
			pf = p2;

		} else {
			pi = p2;
			pf = p1;
		}

		System.out.println("inicia combate " + pi.getNombre());

		Scanner sc = new Scanner(System.in);

		do {

			pi.atacar(pf);
			if (pf.getSalud() <= 0) {

				return pi;

			}
			pf.atacar(pi);

			if (pi.getSalud() <= 0) {

				return pf;

			}

			System.out.println("puntos de vida de  " + pi.getNombre());
			System.out.println(pi.getSalud());
			System.out.println("puntos de vida de  " + pf.getNombre());
			System.out.println(pf.getSalud());

			System.out.println("Siguiente turno Pulse: 'ENTER'");
			System.out.println();
			sc.nextLine();
		} while (true);

	}

}
