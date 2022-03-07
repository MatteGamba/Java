package dal;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Connessione {

	private final String DB_URL = "jdbc:mysql://localhost:3306/tss_2022";
	private final String USER = "root";
	private final String PASS = "V3cch10n3_!";
	
	private Connection conn = null;
	
	public Connection connetti() {
		
		try {
			this.conn = DriverManager.getConnection(DB_URL, USER, PASS);
			System.out.println("Connessione okkkkk!");
		} catch (SQLException e) {
			System.err.println("Spiacent, si � verificato un problema di connessione al db");
			//e.printStackTrace();
			System.err.println(e.getMessage());
		}
		
		return this.conn;
	}
	

	}
	
	