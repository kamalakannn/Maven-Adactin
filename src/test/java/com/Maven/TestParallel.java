package com.Maven;

import org.testng.annotations.Test;

public class TestParallel {
	
	
	@Test
	public void aMethod() {
		System.out.println("Ametthod");
	}
	
	@Test
	public void bMethod() {
		System.out.println("Bmetthod");
	}
	
	@Test(dependsOnMethods = "eMethod")
	public void cMethod() {
		System.out.println("Cmetthod");
	}
	
	@Test
	public void dMethod() {
		System.out.println("Dmetthod");
	}
	
	@Test
	public void eMethod() {
		System.out.println("Emetthod");
	}
	

}
