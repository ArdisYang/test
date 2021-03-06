package com.table.OrderContent;

import java.sql.Date;

public class OrderContent {

	private int id;
	private int orderId;//訂單編號
	private int commodity; //商品編號
	private int amount;// 數量
	private int money;
	private Date createDate;// 創建時間
	private String note;// 備註
	private int status;// 狀態 剛建立0  備妥1  庫存不足-1   完成10
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getOrderId() {
		return orderId;
	}
	public void setOrderId(int orderId) {
		this.orderId = orderId;
	}
	public int getCommodity() {
		return commodity;
	}
	public void setCommodity(int commodity) {
		this.commodity = commodity;
	}
	public int getAmount() {
		return amount;
	}
	public void setAmount(int amount) {
		this.amount = amount;
	}
	public int getMoney() {
		return money;
	}
	public void setMoney(int money) {
		this.money = money;
	}
	public Date getCreateDate() {
		return createDate;
	}
	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
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


}
