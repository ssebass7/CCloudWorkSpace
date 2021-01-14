package ejercicio2Examen.entidad;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class Equipo {

	private String nombre;
	@Autowired
	@Qualifier("listJugadores")
	private List<Jugador> listJugadores;
	
	private String ciudad;

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getCiudad() {
		return ciudad;
	}

	public void setCiudad(String ciudad) {
		this.ciudad = ciudad;
	}

	public List<Jugador> getListJugadores() {
		return listJugadores;
	}

	public void setListJugadores(List<Jugador> lj) {
		this.listJugadores = lj;
	}

	@Override
	public String toString() {
		return "Equipo [nombre=" + nombre + ", listJugadores=" + listJugadores + ", ciudad=" + ciudad + "]";
	}

	
}
