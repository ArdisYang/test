package com.table.Personnel;

import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Personnel")
public class Personnel {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	private String account;// 帳號
	private String name;
	private String password;
	private int PositionTypeid;// 職務PositionTypeid
	private int permissions;// 權限
	private String nationality;// 國籍
	private Date birthday;
	private int gender;// 性別
	private String telephone;// 電話
	private String phone;// 手機
	private String emergentContactPerson;// 緊急聯絡人
	private String emergentContactNumber;// 緊急連絡電話
	private String note;// 備註
	private int status;// 狀態 離職0/在職1
	private String paySystem;// 薪制
	private Date dateOfWork;// 上班日
	private Date lastModifiedDate;// 最後修改日期
	private Date createDate;// 創建時間

	public Personnel() {
		super();
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getAccount() {
		return account;
	}

	public void setAccount(String account) {
		this.account = account;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public int getPositionTypeid() {
		return PositionTypeid;
	}

	public void setPositionTypeid(int positionTypeid) {
		PositionTypeid = positionTypeid;
	}

	public int getPermissions() {
		return permissions;
	}

	public void setPermissions(int permissions) {
		this.permissions = permissions;
	}

	public String getNationality() {
		return nationality;
	}

	public void setNationality(String nationality) {
		this.nationality = nationality;
	}

	public Date getBirthday() {
		return birthday;
	}

	public void setBirthday(Date birthday) {
		this.birthday = birthday;
	}

	public int getGender() {
		return gender;
	}

	public void setGender(int gender) {
		this.gender = gender;
	}

	public String getTelephone() {
		return telephone;
	}

	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getEmergentContactPerson() {
		return emergentContactPerson;
	}

	public void setEmergentContactPerson(String emergentContactPerson) {
		this.emergentContactPerson = emergentContactPerson;
	}

	public String getEmergentContactNumber() {
		return emergentContactNumber;
	}

	public void setEmergentContactNumber(String emergentContactNumber) {
		this.emergentContactNumber = emergentContactNumber;
	}

	public String getNote() {
		return note;
	}

	public void setNote(String note) {
		this.note = note;
	}

	public int getStatus() {
		return status;
	}

	public void setStatus(int status) {
		this.status = status;
	}

	public String getPaySystem() {
		return paySystem;
	}

	public void setPaySystem(String paySystem) {
		this.paySystem = paySystem;
	}

	public Date getDateOfWork() {
		return dateOfWork;
	}

	public void setDateOfWork(Date dateOfWork) {
		this.dateOfWork = dateOfWork;
	}

	public Date getLastModifiedDate() {
		return lastModifiedDate;
	}

	public void setLastModifiedDate(Date lastModifiedDate) {
		this.lastModifiedDate = lastModifiedDate;
	}

	public Date getCreateDate() {
		return createDate;
	}

	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}

}
