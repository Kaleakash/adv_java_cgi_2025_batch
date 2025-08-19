package com;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component				// <bean class="com.Address"></bean>
@Scope("prototype")
public class Address {	// by default class name using camel naming rule. ie address
	@Value(value = "Bangalore")
private String city;
	@Value(value = "Kar")
private String state;
public String getCity() {
	return city;
}
public void setCity(String city) {
	this.city = city;
}
public String getState() {
	return state;
}
public void setState(String state) {
	this.state = state;
}
@Override
public String toString() {
	return "Address [city=" + city + ", state=" + state + "]";
}
public Address() {
	super();
	// TODO Auto-generated constructor stub
	System.out.println("Address class object created");
}

}
