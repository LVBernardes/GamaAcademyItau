package br.com.itau.AgendaFacil.dao;

import java.util.ArrayList;

import org.springframework.data.repository.CrudRepository;

import br.com.itau.AgendaFacil.model.Agency;

public interface AgencyDAO extends CrudRepository<Agency, Integer>{
	
	public ArrayList<Agency> findAllByOrderByName();

}
