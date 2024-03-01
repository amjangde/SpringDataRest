package com.example.demo.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity
public class Alien {
	@Override
	public String toString() {
		return "Alien [aId=" + aId + ", aName=" + aName + ", aTech=" + aTech + "]";
	}
	@Id
	@GeneratedValue
	private int aId;
	private String aName;
	private String aTech;
	public int getaId() {
		return aId;
	}
	public void setaId(int aId) {
		this.aId = aId;
	}
	public String getaName() {
		return aName;
	}
	public void setaName(String aName) {
		this.aName = aName;
	}
	public String getaTech() {
		return aTech;
	}
	public void setaTech(String aTech) {
		this.aTech = aTech;
	}
}
