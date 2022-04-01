package dal;

import java.sql.SQLException;
import java.util.List;

import model.Cliente;

public interface ClienteDAO {

	String TAB = "clienti";
	String ALL = "select * from " + TAB + " ";
	String ONE = "select * from " + TAB + " WHERE id = ";
	String INSERT = "insert into " + TAB + " (nome, indirizzo) values(?, ?)";
	
	void addCliente(Cliente c) throws SQLException;
	Cliente getClienteById(int id) throws SQLException;
	List<Cliente> getClienti() throws SQLException;
	List<Cliente> getClientiByData() throws SQLException;
	
	
}
