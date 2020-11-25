package br.com.itau.AgendaFacil.controller;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.itau.AgendaFacil.dao.AgencyDAO;
import br.com.itau.AgendaFacil.model.Agency;

@RestController
public class AgencyController {
	
	/* A anotação @Autowired indica que a referencia DAO do tipo AgenciaDAO será INJETADA
	 * o que é isso? Eu (programador) vou delegar a busca e instanciação de algum objeto
	 * que implemente esta interface para a máquina virtual. 
	 */
	
	@Autowired
	private AgencyDAO agencyDAO;
	
	@GetMapping("/agencias")
	public ArrayList<Agency> RetrieveAll(){
		ArrayList<Agency> lista;   						// declarei a lista
		lista = agencyDAO.findAllByOrderByName(); 		    // recuperei os registros do banco e armaezenei na lista (SELECT)
		return lista; 									// retorno os dadoss
	}

}
