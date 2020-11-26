package br.com.itau.AgendaFacil.model;

import java.time.LocalDate;

import javax.persistence.*;


@Entity
@Table(name="itmn032_agendamento")
public class Scheduling {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="num_seq")
	private int id;
	
	@Column(name="nome_cli", length=100)
	private String customerName;
	
	@Column(name="email_cli", length=100)
	private String customerEmail;
	
	@Column(name="celular_cli", length=20)
	private String customerPhone;
	
	@Column(name="data_agendamento")
	private LocalDate schedulingDate;
	
	@Column(name="hora_agendamento", length=10)
	private String schedulingTime;
	
	@Column(name="observacao", length=255)
	private String observation;
	
	@ManyToOne
	@JoinColumn(name="id_agencia")
	private Agency agency;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public String getCustomerEmail() {
		return customerEmail;
	}

	public void setCustomerEmail(String customerEmail) {
		this.customerEmail = customerEmail;
	}

	public String getCustomerPhone() {
		return customerPhone;
	}

	public void setCustomerPhone(String customerPhone) {
		this.customerPhone = customerPhone;
	}

	public LocalDate getSchedulingDate() {
		return schedulingDate;
	}

	public void setSchedulingDate(LocalDate schedulingDate) {
		this.schedulingDate = schedulingDate;
	}

	public String getSchedulingTime() {
		return schedulingTime;
	}

	public void setSchedulingTime(String schedulingTime) {
		this.schedulingTime = schedulingTime;
	}

	public String getObservation() {
		return observation;
	}

	public void setObservation(String observation) {
		this.observation = observation;
	}

	public Agency getAgency() {
		return agency;
	}

	public void setAgency(Agency agency) {
		this.agency = agency;
	}


}
