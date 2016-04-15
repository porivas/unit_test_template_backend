package com.unit_test.app;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
//import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;	

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.http.ResponseEntity;

import java.io.IOException;

import java.util.*; 

import org.springframework.web.util.UriComponentsBuilder;

import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.ResponseStatus;

@RestController
public class AppController {

 	private HashMap<String, Test> _testStore = new HashMap<String, Test>();

	@CrossOrigin
	@RequestMapping(method=RequestMethod.GET, value="/storedProcedures")
	public StoredProcedure getProcedures(){
		StoredProcedure sp = new StoredProcedure();
		return sp;
	}

	@CrossOrigin
	@RequestMapping(method=RequestMethod.POST, value="/generateTest")
	@ResponseStatus(value= HttpStatus.OK)
	public void something(){

	}
}
