package ar.unrn.tp3.modelo;

public interface Participantes {

	public boolean nuevoParticipante(String nombre, String tel, String region) throws ErrorDeDatos, Coneccion;
}
