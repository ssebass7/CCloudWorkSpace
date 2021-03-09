package mvccoches.modelo.negocio;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import mvccoches.modelo.entidad.Coche;
import mvccoches.modelo.persistencia.DaoCoche;

@Service
public class GestorCoche {

	@Autowired
	private DaoCoche daoCoche;
	
	public boolean validar(Coche coche) {
		Optional<Coche> userBBDD = 
				daoCoche.findByMarca(coche.getMarca());
		
		if(!userBBDD.isPresent()) {
			return false;
		}
		
		if(coche.getModelo().equals(userBBDD.get().getModelo())){
			return true;
		}else {
			return false;
		}
	}
}
