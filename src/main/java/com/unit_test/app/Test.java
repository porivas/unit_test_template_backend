package com.unit_test.app;

import java.util.*;

public class Test {

	private String pre;
	private String test;
	private String post;
	
	public Test(){
		this.pre = "-- PRE <PROC>";
		this.test = "--TEST <PROC>";
		this.post = "-- POST <PROC>";
	}

	public Test(String pre, String test, String post){
		this.pre = pre;
		this.test = test;
		this.post = post;
	}

	public String getPre(){
		return pre;
	}

	public String getTest()
	{
		return test;
	}

	public String getPost(){
		return post;
	}

	public void setPre(String pre){
		this.pre = pre;
	}

	public void setTest(String t){
		this.test = t;
	}

	public void setPost(String post){
		this.post = post;
	}


	public void setName(String name){
		//fill with correct info later
		this.pre = this.pre.replace("<PROC>", name); 
		this.test = this.test.replace("<PROC>", name); 
		this.post = this.post.replace("<PROC>", name); 
	}	
}
