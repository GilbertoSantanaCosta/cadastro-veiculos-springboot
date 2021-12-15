package com.controlefluxo.veiculos.domain.dto;

import java.io.Serializable;
import java.util.Date;

import com.controlefluxo.veiculos.domain.Work;
import com.controlefluxo.veiculos.domain.enums.Supply;
import com.controlefluxo.veiculos.domain.enums.Status;
import com.controlefluxo.veiculos.domain.enums.Type;

public class WorkFindDTO implements Serializable{


	private static final long serialVersionUID = 1L;
	
	private Type type;
	private Date deliveryForecast;
	private Status status;
	private Supply supply;
	
	public WorkFindDTO() {
		
	}
	
	public WorkFindDTO(Type type, Date deliveryForecast, Status status, Supply supply) {
		super();
		this.type = type;
		this.deliveryForecast = deliveryForecast;
		this.status = status;
		this.supply = supply;
	}
	
	public WorkFindDTO(Work Work) {
		super();
		this.type = Work.getType();
		this.deliveryForecast = Work.getDeliveryForecast();
		this.status = Work.getStatus();
		this.supply = Work.getSupply();
	}

	public Type getType() {
		return type;
	}

	public void setType(Type type) {
		this.type = type;
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

	
	
	
}
