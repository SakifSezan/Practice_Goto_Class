package com.nextmaven.USA;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;

public class NewTest {
  @Test
  public void f() {
	  
	  System.out.println("In Test");
  }
  @BeforeTest
  public void beforeTest() {
	  
	  System.out.println("In Before Test");
  }

  @AfterTest
  public void afterTest() {
	  
	  System.out.println("In After Test");
  }

}
