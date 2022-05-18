package ar.unrn.tp3.bd;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import ar.unrn.tp3.modelo.Coneccion;

public class ConnectionManager {
	private static String DRIVER = "com.mysql.jdbc.Driver";

	private static String URL_DB = "jdbc:mysql://localhost:3306/";
	protected static String DB = "participantes_layer1";
	protected static String user = "root";
	protected static String pass = "";
	protected static Connection conn = null;

	// Me tira error de coneccion con la BD.. ???

	public static void connect() throws Coneccion {
		try {
			conn = DriverManager.getConnection(URL_DB + DB + "?useSSL=false", user, pass);
		} catch (SQLException sqlEx) {
			throw new Coneccion("no se ha podido conectar a la base de datos");

		}
	}

	public static void disconnect() throws Coneccion {
		if (conn != null) {
			try {
				conn.close();
				conn = null;
			} catch (SQLException e) {
				throw new Coneccion("Error Disconnect");
			}
		}
	}

	public static void reconnect() throws Coneccion {
		disconnect();
		connect();
	}

	public static Connection getConnection() throws Coneccion {
		if (conn == null) {
			connect();
		}
		return conn;
	}

}
