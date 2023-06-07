package com.project;

import java.nio.channels.SelectionKey;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Automate_4_Dashboard{

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.qa.jbktest.com/online-exam#Testing");
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		Actions a= new Actions(driver);
		a.sendKeys(Keys.PAGE_DOWN).build().perform();
		driver.findElement(By.xpath("//*[@id=\"Testing\"]/div/div[19]/a")).click();
		driver.findElement(By.id("countbtn")).click();
		driver.findElement(By.name("loginmobile")).sendKeys("9090909000");
		driver.findElement(By.id("loginbtn")).click();
		driver.findElement(By.partialLinkText("Account")).click();
		driver.findElement(By.xpath("//*[@href='https://www.qa.jbktest.com/test/good-score']")).click();
		driver.findElement(By.partialLinkText("Back")).click();
		driver.findElement(By.xpath("//*[@href='https://www.qa.jbktest.com/topics-covered\']")).click();
		driver.findElement(By.partialLinkText("Back")).click();
		driver.findElement(By.partialLinkText("Logout")).click();
	    
		
		
		
		
		
		
		
		

	}

	
}
