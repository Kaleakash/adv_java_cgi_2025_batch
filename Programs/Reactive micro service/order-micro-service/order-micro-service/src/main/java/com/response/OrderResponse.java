package com.response;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class OrderResponse<T> {
	private String message;
	private T data;
//	@Override
//	public String toString() {
//		return "OrderResponse [message=" + message + ", data=" + data + "]";
//	}
//	public OrderResponse() {
//		super();
//		// TODO Auto-generated constructor stub
//	}
//	public OrderResponse(String message, T data) {
//		super();
//		this.message = message;
//		this.data = data;
//	}
//	public String getMessage() {
//		return message;
//	}
//	public void setMessage(String message) {
//		this.message = message;
//	}
//	public T getData() {
//		return data;
//	}
//	public void setData(T data) {
//		this.data = data;
//	}
	
}
