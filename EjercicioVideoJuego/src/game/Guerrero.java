package game;

import org.springframework.stereotype.Component;

@Component
public class Guerrero extends Personaje {

	private int fuerza;

	public int getFuerza() {
		return fuerza;
	}

	public void setFuerza(int fuerza) {
		this.fuerza = fuerza;
	}

	@Override
	public void atacar(Personaje p) {
		int da�oTotal;
		if (this.getArma() instanceof Espada || this.getArma() instanceof Arco) {
			da�oTotal = getNivel() + fuerza;

		} else {
			da�oTotal = getArma().usar();
		}

		da�oTotal += getArma().usar() * 2;
		System.out.println("Guerrero hace " + da�oTotal);
		p.setSalud(p.getSalud() - da�oTotal);
	}

}
