package controller;

import dal.ProdottoDAO;
import dal.ProdottoDAOImpl;


public class GestioneNegozio {
	
	private ProdottoDAO repo;
	
	public GestioneNegozio() {
		this.repo = new ProdottoDAOImpl();
		
		
	}
	
	
	

}
