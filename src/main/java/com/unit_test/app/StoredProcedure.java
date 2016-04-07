package com.unit_test.app;

import java.util.ArrayList;

public class StoredProcedure {

	private ArrayList <String> stored_procedures = new ArrayList<String>();
	
	public StoredProcedure(){
		//fill with correct info later
		this.stored_procedures.add("test");
		this.stored_procedures.add("test2");
	}
	
	public ArrayList<String> getList(){
		return stored_procedures;
	}
}
