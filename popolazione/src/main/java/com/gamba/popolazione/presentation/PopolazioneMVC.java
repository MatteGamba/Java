package com.gamba.popolazione.presentation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.gamba.popolazione.service.ProvinciaService;

@Controller
@RequestMapping("")
public class PopolazioneMVC {

	@Autowired
	private ProvinciaService service;
	
	@GetMapping("regioni")
	public String getRegioni(Model m) {
		m.addAttribute("regioni", service.getRegioni());
		return "regioni";
	}
	
	@GetMapping("regioni/{regione}")
	public String getComuniByRegione(@PathVariable String regione, Model m) {
		m.addAttribute("comuni", service.getProvinciaByRegione(regione));
		m.addAttribute("regioni", service.getRegioni());
		return "regioni";
	}
	
	@GetMapping("eta")
	public String getEta() {
		return "eta";
	}
	
}
