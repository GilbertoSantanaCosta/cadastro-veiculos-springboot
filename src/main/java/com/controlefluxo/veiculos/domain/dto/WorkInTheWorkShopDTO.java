package com.controlefluxo.veiculos.domain.dto;

import java.io.Serializable;
import java.util.Date;

import com.controlefluxo.veiculos.domain.Work;
import com.controlefluxo.veiculos.domain.enums.Supply;
import com.controlefluxo.veiculos.domain.enums.Status;
import com.controlefluxo.veiculos.domain.enums.Type;

public class WorkInTheWorkShopDTO implements Serializable {

	private static final long serialVersionUID = 1L;

	private Type type;
	private Date entryForecast;
	private Date deliveryForecast;
	private Status status;
	private Supply supply;
	private CarInTheWorkShopDTO veiculo;

	public WorkInTheWorkShopDTO() {

	}

	public WorkInTheWorkShopDTO(Type type, Date entryForecast, Date deliveryForecast, Status status, Supply supply,
			CarInTheWorkShopDTO veiculo) {
		super();
		this.type = type;
		this.entryForecast = entryForecast;
		this.deliveryForecast = deliveryForecast;
		this.status = status;
		this.supply = supply;
		this.veiculo = veiculo;
	}

	public WorkInTheWorkShopDTO(Work work) {
		super();
		this.type = work.getType();
		this.entryForecast = work.getEntryForecast();
		this.deliveryForecast = work.getDeliveryForecast();
		this.status = work.getStatus();
		this.supply = work.getSupply();
		this.veiculo = new CarInTheWorkShopDTO(work.getCars());
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

	public Date getDeliveryForecast() {
		return deliveryForecast;
	}

	public void setDeliveryForecast(Date deliveryForecast) {
		this.deliveryForecast = deliveryForecast;
	}

	public Status getStatus() {
		return status;
	}

	public void setStatus(Status status) {
		this.status = status;
	}

	public Supply getSupply() {
		return supply;
	}

	public void setSupply(Supply supply) {
		this.supply = supply;
	}

	public CarInTheWorkShopDTO getVeiculo() {
		return veiculo;
	}

	public void setVeiculo(CarInTheWorkShopDTO veiculo) {
		this.veiculo = veiculo;
	}

}
