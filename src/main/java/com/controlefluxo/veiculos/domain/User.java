package com.controlefluxo.veiculos.domain;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;
import java.util.stream.Collectors;

import javax.persistence.CollectionTable;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import com.controlefluxo.veiculos.domain.enums.Profile;


@Entity
public class User implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	private String name;
	private String cpf;
	private String rg;
	private String login;
	private String password;

	@ManyToOne
	@JoinColumn(name = "login_id")
	private Workshop workshop;
	
	@ElementCollection(fetch=FetchType.EAGER)
	@CollectionTable(name="PROFILE")
	private Set<Integer> profile = new HashSet<>();
	
	public User() {
		
	}

	public User(Integer id, String name, String cpf, String rg, String login, String password, Workshop workshop) {
		super();
		this.id = id;
		this.name = name;
		this.cpf = cpf;
		this.rg = rg;
		this.login = login;
		this.password = password;
		this.workshop = workshop;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getRg() {
		return rg;
	}

	public void setRg(String rg) {
		this.rg = rg;
	}

	public String getLogin() {
		return login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Workshop getWorkshop() {
		return workshop;
	}

	public void setWorkshop(Workshop workshop) {
		this.workshop = workshop;
	}
	

	public Set<Profile> getProfile() {
		return profile.stream().map(x -> Profile.toEnum(x)).collect(Collectors.toSet());
	}

	public void setProfile(Set<Integer> profile) {
		this.profile = profile;
	}

	@Override
	public int hashCode() {
		return Objects.hash(id);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		User other = (User) obj;
		return Objects.equals(id, other.id);
	}

	
}
