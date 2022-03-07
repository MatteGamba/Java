package com.gamba.alimenti.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gamba.alimenti.dal.AlimentoDAO;
import com.gamba.alimenti.entities.Alimento;

@Service
public class AlimentoServiceImpl implements AlimentoService {

	@Autowired
	private AlimentoDAO repo;
	
	@Override
	public void addAlimento(Alimento a) {
		this.repo.save(a);
	}

	@Override
	public void updAlimento(Alimento a) {
		this.repo.save(a);
	}

	@Override
	public void deleteAlimento(int id) {
		this.repo.deleteById(id);
	}

	@Override
	public Alimento getAlimentoById(int id) {
		
		if(this.repo.findById(id).isPresent())
			return this.repo.findById(id).get();
		else
			return new Alimento();
	}

	@Override
	public List<Alimento> getAlimenti() {
		// TODO Auto-generated method stub
		return this.repo.findAll();
	}

	@Override
	public List<Alimento> getAlimentiByCategoria(String categoria) {
		// TODO Auto-generated method stub
		return this.repo.findByCategoria(categoria);
	}

	@Override
	public List<Alimento> getAlimentiByEnergie(int min, int max) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<String> getCategorie() {
		// TODO Auto-generated method stub
		return this.repo.trovaCategorie();
	}

}
