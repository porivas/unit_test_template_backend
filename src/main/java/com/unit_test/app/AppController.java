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

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.core.*;

import org.springframework.web.bind.annotation.ResponseBody;

@RestController
public class AppController {

 	private HashMap<String, Test> _testStore = new HashMap<String, Test>();

	@CrossOrigin
	@RequestMapping(value="/storedProcedures", method=RequestMethod.GET)
	public StoredProcedure getProcedures(){
		StoredProcedure sp = new StoredProcedure();
		return sp;
	}

	@CrossOrigin
	@RequestMapping(value="/generateTest", method=RequestMethod.POST, consumes="application/json")
	public @ResponseBody Test getTestForProc(@RequestBody String json){
	
		/*
		bottom 3 lines work!!
		StringBuilder reponseData = new StringBuilder();
		reponseData.append(json);
		return reponseData.toString();*/
		
		/* these also work!!
		Test t = new Test();
		t.setName("Pablo");
		return t; */

		ObjectMapper mapper = new ObjectMapper();
		TestModel tm = new TestModel();
		try {
	        tm = mapper.readValue(json, TestModel.class);

	    } catch (JsonGenerationException e) {
	        e.printStackTrace();
	    } catch (IOException e) {
	        e.printStackTrace();
	    }

		Test t = new Test();
		t.setName(tm.getProc());
		return t;

	}
}
