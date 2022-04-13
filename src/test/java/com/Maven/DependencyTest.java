package com.Maven;

import org.testng.annotations.DataProvider;

import org.testng.annotations.Test;

public class DependencyTest {

		
		
	
	   @Test
       public void aMethod() {
		  System.out.println("A Method");

	   }	
	
		
		@Test
		public void bMethod() {
			System.out.println("Bmetthod");
		}
		
		@Test
		public void cMethod() {
			System.out.println("Cmetthod");
		}
	
		@Test
		public void dMethod() {
			System.out.println("Dmetthod");
		}
		
		@Test(dataProvider = "data")
		public void eMethod(String name, String name2) {
			System.out.println("Emetthod");
			System.out.println("name is "+" "+ name+"  "+"name is "+name2);
		}
		
		@DataProvider(name = "data")
		public Object[][] value() {
			
			return new  Object[][] {
				
				{"kamala","pass"},{"kann","word"},{"kamalakanngmail.com","123456678"}
				
				
			};
			
		}
		

	}



