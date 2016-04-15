package com.unit_test.app;

import java.util.HashMap;

public class Test {

	private HashMap <String, String> tests = new HashMap<String, String>();
	
	public Test(){
		//fill with correct info later
		this.tests.put("pre", "pre body");
		this.tests.put("test", "test body");
		this.tests.put("post", "post body");
	}
	
	public HashMap<String, String> getList(){
		return tests;
	}
}
