package com.xworkz.gas.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

@Table(name ="gas_table")
@Entity
public class GasCylinderEntity {
	@Id
	@Column(name = "ID")
	@GeneratedValue(generator="abc")
	@GenericGenerator(name="abc",strategy="increment")
	private int ID;
	@Column(name = "BRAND")
	private String BRAND;
	@Column(name = "COLOR")
	private String COLOR;
	@Column(name = "PRICE")
	private double PRICE;
	@Column(name = "GAS_TYPE")
	private String GAS_TYPE;
	
	public GasCylinderEntity(String BRAND,String COLOR,double PRICE,String GAS_TYPE) {
		super();
		this.BRAND=BRAND;
		this.COLOR=COLOR;
		this.PRICE=PRICE;
		this.GAS_TYPE=GAS_TYPE;
	}

	
	
	public GasCylinderEntity() {
	
	}



	public int getID() {
		return ID;
	}

	public void setID(int iD) {
		ID = iD;
	}

	public String getBRAND() {
		return BRAND;
	}

	public void setBRAND(String bRAND) {
		BRAND = bRAND;
	}

	public String getCOLOR() {
		return COLOR;
	}

	public void setCOLOR(String cOLOR) {
		COLOR = cOLOR;
	}

	public double getPRICE() {
		return PRICE;
	}

	public void setPRICE(double pRICE) {
		PRICE = pRICE;
	}

	public String getGAS_TYPE() {
		return GAS_TYPE;
	}

	public void setGAS_TYPE(String gAS_TYPE) {
		GAS_TYPE = gAS_TYPE;
	}

	@Override
	public String toString() {
		return "GasCylinderEntity[ID = " + ID +",BRAND = " + BRAND +",COLOR = "+ COLOR +",PRICE = " + PRICE +",GAS_TYPE= " + GAS_TYPE +"]";
	}
	
}
