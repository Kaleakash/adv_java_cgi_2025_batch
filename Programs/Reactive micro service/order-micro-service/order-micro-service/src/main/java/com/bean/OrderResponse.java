package com.bean;

public class OrderResponse<T> {
	private String message;
	private T data;
	@Override
	public String toString() {
		return "OrderResponse [message=" + message + ", data=" + data + "]";
	}
	
}
