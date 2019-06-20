package com.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class NewTest3 {
	private static final String Male = null;

	@Test
	public void testdemowebRegistration()
	{
		System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://demowebshop.tricentis.com");
		driver.manage().window().maximize();
		driver.findElement(By.linkText("Register")).click();
		String title=driver.getTitle();
		Assert.assertTrue(title.contains("Register"));
		driver.findElement(By.id("gender-male")).click();
		driver.findElement(By.id("FirstName")).sendKeys("Ebinezar");
		driver.findElement(By.id("LastName")).sendKeys("Mikkili");
		driver.findElement(By.id("Email")).sendKeys("ebimikkili123@gmail.com");
		driver.findElement(By.id("Password")).sendKeys("965269");
		driver.findElement(By.id("ConfirmPassword")).sendKeys("965269");
		driver.findElement(By.cssSelector("input[value='Register']")).click();
		driver.findElement(By.cssSelector("input[value='Continue']")).click();
		boolean flag=driver.findElement(By.linkText("Log out")).isDisplayed();
		Assert.assertTrue(flag);
		driver.findElement(By.linkText("Log out")).click();
		driver.close();
		
	}

}
