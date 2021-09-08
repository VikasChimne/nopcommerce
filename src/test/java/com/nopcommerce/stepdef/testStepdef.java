package com.nopcommerce.stepdef;


import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class testStepdef {
	 WebDriver driver;

		@Given("user launch chrome browser")
		public void user_launch_chrome_browser() {
			//System.setProperty("webdriver.chrome.driver","C:\\Users\\user\\eclipse-workspace\\nopcommerce\\nopcommerce\\chromedriver.exe");
		    driver = new ChromeDriver();
		    driver.manage().window().maximize();
		    driver.manage().deleteAllCookies();
		    driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		    
		}

		@When("user open URL {string}")
		public void user_open_url(String URL) {
			driver.get(URL);
		   
		}
		@Then("User enter login credentials")
		public void user_enter_login_credentials() throws InterruptedException {
			
			driver.findElement(By.xpath("//input[@id='Email']")).clear();
			
			Thread.sleep(2000);
			driver.findElement(By.xpath("//input[@id='Email']")).sendKeys("admin@yourstore.com");
			
			Thread.sleep(2000);
			driver.findElement(By.xpath("//input[@id='Password']")).clear();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//input[@id='Password']")).sendKeys("admin");
		   
		}
		@When("User click on login")
		public void user_click_on_login() {
			
			driver.findElement(By.xpath("//button[normalize-space()='Log in']")).click();
		    
		}
		@Then("User check tha page title {string}")
		public void user_check_tha_page_title(String pagetitle) {
			
			Assert.assertEquals("Page title is incorrect",pagetitle, driver.getTitle());
		   
		}
		@Then("User click on logout")
		public void user_click_on_logout() {
			
			driver.findElement(By.xpath("//a[normalize-space()='Logout']")).click();
		  
		}

		@Then("User close the browser")
		public void user_close_the_browser() {
		   driver.quit();
		}



}
