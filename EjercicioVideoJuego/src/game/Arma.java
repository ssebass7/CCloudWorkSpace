package game;

public class Arma {

	private int da�oMinimo;
	private int da�omaximo;

	public int usar() {

		int aleatorio = Util.generadornumeros(da�oMinimo, da�omaximo);
		return aleatorio;

	}

	public int getDa�oMinimo() {
		return da�oMinimo;
	}

	public void setDa�oMinimo(int da�oMinimo) {
		this.da�oMinimo = da�oMinimo;
	}

	public int getDa�omaximo() {
		return da�omaximo;
	}

	public void setDa�omaximo(int da�omaximo) {
		this.da�omaximo = da�omaximo;
	}

}
