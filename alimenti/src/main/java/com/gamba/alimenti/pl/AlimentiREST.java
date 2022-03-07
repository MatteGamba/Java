package com.gamba.alimenti.pl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.gamba.alimenti.entities.Alimento;
import com.gamba.alimenti.service.AlimentoService;

@Controller
@RequestMapping({"", "mvc"})
public class AlimentiREST {

	@Autowired
	private AlimentoService service;
	
	@GetMapping
	public String getAlimenti(Model m){
		
		m.addAttribute("lista", this.service.getAlimenti());
		m.addAttribute(m);
		return "elenco";
	}
	
	@GetMapping("/categoria/{cat}")
	public List<Alimento> getByCat(@PathVariable("cat") String categoria){
		return this.service.getAlimentiByCategoria(categoria);
		
	}
	
	@GetMapping("{id}")
	public ModelAndView getById(@PathVariable int id){
		ModelAndView mav = new ModelAndView("dettaglio");
		mav.addObject("titolo", "dettaglio");
		mav.addObject("alimento", this.service.getAlimentoById(id));
		return mav;
	}
	
	@PostMapping
	public void addAlimento(@RequestBody Alimento a) {
		this.service.addAlimento(a);
		
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
