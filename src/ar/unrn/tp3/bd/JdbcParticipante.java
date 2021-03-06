package ar.unrn.tp3.bd;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import ar.unrn.tp3.modelo.Coneccion;
import ar.unrn.tp3.modelo.Participante;
import ar.unrn.tp3.modelo.RepositorioDeParticipante;

public class JdbcParticipante implements RepositorioDeParticipante {

	private Connection dbConn;

	@Override
	public boolean nuevoParticipante(Participante participante) throws Coneccion {

		dbConn = ConnectionManager.getConnection();
		PreparedStatement st = null;

		try {
			st = dbConn.prepareStatement("insert into participantes(Nombre,Telefono,Region)values(?,?,?)");
			st.setString(1, participante.nombre());
			st.setString(2, participante.telefono());
			st.setString(3, participante.region());
			st.executeUpdate();
			return true;
		} catch (SQLException e) {
			throw new Coneccion("Error de aplicacion");
		} finally {
			ConnectionManager.disconnect();
		}

	}

}
