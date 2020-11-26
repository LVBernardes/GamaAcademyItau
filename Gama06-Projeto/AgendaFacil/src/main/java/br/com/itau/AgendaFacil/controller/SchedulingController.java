package br.com.itau.AgendaFacil.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import br.com.itau.AgendaFacil.dao.SchedulingDAO;
import br.com.itau.AgendaFacil.model.Scheduling;

@RestController
@CrossOrigin("*")
public class SchedulingController {
	
	@Autowired
	private SchedulingDAO dao;
	
	@PostMapping("/novoagendamento")
	public ResponseEntity<Scheduling> newScheduling(@RequestBody Scheduling newSched) {
		try {
			dao.save(newSched);
			return ResponseEntity.status(201).body(newSched);
		} catch (Exception e) {
			return ResponseEntity.badRequest().build();
		}

	}

}
