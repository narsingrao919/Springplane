package com.example.exception;

import java.util.Date;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.context.request.WebRequest;

@ControllerAdvice
public class Globalexception {
	
	@ExceptionHandler(Idnotfoundexception.class)
	public ResponseEntity<Errormessage>resourcefoundornot(Idnotfoundexception idnotfoundexception,
			WebRequest webRequest){
		Errormessage errormessage=new Errormessage(new Date(),idnotfoundexception.getMessage(),
				webRequest.getDescription(false));
		return new ResponseEntity<>(errormessage,HttpStatus.NOT_FOUND);
		
	}
	
	@ExceptionHandler(Planeexception.class)
	public ResponseEntity<Errormessage>planeerrornotfound(Planeexception planeexception,
			WebRequest webRequest){
		Errormessage errormessage=new Errormessage(new Date(),planeexception.getMessage(),
				webRequest.getDescription(false));
		return new ResponseEntity<>(errormessage,HttpStatus.NOT_FOUND);
	}

}
