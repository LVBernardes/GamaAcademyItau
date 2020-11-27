package br.com.itau.AgendaFacil.controller;

import java.time.LocalDate;
import java.util.ArrayList;

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

	@PostMapping("/agendamentos")
	public ArrayList<Scheduling> retrieveAll(@RequestParam int mode, @RequestParam String name,
			@RequestParam LocalDate date, @RequestParam int agencyID) {
		
		ArrayList<Scheduling> schedList = null;

		switch (mode) {
		case 0:
			schedList = dao.findAllByOrderByAgency();
			break;
		case 1:
			schedList = dao.findAllByAgencyOrderBySchedulingDate(agencyID);
			break;
		case 2:
			schedList = dao.findAllBySchedulingDateOrderByAgency(date);
			break;
		case 3:
			schedList = dao.findAllByAgencyAndSchedulingDateOrderBySchedulingTime(agencyID, date);
			break;
		case 4:
			schedList = dao.findAllByCustomerNameContainsOrderBySchedulingDate(name);
			break;
		case 5:
			schedList = dao.findAllByAgencyAndCustomerNameContainsOrderBySchedulingDate(agencyID, name);
			break;
		case 6:
			schedList = dao.findAllBySchedulingDateAndAndCustomerNameContainsOrderByAgency(date, name);
			break;
		case 7:
			schedList = dao.findAllByAgencyAndSchedulingDateAndCustomerNameContains(agencyID, date, name);
			break;
		}
		
		return schedList;

	}

}
