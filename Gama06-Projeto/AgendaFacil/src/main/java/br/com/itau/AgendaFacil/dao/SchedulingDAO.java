package br.com.itau.AgendaFacil.dao;

import org.springframework.data.repository.CrudRepository;

import br.com.itau.AgendaFacil.model.Scheduling;

public interface SchedulingDAO extends CrudRepository<Scheduling, Integer> {
	

}
