package com.project;


import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;


public class Automate {

	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.qa.jbktest.com/online-exam#Testing");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS );
		
		driver.findElement(By.xpath("//*[text()='Manual Testing(ISTQB)']")).click();
		driver.findElement(By.id("countbtn")).click();
		driver.findElement(By.id("signup-tab")).click();
		driver.findElement(By.xpath("(//input [@type='text' and @name='name'])")).sendKeys("dipak");
		driver.findElement(By.id("emailid")).sendKeys("m0@gmail.com");
		driver.findElement(By.id("mobile")).sendKeys("9090909000");
		Actions a= new Actions(driver);
		a.sendKeys(Keys.PAGE_DOWN).build().perform();
		driver.findElement(By.xpath("//input[@ type='checkbox' and @id='agree']")).click();
		driver.findElement(By.id("emailbtn")).click();
		
		driver.findElement(By.xpath("//*[@id=\"choices\"]/div[3]/label")).click();
		Actions b= new Actions(driver);
		b.sendKeys(Keys.PAGE_DOWN).build().perform();
		driver.findElement(By.xpath("//a[@class='btn quiz-btn qnext']")).click();
		driver.findElement(By.partialLinkText("My Account")).click();
		
	}

}
