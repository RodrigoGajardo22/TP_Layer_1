package ar.unrn.tp3.modelo;

public class Participante {

	private String nombre;
	private String telefono;
	private String region;

	public Participante(String nombre, String tel, String region) {
		this.nombre = nombre;
		this.telefono = tel;
		this.region = region;

	}

	public boolean validarTelefono(String telefono) {

		return true;
	}

	public boolean validarRegion(String region) {
		return true;
	}

	// ¿ PUEDO USAR GETs PARA ÉSTE CASO?
	public String nombre() {
		return nombre;
	}

	public String telefono() {
		return telefono;
	}

	public String region() {
		return region;
	}
}
