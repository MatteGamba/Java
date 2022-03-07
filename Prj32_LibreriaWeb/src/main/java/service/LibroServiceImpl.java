package service;

import java.util.List;

import dal.LibroDAO;
import dal.LibroDAOImpl;
import entities.Libro;

public class LibroServiceImpl implements LibroService {

	private LibroDAO repo = new LibroDAOImpl();
	
	
	
	@Override
	public List<Libro> getAll() {
		return repo.getAll();
	}

	@Override
	public Libro getLibroById(int id) {
		return repo.getLibroById(id);
	}

	@Override
	public void addLibro(Libro l) {
		repo.addLibro(l);
	}

}
