package br.com.itau.AgendaFacil.dao;

import java.time.LocalDate;
import java.util.ArrayList;

import org.springframework.data.repository.CrudRepository;

import br.com.itau.AgendaFacil.model.Scheduling;

public interface SchedulingDAO extends CrudRepository<Scheduling, Integer> {
	
	/* Recupera do BD usando filtro (Nome:0,Data:0,Agencia:0) => modo:0
	 * Ordena por Agencia
	 */
	public ArrayList<Scheduling> findAllByOrderByAgency();
	
	/* Recupera do BD usando filtro (Nome:0,Data:0,Agencia:1) => modo:1
	 * Ordena por Data
	 */
	public ArrayList<Scheduling> findAllByAgencyOrderBySchedulingDate(int agencyID);
	
	/* Recupera do BD usando filtro (Nome:0,Data:1,Agencia:0) => modo:2
	 * Ordena por Agencia
	 */
	public ArrayList<Scheduling> findAllBySchedulingDateOrderByAgency(LocalDate date);
	
	/* Recupera do BD usando filtro (Nome:0,Data:1,Agencia:1) => modo:3
	 * Ordena por Horario de Atendimento
	 */
	public ArrayList<Scheduling> findAllByAgencyAndSchedulingDateOrderBySchedulingTime(int agencyID,
																					   LocalDate date);
	
	/* Recupera do BD usando filtro (Nome:1,Data:0,Agencia:0) => modo:4
	 * Ordena por Data
	 */
	public ArrayList<Scheduling> findAllByCustomerNameContainsOrderBySchedulingDate(String name);
	
	/* Recupera do BD usando filtro (Nome:1,Data:0,Agencia:1) => modo:5
	 * Ordena por Data
	 */
	public ArrayList<Scheduling> findAllByAgencyAndCustomerNameContainsOrderBySchedulingDate(int agencyID,
																							 String name);

	/* Recupera do BD usando filtro (Nome:1,Data:1,Agencia:0) => modo:6
	 * Ordena por Agencia
	 */
	public ArrayList<Scheduling> findAllBySchedulingDateAndAndCustomerNameContainsOrderByAgency(LocalDate date,
																				  				String name);
	
	// Recupera do BD usando filtro (Nome:1,Data:1,Agencia:1) => modo:7
	public ArrayList<Scheduling> findAllByAgencyAndSchedulingDateAndCustomerNameContains(int agencyID,
																						 LocalDate date,
																						 String name);

}
