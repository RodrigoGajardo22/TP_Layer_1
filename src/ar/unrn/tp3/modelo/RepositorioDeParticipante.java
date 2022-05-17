package ar.unrn.tp3.modelo;

import excepciones.Coneccion;

//interface de salida

public interface RepositorioDeParticipante {

	public void nuevoParticipante(Participante p) throws Coneccion;

}
