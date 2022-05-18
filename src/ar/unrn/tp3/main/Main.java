package ar.unrn.tp3.main;

import ar.unrn.tp3.bd.JdbcParticipante;
import ar.unrn.tp3.modelo.ParticipantesImp;
import ar.unrn.tp3.ui.Ui;

public class Main {

	public static void main(String[] args) {

		ParticipantesImp participantes = new ParticipantesImp(new JdbcParticipante());

		Ui ventana = new Ui(participantes);

	}

}
