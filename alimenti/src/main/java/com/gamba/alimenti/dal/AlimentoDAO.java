package com.gamba.alimenti.dal;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.gamba.alimenti.entities.Alimento;

public interface AlimentoDAO extends JpaRepository<Alimento, Integer>{

	List<Alimento> findByCategoria(String categoria);
	
	@Query(value = "SELECT DISTINCT(categoria) FROM alimenti ORDER BY categoria", nativeQuery = true)
	List<String> trovaCategorie();
	
	List<String> findDistinctByCategoria();
	
	int countByCategoria(String categoria);
	
}
