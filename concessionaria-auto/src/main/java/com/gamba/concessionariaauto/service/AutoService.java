package com.gamba.concessionariaauto.service;

import java.util.List;

import com.gamba.concessionariaauto.entities.Auto;

public interface AutoService {

	void addAuto(Auto a);
	List<Auto> getAll();
	Auto getOneById(int id);
	
}
