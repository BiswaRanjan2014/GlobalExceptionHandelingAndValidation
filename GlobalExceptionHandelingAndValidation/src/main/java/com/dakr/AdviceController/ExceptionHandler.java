package com.dakr.AdviceController;

import java.util.NoSuchElementException;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class ExceptionHandler {

	@org.springframework.web.bind.annotation.ExceptionHandler(NoSuchElementException.class)
	 public ResponseEntity<String>handleNoSuchElementException(NoSuchElementException elementException)
	 {
		 
		 return new ResponseEntity<String>("Elements R Not Present In Database,plz...Provide Right input ", HttpStatus.NOT_FOUND);
	 }
	   
}
