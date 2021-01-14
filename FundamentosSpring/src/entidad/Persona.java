package entidad;

/*
 * Spring es un contenedor de POJOs que implementa 
 * IOC e ID . Debemos de tener el constructor por defecto
 * y adem�s deberan seguir la 
 */

public class Persona {

	private String nombre;
	private int edad;
	private double peso;
	private Direccion direccion;
	private Salario salario;

	public Salario getSalario() {
		return salario;
	}

	public void setSalario(Salario salario) {
		this.salario = salario;
	}

	public Persona() {
		super();
	}

	public Persona(String nombre, int edad, double peso, Direccion direccion) {
		super();
		this.nombre = nombre;
		this.edad = edad;
		this.peso = peso;
		this.direccion = direccion;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public double getPeso() {
		return peso;
	}

	public void setPeso(double peso) {
		this.peso = peso;
	}

	public Direccion getDireccion() {
		return direccion;
	}

	public void setDireccion(Direccion direccion) {
		this.direccion = direccion;
	}

	@Override
	public String toString() {
		return "Persona [nombre=" + nombre + ", edad=" + edad + ", peso=" + peso + ", direccion=" + direccion
				+ ", salario=" + salario + "]";
	}

}
