package br.com.itau.AgendaFacil.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import br.com.itau.AgendaFacil.dao.UserDAO;
import br.com.itau.AgendaFacil.model.User;

@RestController
public class UserController {

	@Autowired
	UserDAO userDAO;

	@PostMapping("/login")
	public ResponseEntity<User> login(@RequestBody User userLogin) {
		
		User resp = userDAO.findByEmailOrRacf(userLogin.getEmail(), userLogin.getRacf());
		
		if (resp != null) {
			if (resp.getPswrd().equals(userLogin.getPswrd())) {
				return ResponseEntity.ok(resp);
			} else {
				return ResponseEntity.status(401).build();
			}
		} else {
			return ResponseEntity.notFound().build();
		}
		


	}
}
