package com.reponse;

public class ProductReponse<T> {
private String message;
private T data;
public String getMessage() {
	return message;
}
public void setMessage(String message) {
	this.message = message;
}
public T getData() {
	return data;
}
public void setData(T data) {
	this.data = data;
}
public ProductReponse() {
	super();
	// TODO Auto-generated constructor stub
}
public ProductReponse(String message, T data) {
	super();
	this.message = message;
	this.data = data;
}

}
