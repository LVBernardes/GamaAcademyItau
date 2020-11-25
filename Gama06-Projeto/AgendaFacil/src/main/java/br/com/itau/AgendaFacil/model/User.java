package br.com.itau.AgendaFacil.model;

import javax.persistence.*;

@Entity
@Table(name="tbl_usuario")
public class User {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id_user")
	private int id;
	
	@Column(name="nome", length = 100)
	private String name;
	
	@Column(name="email", length = 100)
	private String email;
	
	@Column(name="racf", length = 7)
	private String racf;
	
	@Column(name="senha", length = 50)
	private String pswrd;
	
	@Column(name="link_foto", length = 255)
	private String photoLink;

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

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getRacf() {
		return racf;
	}

	public void setRacf(String racf) {
		this.racf = racf;
	}

	public String getPswrd() {
		return pswrd;
	}

	public void setPswrd(String pswrd) {
		this.pswrd = pswrd;
	}

	public String getPhotoLink() {
		return photoLink;
	}

	public void setPhotoLink(String photoLink) {
		this.photoLink = photoLink;
	}
	
}
