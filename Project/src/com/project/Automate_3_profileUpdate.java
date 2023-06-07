package com.project;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import javax.imageio.stream.FileImageInputStream;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Automate_3_profileUpdate {

	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver","chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.qa.jbktest.com/online-exam#Testing");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//*[text()='Manual Testing(ISTQB)']")).click();
		driver.findElement(By.id("countbtn")).click();
		driver.findElement(By.id("loginmobile")).sendKeys("9151109590");
		driver.findElement(By.id("loginbtn")).click();
		
		driver.findElement(By.partialLinkText("Account")).click();
		driver.findElement(By.partialLinkText("View Profile")).click();
		driver.findElement(By.id("name")).sendKeys("dipak");
		driver.findElement(By.id("name")).clear();
		driver.findElement(By.id("name")).sendKeys("Dipak patil");
		driver.findElement(By.id("emailid")).clear();
		driver.findElement(By.id("emailid")).sendKeys("dipak@gmail.com");
		driver.findElement(By.id("updatebtn")).click();
		
	}}