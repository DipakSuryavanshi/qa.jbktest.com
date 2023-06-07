package com.project;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

import javax.imageio.stream.FileImageInputStream;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;


//7020192726doutsession
public class Automate_2_Countribute {

	public static void main(String[] args) throws Exception {
	System.setProperty("webdriver.chrome.driver","chromedriver.exe");
		WebDriver driver=new ChromeDriver();
	FileInputStream fis= new FileInputStream("project.properties");
	Properties property=new Properties();
	property.load(fis);
	String value=property.getProperty("url");
	driver.get(value);
	driver.findElement(By.name("first_name")).sendKeys("dipak suryavanshi");
	driver.findElement(By.xpath("//div[2]/input")).sendKeys("dipak07@gmail.com");
	
	driver.findElement(By.id("phone")).sendKeys("3534544490");
	Actions a= new Actions(driver);
	a.sendKeys(Keys.PAGE_DOWN).build().perform();
	Select select = new Select(driver.findElement(By.id("exampleFormControlSelect1")));
	select.selectByIndex(1);
	driver.findElement(By.xpath("//button[@ type='submit' and @name='submit']")).click();
	}
}