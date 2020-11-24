package br.com.itau.AgendaFacil.model;

import javax.persistence.*;

@Entity
@Table(name="itmn032_agencia")
public class Agency {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id")
	private int id;
	
	@Column(name="nome_agencia", length=100)
	private String name;
	
	@Column(name="hora_inicio")
	private int hourInit;
	
	@Column(name="hora_fim")
	private int hourEnd;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getHourInit() {
		return hourInit;
	}

	public void setHourInit(int hourInit) {
		this.hourInit = hourInit;
	}

	public int getHourEnd() {
		return hourEnd;
	}

	public void setHourEnd(int hourEnd) {
		this.hourEnd = hourEnd;
	}

}
