package ar.unrn.tp3.modelo;

import excepciones.ErrorDeDatos;

public class Participante {

	private String nombre;
	private String telefono;
	private String region;

	public Participante(String nombre, String tel, String region) throws ErrorDeDatos {

		validarDatos(nombre, tel, region);

		this.nombre = nombre;
		this.telefono = tel;
		this.region = region;

	}

	private void validarDatos(String nombre, String tel, String region) throws ErrorDeDatos {
		if (nombre.equals("")) {
			throw new ErrorDeDatos("Cargue su nombre");
		}
		if (telefono.equals("")) {
			throw new ErrorDeDatos("Debe cargar un telefono");

		}
		if (!validarTelefono(telefono)) {
			throw new ErrorDeDatos("El teléfono debe ingresarse de la siguiente forma: NNNN-NNNNNN");

		}
		if (!region.equals("China") && !region.equals("US") && !region.equals("Europa")) {
			throw new ErrorDeDatos("Region desconocida. Las conocidas son: China, US, Europa");

		}
	}

	public boolean validarTelefono(String region) {
		String regex = "\\d{4}-\\d{6}";
		return telefono.matches(regex);
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
