package com.controlefluxo.veiculos.domain.dto;

import java.io.Serializable;
import java.util.Date;
import com.controlefluxo.veiculos.domain.Car;
import com.controlefluxo.veiculos.domain.Client;
import com.controlefluxo.veiculos.domain.Workshop;
import com.controlefluxo.veiculos.domain.Safe;
import com.controlefluxo.veiculos.domain.Work;
import com.controlefluxo.veiculos.domain.enums.Supply;
import com.controlefluxo.veiculos.domain.enums.Status;
import com.controlefluxo.veiculos.domain.enums.Type;

public class WorkDTO implements Serializable {

	private static final long serialVersionUID = 1L;

	private Integer id;
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
	private Car car;
	private Client client;
	private Workshop workshop;
	private Safe safe;


	public WorkDTO() {

	}

	public WorkDTO(Integer id, String privateCode, String sinister, Type type, Date entryForecast, Date input,
			Date deliveryForecast, Date delivery, Date returnDelivery, Status status, String note, Supply supply,
			Car car, Client client, Workshop workshop, Safe safe) {
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
		this.car = car;
		this.client = client;
		this.workshop = workshop;
		this.safe = safe;
	}

	public WorkDTO(Work work) {
		super();

		this.id = work.getId();
		this.privateCode = work.getPrivateCode();
		this.sinister = work.getSinister();
		this.type = work.getType();
		this.entryForecast = work.getEntryForecast();
		this.input = work.getInput();
		this.deliveryForecast = work.getDeliveryForecast();
		this.delivery = work.getDelivery();
		this.returnDelivery = work.getReturnDelivery();
		this.status = work.getStatus();
		this.note = work.getNote();
		this.supply = work.getSupply();
		this.car = work.getCar();
		this.client = work.getClient();
		this.workshop = work.getWorkshop();
		this.safe = work.getSafe();

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

	public Car getCar() {
		return car;
	}

	public void setCars(Car cars) {
		this.car = cars;
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

}
