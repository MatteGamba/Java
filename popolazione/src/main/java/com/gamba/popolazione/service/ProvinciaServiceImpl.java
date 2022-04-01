package com.gamba.popolazione.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gamba.popolazione.dal.ProvinciaDAO;
import com.gamba.popolazione.entities.Provincia;

@Service
public class ProvinciaServiceImpl implements ProvinciaService {

	@Autowired
	private ProvinciaDAO repo;
	
	@Override
	public List<String> getRegioni() {
		// TODO Auto-generated method stub
		return repo.findAll()
				.stream()
				.map(p -> p.getRegione())
				.distinct()
				.sorted()
				.toList();
	}

	@Override
	public List<Provincia> getAll() {
		return repo.findAll();
	}

	@Override
	public List<Provincia> getProvinciaByRegione(String regione) {
		// TODO Auto-generated method stub
		return repo.findProvinciaByRegione(regione);
	}

	@Override
	public Provincia getProvinciaByComune(String comune) {
		// TODO Auto-generated method stub
		return repo.findProvinciaByComune(comune);
	}

}
