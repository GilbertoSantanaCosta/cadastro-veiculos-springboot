package com.controlefluxo.veiculos.domain;

import java.io.Serializable;

import java.util.Date;

import java.util.Objects;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import com.controlefluxo.veiculos.domain.enums.Supply;
import com.controlefluxo.veiculos.domain.enums.Status;
import com.controlefluxo.veiculos.domain.enums.Type;



@Entity
public class Work implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	
	@Column(unique = true, nullable = false)
	private String privateCode;
	private String sinister;
	private Type type;
	private Date entryForecast;
	private Date input;
	private Date deliveryForecast;
	private Date delivery;
	private Date returnDelivery;
	private Status status;
	private String note;
	private Supply supply;

	
	@ManyToOne
	@JoinColumn(name = "car_id")
	private Car cars;
	
	
	@OneToOne
	@JoinColumn(name = "client_id")
	private Client client;
	
	
	@ManyToOne
	@JoinColumn(name = "workshop_id")
	private Workshop workshop;

	
	@ManyToOne
	@JoinColumn(name = "safe_id")
	private Safe safe;
	
	public Work() {

	}

	public Work(Integer id, String privateCode, String sinister, Type type,
			Date entryForecast, Date input, Date deliveryForecast, Date delivery, Date returnDelivery, Status status, String note,
			Supply supply, Car cars, Client client) {
		super();
		this.id = id;
		this.privateCode = privateCode;
		this.sinister = sinister;
		this.type = type;
		this.entryForecast = entryForecast;
		this.input = input;
		this.deliveryForecast = deliveryForecast;
		this.delivery = delivery;
		this.returnDelivery = returnDelivery;
		this.status = status;
		this.note = note;
		this.supply = supply;
		this.cars = cars;
		this.client = client;
		
	}

	

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getPrivateCode() {
		return privateCode;
	}

	public void setPrivateCode(String privateCode) {
		this.privateCode = privateCode;
	}

	public String getSinister() {
		return sinister;
	}

	public void setSinister(String sinister) {
		this.sinister = sinister;
	}

	public Type getType() {
		return type;
	}

	public void setType(Type type) {
		this.type = type;
	}

	public Date getEntryForecast() {
		return entryForecast;
	}

	public void setEntryForecast(Date entryForecast) {
		this.entryForecast = entryForecast;
	}

	public Date getInput() {
		return input;
	}

	public void setInput(Date input) {
		this.input = input;
	}

	public Date getDeliveryForecast() {
		return deliveryForecast;
	}

	public void setDeliveryForecast(Date deliveryForecast) {
		this.deliveryForecast = deliveryForecast;
	}

	public Date getDelivery() {
		return delivery;
	}

	public void setDelivery(Date delivery) {
		this.delivery = delivery;
	}

	public Date getReturnDelivery() {
		return returnDelivery;
	}

	public void setReturnDelivery(Date returnDelivery) {
		this.returnDelivery = returnDelivery;
	}

	public Status getStatus() {
		return status;
	}

	public void setStatus(Status status) {
		this.status = status;
	}

	public String getNote() {
		return note;
	}

	public void setNote(String note) {
		this.note = note;
	}

	public Supply getSupply() {
		return supply;
	}

	public void setSupply(Supply supply) {
		this.supply = supply;
	}

	public Car getCars() {
		return cars;
	}

	public void setCars(Car cars) {
		this.cars = cars;
	}

	public Client getClient() {
		return client;
	}

	public void setClient(Client client) {
		this.client = client;
	}

	public Workshop getWorkshop() {
		return workshop;
	}

	public void setWorkshop(Workshop workshop) {
		this.workshop = workshop;
	}

	public Safe getSafe() {
		return safe;
	}

	public void setSafe(Safe safe) {
		this.safe = safe;
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
		Work other = (Work) obj;
		return Objects.equals(id, other.id);
	}

}
