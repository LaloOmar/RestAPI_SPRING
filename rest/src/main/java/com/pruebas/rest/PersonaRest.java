package com.pruebas.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.pruebas.dao.PersonaDAO;
import com.pruebas.model.Persona;

@RestController
@RequestMapping("personas")
public class PersonaRest {

	@Autowired
	private PersonaDAO personaDAO;

	@PostMapping("guardar")
	public void guardar(@RequestBody Persona persona) {
		personaDAO.save(persona);
	}

	@GetMapping("/listar")
	public java.util.List<Persona> listar() {
		return personaDAO.findAll();
	}

}
