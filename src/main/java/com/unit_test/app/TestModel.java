package com.unit_test.app;

import java.io.Serializable;

public class TestModel {

	private String _procName = "";
	private String _action = "";
	private String _template = "";
	private String _generate = "";
	
	public TestModel(){
		//fill with correct info later
		this._procName = "";
		this._action = "";
		this._template = "";
		this._generate = "";
	}

	public TestModel(String p, String a, String t, String g){
		//fill with correct info later
		this._procName = p;
		this._action = a;
		this._template = t;
		this._generate = g;
	}

	public String getProcName(){
		return _procName;
	}

	public String getAction(){
		return _action;
	}
	
	public String getTemplate(){
		return _template;
	}
	
	public String getGenerate(){
		return _generate;
	}	

	public String setProcName(){
		return this._procName;
	}

	public String setAction(){
		return this._action;
	}
	
	public String setTemplate(){
		return this._template;
	}
	
	public String setGenerate(){
		return this._generate;
	}	
}
