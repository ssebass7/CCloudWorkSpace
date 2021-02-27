package alquiler;

public class Habitacion {
	private String tipoHabitacion;
	private double metrosCuadrados;

	public Habitacion(String tipoHabitacion, double metrosCuadrados) {
		super();
		this.tipoHabitacion = tipoHabitacion;
		this.metrosCuadrados = metrosCuadrados;
	}

	public String getTipoHabitacion() {
		return tipoHabitacion;
	}

	public void setTipoHabitacion(String tipoHabitacion) {
		this.tipoHabitacion = tipoHabitacion;
	}

	public double getMetrosCuadrados() {
		return metrosCuadrados;
	}

	public void setMetrosCuadrados(double metrosCuadrados) {
		this.metrosCuadrados = metrosCuadrados;
	}

	public Habitacion() {
		super();
	}

	@Override
	public String toString() {
		return "Habitacion= " + tipoHabitacion + ", metrosCuadrados=" + metrosCuadrados + "\n";
	}

}
