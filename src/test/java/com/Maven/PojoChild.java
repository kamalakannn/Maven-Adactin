package com.Maven;

import com.Base.Pojo;

public class PojoChild {
	
	public static void main(String[] args) {
	Pojo a = new Pojo();
	a.setUserName("kamalakannan");
	String name = a.getUserName();
	
	a.setAge(20);
	int i = a.getAge();
	
	System.out.println(name +"  " + i); 
	
	
	
	}
}
