package com.bean;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;

@Entity
public class Product {
@Id  
private int pid;
private String pname;
private int price;
private int qty;
@OneToMany
@JoinColumn(name = "pid")
private List<Orders> listOfOrders;

public List<Orders> getListOfOrders() {
	return listOfOrders;
}
public void setListOfOrders(List<Orders> listOfOrders) {
	this.listOfOrders = listOfOrders;
}
public int getQty() {
	return qty;
}
public void setQty(int qty) {
	this.qty = qty;
}
public int getPid() {
	return pid;
}
public void setPid(int pid) {
	this.pid = pid;
}
public String getPname() {
	return pname;
}
public void setPname(String pname) {
	this.pname = pname;
}
public int getPrice() {
	return price;
}
public void setPrice(int price) {
	this.price = price;
}


}
