package com.test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class NewTest4 {
	@Test
	public void webapllicationregistration()
	{
		System.setProperty("webdriver.chrome.driver","http://demowebshop.tricentis.com/");
		WebDriver driver=new ChromeDriver();
		driver.get("http://demowebshop.tricentis.com/");
		driver.findElement(By.linkText("Register")).click();
		String title=driver.getTitle();
		Assert.assertTrue(title.contains("Register"));
		driver.findElement(By.id("gender-male")).click();
	
	
	}
	

}
