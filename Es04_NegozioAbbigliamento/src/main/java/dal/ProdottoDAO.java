package dal;

import java.sql.SQLException;
import java.util.List;

import model.Prodotto;

public interface ProdottoDAO {

	String TAB = "prodotti";
	String ALL = "select * from " + TAB + " ";
	String ONE = "select * from " + TAB + " WHERE id = ";
	String INSERT = "insert into " + TAB + " (prezzo, desc) values(?, ?)";
	
	void addProdotto(Prodotto p) throws SQLException;
	Prodotto getProdottoById(int id) throws SQLException;
	List<Prodotto> getProdotti() throws SQLException;
	List<Prodotto> getProdottiByCliente() throws SQLException;
	List<Prodotto> getProdottiByData() throws SQLException;
	
}
