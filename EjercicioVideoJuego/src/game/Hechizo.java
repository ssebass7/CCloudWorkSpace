package game;

import org.springframework.stereotype.Component;

@Component
public class Hechizo extends Arma {
	private int probabilidadMagiaCaotica;

	@Override
	public int usar() {
		int daņoGeneral = super.usar();

		int numeroAleatorio = Util.generadornumeros(1, 100);

		if (numeroAleatorio <= probabilidadMagiaCaotica) {
			System.out.println("Magia caiotica");
			daņoGeneral = daņoGeneral * 2;

		}
		return super.usar();

	}

}
