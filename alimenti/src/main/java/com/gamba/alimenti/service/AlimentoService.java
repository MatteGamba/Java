package com.gamba.alimenti.service;

import java.util.List;

import com.gamba.alimenti.entities.Alimento;

public interface AlimentoService {

	void addAlimento(Alimento a);
	void updAlimento(Alimento a);
	void deleteAlimento(int id);
	
	Alimento getAlimentoById(int id);
	List<Alimento> getAlimenti();
	List<Alimento> getAlimentiByCategoria(String categoria);
	List<Alimento> getAlimentiByEnergie(int min, int max);
	
	List<String> getCategorie();
	
	
}
