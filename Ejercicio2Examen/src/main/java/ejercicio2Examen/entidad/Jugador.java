package ejercicio2Examen.entidad;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class Jugador {

	private String nombre;
	private String dorsal;
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getDorsal() {
		return dorsal;
	}
	public void setDorsal(String dorsal) {
		this.dorsal = dorsal;
	}
	
	@Override
	public String toString() {
		return "Jugador [nombre=" + nombre + ", dorsal=" + dorsal + "]";
	}
	
	
	
}
