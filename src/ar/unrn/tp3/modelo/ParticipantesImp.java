package ar.unrn.tp3.modelo;

public class ParticipantesImp implements Participantes {

	private RepositorioDeParticipante respositorio;

	public ParticipantesImp(RepositorioDeParticipante repositorio) {
		this.respositorio = repositorio;
	}

	public void nuevoParticipante(String nombre, String tel, String region) throws ErrorDeDatos, Coneccion {
		Participante participante = new Participante(nombre, tel, region);
		respositorio.nuevoParticipante(participante); // interfaz de salida

	}

}
