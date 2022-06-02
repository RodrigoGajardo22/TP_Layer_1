package ar.unrn.tp3.bd;

import ar.unrn.tp3.modelo.Coneccion;
import ar.unrn.tp3.modelo.Participante;
import ar.unrn.tp3.modelo.RepositorioDeParticipante;

public class ParticipanteEnMemoria implements RepositorioDeParticipante {

	@Override
	public boolean nuevoParticipante(Participante p) throws Coneccion {

		return true;
	}

}
