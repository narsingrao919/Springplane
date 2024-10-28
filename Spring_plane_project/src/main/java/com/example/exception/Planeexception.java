package com.example.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.NOT_FOUND)
public class Planeexception extends RuntimeException  {
	

	private static final long serialVersionUID = 1L;

		public Planeexception(String message) {
			super(message);
		}

}
