package com.bean;

import java.time.LocalDateTime;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Orders {
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
private int oid;
@Column(name="orderdate")
private LocalDateTime orderDate;	// by default column name created by orm as order_date
private int qty;
private Integer pid;
public int getOid() {
	return oid;
}
public void setOid(int oid) {
	this.oid = oid;
}
public LocalDateTime getOrderDate() {
	return orderDate;
}
public void setOrderDate(LocalDateTime orderDate) {
	this.orderDate = orderDate;
}
public int getQty() {
	return qty;
}
public void setQty(int qty) {
	this.qty = qty;
}
public Integer getPid() {
	return pid;
}
public void setPid(Integer pid) {
	this.pid = pid;
}

}
