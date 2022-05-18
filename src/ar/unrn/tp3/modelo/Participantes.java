package ar.unrn.tp3.modelo;

public interface Participantes {

	public void nuevoParticipante(String nombre, String tel, String region) throws ErrorDeDatos, Coneccion;
}
