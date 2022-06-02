package test_Layer1;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

import ar.unrn.tp3.bd.ParticipanteEnMemoria;
import ar.unrn.tp3.modelo.Coneccion;
import ar.unrn.tp3.modelo.ErrorDeDatos;
import ar.unrn.tp3.modelo.ParticipantesImp;

class test_Layer_1 {

	@Test
	void test() {
		ParticipantesImp participantes = new ParticipantesImp(new ParticipanteEnMemoria());

		try {
			assertTrue(participantes.nuevoParticipante("Rodrigo", "4119-123287", "Europa"));
			assertTrue(participantes.nuevoParticipante("Florencia", "1239-122387", "China"));

		} catch (ErrorDeDatos e) {
			e.printStackTrace();
		} catch (Coneccion e) {
			e.printStackTrace();
		}

	}

}
