package com.start.projectname;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;

public class FirstTest {

	@BeforeSuite
	public void beforeSuite() {
		System.out.println("My before Suite"); 
	}
	@BeforeTest
	public void beforeTest1() {
		System.out.println("-My before Test"); 
	}
	
	@BeforeClass
	public void beforeClass() {
	System.out.println("--My before Class"); 
	}
		@BeforeMethod
		public void beforeMethod() {
		System.out.println("----My before Method"); 
		}

				@Test
				public void f() {
					System.out.println("=======My test ---f Method");
				}
				
				@Test
				public void a() {
					System.out.println("=======My test ---a Method");
				}
		
		@AfterMethod
		public void afterMethod() {
			System.out.println("----My after Method"); 
		}

	@AfterClass
	public void afterClass() {
	System.out.println("--My after Class"); 
	}
	
	@AfterSuite
	public void aferSuite() {
		System.out.println("My after Suite"); 
	}
	@AfterTest
	public void afterTest() {
		System.out.println("-My after Test");  
	}

}
