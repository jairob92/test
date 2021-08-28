package com.project.pom;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;

public class RegisterUser_test {
	private WebDriver driver;
	RegisterUser authentication;

	@Before
	public void setUp() throws Exception {
		authentication = new RegisterUser(driver);
		driver = authentication.chromeDriverConnection();
		authentication.visit("http://automationpractice.com/");
	}

	@After
	public void tearDown() throws Exception {
		driver.quit();
	}

	@Test
	public void test() throws InterruptedException {
		authentication.registerUser();
	}

}
