package com.luisdev.springboot.todo.app.exceptions;

import org.springframework.http.HttpStatus;


public class ToDoExceptions extends RuntimeException {

	private String message;
	private HttpStatus httStatus;

	public ToDoExceptions(String message, HttpStatus httStatus) {
		super();
		this.message = message;
		this.httStatus = httStatus;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public HttpStatus getHttStatus() {
		return httStatus;
	}

	public void setHttStatus(HttpStatus httStatus) {
		this.httStatus = httStatus;
	}

}
