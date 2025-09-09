package com.response;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.RequiredArgsConstructor;

@Data
@AllArgsConstructor
public class ProductResponse<T> {
private String message;
private T data;
//public String getMessage() {
//	return message;
//}
//public void setMessage(String message) {
//	this.message = message;
//}
//public T getData() {
//	return data;
//}
//public void setData(T data) {
//	this.data = data;
//}
//public ProductResponse() {
//	super();
//	// TODO Auto-generated constructor stub
//}
//public ProductResponse(String message, T data) {
//	super();
//	this.message = message;
//	this.data = data;
//}

}
