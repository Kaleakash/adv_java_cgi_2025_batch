package com.bean;

import java.util.List;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;

@Entity
@Component
@Scope("prototype")
public class Product {
@Id
private int pid;
private String pname;
private float price;
@OneToMany
@JoinColumn(name = "pid")  // FK in orders table 
private List<Orders> listOfOrders;

public List<Orders> getListOfOrders() {
	return listOfOrders;
}
public void setListOfOrders(List<Orders> listOfOrders) {
	this.listOfOrders = listOfOrders;
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
public float getPrice() {
	return price;
}
public void setPrice(float price) {
	this.price = price;
}
@Override
public String toString() {
	return "Product [pid=" + pid + ", pname=" + pname + ", price=" + price + "]";
}

}
