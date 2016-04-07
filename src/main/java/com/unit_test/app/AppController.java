package com.unit_test.app;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
//import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;	

@RestController
public class AppController {

	@RequestMapping(method=RequestMethod.GET, value="/storedProcedures")
	public StoredProcedure getProcedures(){
		StoredProcedure sp = new StoredProcedure();
		return sp;
		//return null;
	}
}
