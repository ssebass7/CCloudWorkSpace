package game;

import org.springframework.stereotype.Component;

@Component
public class Curandero extends Personaje {
	private int sabiduria;

	@Override
	public void atacar(Personaje p) {
		int da�oTotal;
		if (this.getArma() instanceof Rezo) {
			da�oTotal = getArma().usar() + sabiduria;

			int curacion = (int) Math.round(da�oTotal * .1);
			this.setSalud(this.getSalud() + curacion);
			System.out.println("Curandero se cura " + da�oTotal);

		} else {
			da�oTotal = getArma().usar();
		}

		da�oTotal += getArma().usar() * 2;
		System.out.println("Curandero hace " + da�oTotal);
		p.setSalud(p.getSalud() - da�oTotal);
	}

	public int getSabiduria() {
		return sabiduria;
	}

	public void setSabiduria(int sabiduria) {
		this.sabiduria = sabiduria;
	}

}
