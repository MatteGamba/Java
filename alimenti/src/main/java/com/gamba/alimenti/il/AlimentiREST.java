package com.gamba.alimenti.il;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.gamba.alimenti.entities.Alimento;
import com.gamba.alimenti.service.AlimentoService;

@RestController
@RequestMapping({"api", "rest"})
public class AlimentiREST {

	@Autowired
	private AlimentoService service;
	
	@GetMapping
	public List<Alimento> getAlimenti(){
		return service.getAlimenti();
	}
	
	@GetMapping("{id}")
	public Alimento getById(@PathVariable int id){
		return service.getAlimentoById(id);
	}
	
	@PostMapping
	public void addAlimento(@RequestBody Alimento a) {
		this.service.addAlimento(a);
		this.getAlimenti();
	}
	
	@PutMapping
	public void updAlimento(@RequestBody Alimento a) {
		this.service.updAlimento(a);
	}
	
	@DeleteMapping("{id}")
	public void deleteAlimento(@PathVariable int id) {
		this.service.deleteAlimento(id);
	}
	
}
