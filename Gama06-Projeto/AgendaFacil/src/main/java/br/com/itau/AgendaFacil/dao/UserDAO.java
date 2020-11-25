package br.com.itau.AgendaFacil.dao;

import org.springframework.data.repository.CrudRepository;

import br.com.itau.AgendaFacil.model.User;

public interface UserDAO extends CrudRepository<User, Integer> {
	
	public User findByEmailOrRacf(String email, String racf);
	
	public User findByEmailAndPswrd(String email, String pswrd);
	


}
