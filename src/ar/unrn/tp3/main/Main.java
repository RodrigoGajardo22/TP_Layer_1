package ar.unrn.tp3.main;

import ar.unrn.tp3.bd.JdbcParticipante;
import ar.unrn.tp3.ui.Ui;

public class Main {

	public static void main(String[] args) {

		JdbcParticipante repositorio = new JdbcParticipante();
		Ui ventana = new Ui(repositorio);

	}

}
