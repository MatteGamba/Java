package dal;

import java.sql.SQLException;
import java.util.List;

import model.Acquisto;


public interface AcquistoDAO {

	String TAB = "acquisti";
	String ALL = "select * from " + TAB + " ";
	String ONE = "select * from " + TAB + " WHERE id = ";
	String INSERT = "insert into " + TAB + " (data, prodotto, cliente) values(?, ?, ?)";
	
	void addAcquisto(Acquisto a) throws SQLException;
	List<Acquisto> getAcquistiByCliente(int id) throws SQLException;
	List<Acquisto> getAcquistiByProdotto() throws SQLException;
	
}
