package dal;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;

import model.Acquisto;

public class AcquistoDAOImpl implements AcquistoDAO {

	private Connessione connessione;
	private Connection conn;
	private Statement stat;
	private PreparedStatement ps;
	private ResultSet rs;
	
	
	public AcquistoDAOImpl() {
		this.connessione = new Connessione();
		this.conn = this.connessione.getConn();
	}
	
	@Override
	public void addAcquisto(Acquisto a) throws SQLException {

		this.ps = this.conn.prepareStatement(INSERT);
		this.ps.setString(1, a.getCliente().getNome());
		
	}

	@Override
	public List<Acquisto> getAcquistiByCliente(int id) throws SQLException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Acquisto> getAcquistiByProdotto() throws SQLException {
		// TODO Auto-generated method stub
		return null;
	}

}
