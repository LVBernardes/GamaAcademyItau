package br.com.itau.AgendaFacil.controller;

import java.time.LocalDate;
import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import br.com.itau.AgendaFacil.dao.SchedulingDAO;
import br.com.itau.AgendaFacil.model.Agency;
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

	@GetMapping("/agendamentos")
	public ArrayList<Scheduling> retrieveSchedulings(@RequestParam("mode") int mode, @RequestParam("name") String name,
			@RequestParam("date")  LocalDate date,
			@RequestParam("agencyID") int agencyID) {

		//@DateTimeFormat(iso = DateTimeFormat.ISO.DATE)
		
		ArrayList<Scheduling> schedList = null;
		Agency ag = new Agency();
		ag.setId(agencyID);

		switch (mode) {
		case 0:
			schedList = dao.findAllByOrderByAgency();
			break;
		case 1:
			schedList = dao.findAllByAgencyOrderBySchedulingDate(ag);
			break;
		case 2:
			schedList = dao.findAllBySchedulingDateOrderByAgency(date);
			break;
		case 3:
			schedList = dao.findAllByAgencyAndSchedulingDateOrderBySchedulingTime(ag, date);
			break;
		case 4:
			schedList = dao.findAllByCustomerNameContainsOrderBySchedulingDate(name);
			break;
		case 5:
			schedList = dao.findAllByAgencyAndCustomerNameContainsOrderBySchedulingDate(ag, name);
			break;
		case 6:
			schedList = dao.findAllBySchedulingDateAndAndCustomerNameContainsOrderByAgency(date, name);
			break;
		case 7:
			schedList = dao.findAllByAgencyAndSchedulingDateAndCustomerNameContains(ag, date, name);
			break;
		}

		return schedList;

	}

}
