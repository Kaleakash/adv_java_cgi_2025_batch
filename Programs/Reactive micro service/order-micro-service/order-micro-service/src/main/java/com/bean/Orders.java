package com.bean;

import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Table;

import com.response.ProductResponse;

import lombok.AllArgsConstructor;
import lombok.Data;

@Table("orders")
@Data
public class Orders {
@Id
private int oid;
private int pid;
private String pname;
private float price;

//public int getOid() {
//	return oid;
//}
//public void setOid(int oid) {
//	this.oid = oid;
//}
//public int getPid() {
//	return pid;
//}
//public void setPid(int pid) {
//	this.pid = pid;
//}
//public String getPname() {
//	return pname;
//}
//public void setPname(String pname) {
//	this.pname = pname;
//}
//public float getPrice() {
//	return price;
//}
//public void setPrice(float price) {
//	this.price = price;
//}


}
