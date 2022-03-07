package controller;

import java.sql.SQLException;
import java.util.List;

import dal.CanzoneDAO;
import dal.CanzoneDAOImpl;
import model.Canzone;

public class JukeBox {

	private CanzoneDAO repo;
	
	public JukeBox() {
		this.repo = new CanzoneDAOImpl();
	}
	
	public Canzone scegliCanzone(int id) {
		try {
			return this.repo.getCanzoneById(id);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}
	
	public List<Canzone> tutteLeCanzoni(){
		try {
			return this.repo.getCanzoni();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}
	
	
	
}
