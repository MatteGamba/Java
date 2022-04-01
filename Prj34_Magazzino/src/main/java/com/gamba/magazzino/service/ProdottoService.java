package com.gamba.magazzino.service;

import java.util.List;

import com.gamba.magazzino.entities.Prodotto;

public interface ProdottoService {

	void addProdotto(Prodotto p);
	void updProdotto(Prodotto p);
	void delProdottoById(int id);
	
	Prodotto getProdottoById(int id);
	List<Prodotto> getProdotti();
	List<Prodotto> getProdottiByMinMax(int min, int max);
	
	
	
}
