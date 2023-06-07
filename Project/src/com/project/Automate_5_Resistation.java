package com.project;



import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class Automate_5_Resistation {

	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver=new ChromeDriver ();
		FileInputStream fis=new FileInputStream("project.properties");
		
		
		Properties properties=new Properties();
		
		properties.load(fis);
		
		String val=properties.getProperty("url3");
		
		driver.get(val);
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		
		Actions a= new Actions(driver);
		
		a.sendKeys(Keys.PAGE_DOWN).build().perform();
		
	driver.findElement(By.xpath("//*[@id=\"Testing\"]/div/div[19]/a")).click();
	driver.findElement(By.partialLinkText("@javabykiran")).click();
	driver.findElement(By.xpath("//*[@type='button']")).click();
	driver.findElement(By.xpath("//div/div/div/div/section[1]/div/div/div/div/div[2]/section[2]/div/div/div[1]/div/div/div[1]/div/div")).click();
	driver.findElement(By.xpath("//div[2]/div/form/div/div[1]/input")).sendKeys("dipak");
	driver.findElement(By.id("form-field-email")).sendKeys("dipak321@gmail.com");
	driver.findElement(By.id("form-field-field_2")).sendKeys("485034855");
	}

}
