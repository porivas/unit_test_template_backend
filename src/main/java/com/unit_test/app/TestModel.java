package com.unit_test.app;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.*;

public class TestModel implements Serializable {

	@JsonProperty("proc")
	private String proc;

	@JsonProperty("action")
	private String action;
	
	@JsonProperty("template")
	private String template;

	@JsonProperty("generate")
	private String generate;
	
	public TestModel(){
		//fill with correct info later
		this.proc = "";
		this.action = "";
		this.template = "";
		this.generate = "";
	}

	public TestModel(String p, String a, String t, String g){
		//fill with correct info later
		this.proc = p;
		this.action = a;
		this.template = t;
		this.generate = g;
	}

	public String getProc(){
		return proc;
	}

	public String getAction(){
		return action;
	}
	
	public String getTemplate(){
		return template;
	}
	
	public String getGenerate(){
		return generate;
	}	

	public void setProc(String p){
		this.proc = p;
	}

	public void setAction(String a){
		this.action = a;
	}
	
	public void setTemplate(String t){
		this.template = t;
	}
	
	public void setGenerate(String g){
		this.generate = g;
	}	
}
