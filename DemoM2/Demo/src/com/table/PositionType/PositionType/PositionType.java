package com.table.PositionType.PositionType;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "PositionType")
public class PositionType {
	/* 職位薪水參數 */
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	private String position;
	private int personnelId;
	private int hourlySalary;
	private int monthlySalary;
	private String note;// 備註

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getPosition() {
		return position;
	}

	public void setPosition(String position) {
		this.position = position;
	}

	public int getPersonnelId() {
		return personnelId;
	}

	public void setPersonnelId(int personnelId) {
		this.personnelId = personnelId;
	}

	public int getHourlySalary() {
		return hourlySalary;
	}

	public void setHourlySalary(int hourlySalary) {
		this.hourlySalary = hourlySalary;
	}

	public int getMonthlySalary() {
		return monthlySalary;
	}

	public void setMonthlySalary(int monthlySalary) {
		this.monthlySalary = monthlySalary;
	}

	public String getNote() {
		return note;
	}

	public void setNote(String note) {
		this.note = note;
	}
}
