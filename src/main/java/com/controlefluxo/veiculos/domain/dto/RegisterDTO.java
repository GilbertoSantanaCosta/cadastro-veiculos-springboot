package com.controlefluxo.veiculos.domain.dto;

import java.io.Serializable;
import java.util.Date;

import com.controlefluxo.veiculos.domain.enums.Supply;
import com.controlefluxo.veiculos.domain.enums.Status;
import com.controlefluxo.veiculos.domain.enums.Type;

public class RegisterDTO implements Serializable {

	private static final long serialVersionUID = 1L;

	private Integer idClient;
	private String name;
	private String surname;
	private String cpf;
	private String rg;
	private String telephone1;
	private String telephone2;
	private String telephone3;
	private String email;

	private Integer idWorkshop;
	private String nameWorkshop;
	
	private Integer idSafe;
	private String nameSafe;

	private Integer idWork;
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

	private Integer idCar;
	private String board;
	private String year;
	private String nameCar;
	private String brand;
	private String model;

	public RegisterDTO(Integer idClient, String name, String surname, String cpf, String rg, String telephone1,
			String telephone2, String telephone3, String email, Integer idWorkshop, String nameWorkshop, Integer idSafe,
			String nameSafe, Integer idWork, String privateCode, String sinister, Type type,
			Date entryForecast, Date input, Date deliveryForecast, Date delivery, Date returnDelivery,
			Status status, String note, Supply supply, Integer idCar, String board, String year,
			String nameCar, String brand, String model) {
		super();
		this.idClient = idClient;
		this.name = name;
		this.surname = surname;
		this.cpf = cpf;
		this.rg = rg;
		this.telephone1 = telephone1;
		this.telephone2 = telephone2;
		this.telephone3 = telephone3;
		this.email = email;
		this.idWorkshop = idWorkshop;
		this.nameWorkshop = nameWorkshop;
		this.idSafe = idSafe;
		this.nameSafe = nameSafe;
		this.idWork = idWork;
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
		this.idCar = idCar;
		this.board = board;
		this.year = year;
		this.nameCar = nameCar;
		this.brand = brand;
		this.model = model;
	}

	public Integer getIdClient() {
		return idClient;
	}

	public void setIdClient(Integer idClient) {
		this.idClient = idClient;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSurname() {
		return surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
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

	public String getTelephone1() {
		return telephone1;
	}

	public void setTelephone1(String telephone1) {
		this.telephone1 = telephone1;
	}

	public String getTelephone2() {
		return telephone2;
	}

	public void setTelephone2(String telephone2) {
		this.telephone2 = telephone2;
	}

	public String getTelephone3() {
		return telephone3;
	}

	public void setTelephone3(String telephone3) {
		this.telephone3 = telephone3;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Integer getIdWorkshop() {
		return idWorkshop;
	}

	public void setIdWorkshop(Integer idWorkshop) {
		this.idWorkshop = idWorkshop;
	}

	public String getNameWorkshop() {
		return nameWorkshop;
	}

	public void setNameWorkshop(String nameWorkshop) {
		this.nameWorkshop = nameWorkshop;
	}

	public Integer getIdSafe() {
		return idSafe;
	}

	public void setIdSafe(Integer idSafe) {
		this.idSafe = idSafe;
	}

	public String getNameSafe() {
		return nameSafe;
	}

	public void setNameSafe(String nameSafe) {
		this.nameSafe = nameSafe;
	}

	public Integer getIdWork() {
		return idWork;
	}

	public void setIdWork(Integer idWork) {
		this.idWork = idWork;
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

	public Integer getIdCar() {
		return idCar;
	}

	public void setIdCar(Integer idCar) {
		this.idCar = idCar;
	}

	public String getBoard() {
		return board;
	}

	public void setBoard(String board) {
		this.board = board;
	}

	public String getYear() {
		return year;
	}

	public void setYear(String year) {
		this.year = year;
	}

	public String getNameCar() {
		return nameCar;
	}

	public void setNameCar(String nameCar) {
		this.nameCar = nameCar;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	
	
	
	

}
