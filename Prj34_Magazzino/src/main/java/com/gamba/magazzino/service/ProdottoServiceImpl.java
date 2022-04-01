package com.gamba.magazzino.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gamba.magazzino.dal.ProdottoDAO;
import com.gamba.magazzino.entities.Prodotto;

@Service
public class ProdottoServiceImpl implements ProdottoService {

	@Autowired
	private ProdottoDAO repo;
	
	@Override
	public void addProdotto(Prodotto p) {
		repo.save(p);
	}

	@Override
	public void updProdotto(Prodotto p) {
		repo.save(p);
	}

	@Override
	public void delProdottoById(int id) {
		repo.deleteById(id);
	}

	@Override
	public Prodotto getProdottoById(int id) {
		
		if(repo.findById(id).isPresent()) 
			return repo.findById(id).get();	
		return null;
		}
		

	@Override
	public List<Prodotto> getProdotti() {
		return repo.findAll();
	}

	@Override
	public List<Prodotto> getProdottiByMinMax(int min, int max) {
		return repo.findByQuantitaBetween(min, max);
	}

}
