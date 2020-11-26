package br.com.itau.AgendaFacil.dao;

import java.time.LocalDate;
import java.util.ArrayList;

import org.springframework.data.repository.CrudRepository;

import br.com.itau.AgendaFacil.model.Scheduling;

public interface SchedulingDAO extends CrudRepository<Scheduling, Integer> {
	
	public ArrayList<Scheduling> findAllByOrderByAgency();
	public ArrayList<Scheduling> findAllByAgency(int agencyID);
	public ArrayList<Scheduling> findAllBySchedulingDate(LocalDate date);
	public ArrayList<Scheduling> findAllByCustomerNameContains(String name);

}
