package mvccoches.modelo.persistencia;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import mvccoches.modelo.entidad.Coche;

	@Repository
	public interface DaoCoche extends JpaRepository<Coche, Integer>{
		//Para hacer busquedas por algun atributo podemos
		//hacerlo con el siguiente metodo
		//Es obligatorio que empiece por "findBy" y luego
		//el atributo que querais.
		public Optional<Coche> findByMarca(String marca);
	}

