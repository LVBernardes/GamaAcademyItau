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
	private String custumerEmail;
	
	@Column(name="celular_cli", length=20)
	private String custumerPhone;
	
	@Column(name="data_agendamento")
	private LocalDate schedulingDate;
	
	@Column(name="hora_agendamento", length=10)
	private String schedulingTime;
	
	@Column(name="observacao", length=255)
	private String observation;
	
	@ManyToOne
	@JoinColumn(name="id_agencia")
	private int agencyId;

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

	public String getCustumerEmail() {
		return custumerEmail;
	}

	public void setCustumerEmail(String custumerEmail) {
		this.custumerEmail = custumerEmail;
	}

	public String getCustumerPhone() {
		return custumerPhone;
	}

	public void setCustumerPhone(String custumerPhone) {
		this.custumerPhone = custumerPhone;
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

	public int getAgencyId() {
		return agencyId;
	}

	public void setAgencyId(int agencyId) {
		this.agencyId = agencyId;
	}
	
	
	
}
