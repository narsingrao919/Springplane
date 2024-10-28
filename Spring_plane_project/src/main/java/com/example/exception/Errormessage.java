package com.example.exception;

import java.util.Date;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class Errormessage {
	
	private Date date;
	private String message;
	private String description;
	

}
