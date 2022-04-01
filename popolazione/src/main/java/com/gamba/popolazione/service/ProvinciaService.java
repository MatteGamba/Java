package com.gamba.popolazione.service;

import java.util.List;

import com.gamba.popolazione.entities.Provincia;

public interface ProvinciaService {

	List<String> getRegioni();
	
	List<Provincia> getAll();
	List<Provincia> getProvinciaByRegione(String regione);
	Provincia getProvinciaByComune(String comune);
	
}
