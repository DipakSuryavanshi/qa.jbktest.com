package com.project;

import java.io.FileInputStream;
	import java.io.FileNotFoundException;
	import java.util.Properties;
	import java.util.concurrent.TimeUnit;

	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.chrome.ChromeDriver;
	import org.openqa.selenium.support.ui.Select;
	import org.testng.Assert;
	import org.testng.annotations.Test;

public class Testing_qajbktest {
		@Test
		public void verifyQuizTitle() {
			System.setProperty("webdriver.chrome.driver","chromedriver.exe");
			WebDriver driver=new ChromeDriver();
			driver.get("https://www.qa.jbktest.com/online-exam");
			driver.findElement(By.partialLinkText("Testing")).click();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			driver.findElement(By.xpath("//*[text()='Manual Testing']")).click();
			System.out.println(driver.getTitle());
		String axceMsg="Practice Online Quiz | Take a Online Test - JavaByKiran";
		String actMsg=driver.getTitle();
		driver.close();
		Assert.assertEquals(axceMsg,actMsg);
		}
		@Test
		public void verifyTestingquizHeading() {
			System.setProperty("webdriver.chrome.driver","chromedriver.exe");
			WebDriver driver=new ChromeDriver();
			driver.get("https://www.qa.jbktest.com/online-exam");
			driver.findElement(By.partialLinkText("Testing")).click();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			String actHeading=driver.findElement(By.xpath("//div[10]/h3")).getText();
			System.out.println(actHeading);
			String excHeading="Testing";
			Assert.assertEquals(actHeading, excHeading);
		}
		@Test
	    void VerifyLoginPageName() {
	    	System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
			WebDriver driver = new ChromeDriver();
			driver.get("https://www.qa.jbktest.com/online-exam#Testing");
			driver.manage().window().maximize();
	       driver.manage().timeouts().implicitlyWait(40,TimeUnit.SECONDS);
	       driver.findElement(By.xpath("//*[@id=\"Testing\"]")).click();
	       driver.findElement(By.id("countbtn")).click();
	       String checklabel = driver.findElement(By.xpath("//*[@id=\"quizlogin\"]/div[1]/div[1]/label")).getText();
	       driver.close();
	       Assert.assertEquals(checklabel, "Enter Your Mobile Number");
		}
		
		 @Test
		    public void verifyLoginFunErrTitlelid() {
		    	System.setProperty("webdriver.chrome.driver","chromedriver.exe");
		    	WebDriver driver=new ChromeDriver();
		    	driver.get("https://www.qa.jbktest.com/online-exam");
		    	driver.findElement(By.partialLinkText("Testing")).click();
		    	driver.manage().window().maximize();
		    	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		    	driver.findElement(By.xpath("//*[text()='Manual Testing']")).click();
		    	driver.findElement(By.id("countbtn")).click();
		    	driver.findElement(By.id("loginmobile")).sendKeys("9545124788");
		    	driver.findElement(By.id("loginbtn")).click();
		    	String actMsg=driver.findElement(By.id("loginerr")).getText();
		    	System.out.println(actMsg);
		    	driver.quit();
		    	Assert.assertEquals(actMsg, "Please enter mobile number, If you have not registered, please click signup tab to get registered.");
		    	
		    }
		
		
	@Test
	public void verifyLoginFunBlankError() {
		System.setProperty("webdriver.chrome.driver","chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.qa.jbktest.com/online-exam");
		driver.findElement(By.partialLinkText("Testing")).click();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//*[text()='Manual Testing']")).click();
		driver.findElement(By.id("countbtn")).click();
		driver.findElement(By.id("loginbtn")).click();
		String actMsg=driver.findElement(By.id("loginerr")).getText();
		System.out.println(actMsg);
		driver.quit();
		Assert.assertEquals(actMsg, "Please enter valid mobile number, If you have not registered, please click signup tab to get registered.");
		
	}
	@Test
	public void verifyLoginFunInvalidNo() {
		System.setProperty("webdriver.chrome.driver","chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.qa.jbktest.com/online-exam");
		driver.findElement(By.partialLinkText("Testing")).click();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//*[text()='Manual Testing']")).click();
		driver.findElement(By.id("countbtn")).click();
		driver.findElement(By.id("loginmobile")).sendKeys("987609987766");
		driver.findElement(By.id("loginbtn")).click();
		String actMsg=driver.findElement(By.id("loginerr")).getText();
		System.out.println(actMsg);
	driver.quit();
		Assert.assertEquals(actMsg, "Please enter valid mobile number, If you have not registered, please click signup tab to get registered.");
			
	}
	@Test
	public void VerifyloginFunValidNo() {
	System.setProperty("webdriver.chrome.driver","chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.qa.jbktest.com/online-exam");
	driver.findElement(By.partialLinkText("Testing")).click();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	driver.findElement(By.xpath("//*[text()='Manual Testing']")).click();
	driver.findElement(By.id("countbtn")).click();
	driver.findElement(By.xpath("//*[@type='number']")).sendKeys("9090909090");
	driver.findElement(By.id("loginbtn")).click();
//	driver.quit();
	}
	@Test
	public void verifySignFunBlankNameErr() {
		System.setProperty("webdriver.chrome.driver","chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.qa.jbktest.com/online-exam");
		driver.findElement(By.partialLinkText("Testing")).click();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//*[text()='Manual Testing']")).click();
		driver.findElement(By.id("countbtn")).click();
		driver.findElement(By.id("signup-tab")).click();
		driver.findElement(By.id("name")).sendKeys("");
		driver.findElement(By.id("emailid")).sendKeys("");
		driver.findElement(By.id("mobile")).sendKeys("");
		driver.findElement(By.id("agree"));
		driver.findElement(By.id("emailbtn")).click();
		String actErr=driver.findElement(By.id("emailerr")).getText();
		String excErr="Please enter email address";
		driver.quit();
	}
	@Test
	public void verifySignFunBlankEmailErr() {
		System.setProperty("webdriver.chrome.driver","chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.qa.jbktest.com/online-exam");
		driver.findElement(By.partialLinkText("Testing")).click();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//*[text()='Manual Testing']")).click();
		driver.findElement(By.id("countbtn")).click();
		driver.findElement(By.id("signup-tab")).click();
		driver.findElement(By.id("name")).sendKeys("");
		driver.findElement(By.id("emailid")).sendKeys("dipak1@gmail.com");
		driver.findElement(By.id("mobile")).sendKeys("");
		driver.findElement(By.id("agree"));
		driver.findElement(By.id("emailbtn")).click();
		String actErr=driver.findElement(By.id("name")).getAttribute("ErrorMsg");
		String excErr="Please enter name";
		driver.quit();
	Assert.assertEquals(actErr, excErr);
		
	}
	@Test
	public void verifySignFunBlankMobileErr() {
		System.setProperty("webdriver.chrome.driver","chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.qa.jbktest.com/online-exam");
		driver.findElement(By.partialLinkText("Testing")).click();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//*[text()='Manual Testing']")).click();
		driver.findElement(By.id("countbtn")).click();
		driver.findElement(By.id("signup-tab")).click();
		driver.findElement(By.id("name")).sendKeys("Dipak");
		driver.findElement(By.id("emailid")).sendKeys("dipak1@gmail.com");
		driver.findElement(By.id("mobile")).sendKeys("");
		driver.findElement(By.id("agree"));
		driver.findElement(By.id("emailbtn")).click();
		String actErr=driver.findElement(By.id("mobileerr")).getText();
		System.out.println(actErr);
		String axcErr="Please enter mobile number!";
		driver.quit();
		Assert.assertEquals(actErr, axcErr);
	}
	@Test
	public void verifySignFunBlankChekboxErr() {
		System.setProperty("webdriver.chrome.driver","chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.qa.jbktest.com/online-exam");
		driver.findElement(By.partialLinkText("Testing")).click();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//*[text()='Manual Testing']")).click();
		driver.findElement(By.id("countbtn")).click();
		driver.findElement(By.id("signup-tab")).click();
		driver.findElement(By.id("name")).sendKeys("Dipak");
		driver.findElement(By.id("emailid")).sendKeys("dipak1@gmail.com");
		driver.findElement(By.id("mobile")).sendKeys("9090909090");
		driver.findElement(By.id("agree"));
		driver.findElement(By.id("emailbtn")).click();
		String actErr=driver.findElement(By.id("agreeerr")).getText();
		System.out.println(actErr);
		String axcErr="Please select terms and condition checkbox.";
		driver.quit();
		Assert.assertEquals(actErr, axcErr);
	}
	@Test
	public void verifySignFunInvalidEmailErr() {
		System.setProperty("webdriver.chrome.driver","chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.qa.jbktest.com/online-exam");
		driver.findElement(By.partialLinkText("Testing")).click();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//*[text()='Manual Testing']")).click();
		driver.findElement(By.id("countbtn")).click();
		driver.findElement(By.id("signup-tab")).click();
		driver.findElement(By.id("name")).sendKeys("Dipak");
		driver.findElement(By.id("emailid")).sendKeys("");
		driver.findElement(By.id("mobile")).sendKeys("");
		driver.findElement(By.id("agree"));
		driver.findElement(By.id("emailbtn")).click();
		String actErr=driver.findElement(By.id("emailerr")).getText();
		String axcErr="Please enter valid email";
		driver.quit();
	Assert.assertEquals(actErr, axcErr);
	}
	@Test
	public void verifySignFunInvalidNameErr() {
		System.setProperty("webdriver.chrome.driver","chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.qa.jbktest.com/online-exam");
		driver.findElement(By.partialLinkText("Testing")).click();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//*[text()='Manual Testing']")).click();
		driver.findElement(By.id("countbtn")).click();
		driver.findElement(By.id("signup-tab")).click();
		driver.findElement(By.id("name")).sendKeys("7797979");
		driver.findElement(By.id("emailid")).sendKeys("");
		driver.findElement(By.id("mobile")).sendKeys("");
		driver.findElement(By.id("agree"));
		driver.findElement(By.id("emailbtn")).click();
		String actErr=driver.findElement(By.id("name")).getAttribute("InvalidNameError");
		String axcErr="Please enter valid name";
		driver.quit();
	Assert.assertEquals(actErr, axcErr);

	}
	@Test
	public void verifySignFunInvalidMobileErr() {
		System.setProperty("webdriver.chrome.driver","chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.qa.jbktest.com/online-exam");
		driver.findElement(By.partialLinkText("Testing")).click();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//*[text()='Manual Testing']")).click();
		driver.findElement(By.id("countbtn")).click();
		driver.findElement(By.id("signup-tab")).click();
		driver.findElement(By.id("name")).sendKeys("Dipak");
		driver.findElement(By.id("emailid")).sendKeys("dipak1@gmail.com");
		driver.findElement(By.id("mobile")).sendKeys("");
		driver.findElement(By.id("agree"));
		driver.findElement(By.id("emailbtn")).click();
		String actErr=driver.findElement(By.id("mobileerr")).getText();
		System.out.println(actErr);
		String axcErr="Please enter a valid number!";
		driver.quit();
		Assert.assertEquals(actErr, axcErr);
	}
	@Test
	public void verifySignFunValidCredential() {
		System.setProperty("webdriver.chrome.driver","chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.qa.jbktest.com/online-exam");
		driver.findElement(By.partialLinkText("Testing")).click();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//*[text()='Manual Testing']")).click();
		driver.findElement(By.id("countbtn")).click();
		driver.findElement(By.id("signup-tab")).click();
		driver.findElement(By.id("name")).sendKeys("Dipak");
		driver.findElement(By.id("emailid")).sendKeys("dip7@gmail.com");
		driver.findElement(By.id("mobile")).sendKeys("9090909090");
		driver.findElement(By.id("agree")).click();
		driver.findElement(By.id("emailbtn")).click();
		System.out.println("After Sign up quiz should successfuly open ");
		
		driver.quit();
		
		
	}

	@Test 
	public void verifyManualTestingQuizTitle() {
		System.setProperty("webdriver.chrome.driver","chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.qa.jbktest.com/online-exam");
		driver.findElement(By.partialLinkText("Testing")).click();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//*[text()='Manual Testing']")).click();
		driver.findElement(By.id("countbtn")).click();
		driver.findElement(By.xpath("//*[@type='number']")).sendKeys("9090909090");
		driver.findElement(By.id("loginbtn")).click();
		
		String actTitle=driver.findElement(By.id("quizheading")).getText();
		String axcTitle="Manual Testing Quiz";
		System.out.println(actTitle);
		driver.quit();
		Assert.assertEquals(axcTitle,"Manual Testing Quiz");
	}
	@Test
	public void verifyContributeFunSubmitMsg() {
		System.setProperty("webdriver.chrome.driver","chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.qa.jbktest.com/online-exam");
		driver.findElement(By.xpath("//*[@class='btn ']")).click();
		driver.findElement(By.name("first_name")).sendKeys("dipak");
		driver.findElement(By.name("email")).sendKeys("dipak121@gmail.com");
		driver.findElement(By.name("phone_number")).sendKeys("9777779012");
		Select objSelect =new Select(driver.findElement(By.id("exampleFormControlSelect1")));
		objSelect.selectByVisibleText("Moderator");
		driver.findElement(By.name("submit")).click();
		String actMsg=driver.findElement(By.id("mail_success")).getText();
		String axcMsg="Mail Sent. Thank you dipak, we will contact you shortly.";
		System.out.println(actMsg);
		driver.quit();
		Assert.assertEquals(actMsg, axcMsg);	
	}
	@Test
	public void verifyContributeFunBlankName() {
		System.setProperty("webdriver.chrome.driver","chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.qa.jbktest.com/online-exam");
		driver.findElement(By.xpath("//*[@class='btn ']")).click();
		driver.findElement(By.name("first_name")).sendKeys("");
		driver.findElement(By.name("email")).sendKeys("dipak121@gmail.com");
		driver.findElement(By.name("phone_number")).sendKeys("9777779012");
		Select objSelect =new Select(driver.findElement(By.id("exampleFormControlSelect1")));
		objSelect.selectByVisibleText("Moderator");
		driver.findElement(By.name("submit")).click();	
		String actErr=driver.findElement(By.xpath("//div[1]/span")).getText();
		String excErr="required";
		System.out.println(actErr);
		
		Assert.assertEquals(actErr, excErr);
	}
	@Test
	public void verifyContributeFunBlankEmail() {
		System.setProperty("webdriver.chrome.driver","chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.qa.jbktest.com/online-exam");
		driver.findElement(By.xpath("//*[@class='btn ']")).click();
		driver.findElement(By.name("first_name")).sendKeys("dipak");
		driver.findElement(By.name("email")).sendKeys("");
		driver.findElement(By.name("phone_number")).sendKeys("9777779012");
		Select objSelect =new Select(driver.findElement(By.id("exampleFormControlSelect1")));
		objSelect.selectByVisibleText("Moderator");
		driver.findElement(By.name("submit")).click();	
		String actErr=driver.findElement(By.xpath("//div[2]/span")).getText();
		String excErr="required";
		System.out.println(actErr);
		
		Assert.assertEquals(actErr, excErr);
	}
	@Test
	public void verifyContributeFunBlankMobile() {
		System.setProperty("webdriver.chrome.driver","chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.qa.jbktest.com/online-exam");
		driver.findElement(By.xpath("//*[@class='btn ']")).click();
		driver.findElement(By.name("first_name")).sendKeys("dipak");
		driver.findElement(By.name("email")).sendKeys("dipak123@gmail.com");
		driver.findElement(By.name("phone_number")).sendKeys("");
		Select objSelect =new Select(driver.findElement(By.id("exampleFormControlSelect1")));
		objSelect.selectByVisibleText("Moderator");
		driver.findElement(By.name("submit")).click();	
		String actErr=driver.findElement(By.xpath("//div[3]/span")).getText();
		String excErr="required";
		System.out.println(actErr);
		driver.quit();
		Assert.assertEquals(actErr, excErr);
	}
	@Test
	public void verifyContributeFunInvalidEmail() {
		System.setProperty("webdriver.chrome.driver","chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.qa.jbktest.com/online-exam");
		driver.findElement(By.xpath("//*[@class='btn ']")).click();
		driver.findElement(By.name("first_name")).sendKeys("dipak");
		driver.findElement(By.name("email")).sendKeys("xyz");
		driver.findElement(By.name("phone_number")).sendKeys("1234564321");
		Select objSelect =new Select(driver.findElement(By.id("exampleFormControlSelect1")));
		objSelect.selectByVisibleText("Moderator");
		driver.findElement(By.name("submit")).click();	
		
		String	messagetoVerify = "Please include an '@' in the email address. 'xyz' is missing an '@'.";
		String	myValidationmsg = driver.findElement(By.name("email")).getAttribute("validationMessage");
		System.out.println(messagetoVerify);
		driver.quit();
		Assert.assertEquals(messagetoVerify,myValidationmsg);
		
	}
	@Test
	public void verifyProfileUpdateFunBlankNameErr() {
		System.setProperty("webdriver.chrome.driver","chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.qa.jbktest.com/online-exam");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.findElement(By.partialLinkText("Testing")).click();
		driver.findElement(By.xpath("//*[text()='Manual Testing']")).click();
		driver.findElement(By.id("countbtn")).click();
		driver.findElement(By.xpath("//*[@type='number']")).sendKeys("9834625062");
		driver.findElement(By.id("loginbtn")).click();
		driver.findElement(By.partialLinkText("My Account")).click();
		driver.findElement(By.partialLinkText("View Profile")).click();
		driver.findElement(By.name("name")).sendKeys("");
		driver.findElement(By.name("emailid")).sendKeys("");
		
		driver.findElement(By.name("mobile")).sendKeys("");
		driver.findElement(By.id("updatebtn")).click();
		
		String	actMsg = "Please fill out this field.";
		String	excMsg = driver.findElement(By.name("name")).getAttribute("validationMessage");
		System.out.println(actMsg);
		driver.quit();
		Assert.assertEquals(actMsg,excMsg);
	}
	@Test
	public void verifyProfileUpdateFunBlankEmailErr() {
		System.setProperty("webdriver.chrome.driver","chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.qa.jbktest.com/online-exam");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.findElement(By.partialLinkText("Testing")).click();
		driver.findElement(By.xpath("//*[text()='Manual Testing']")).click();
		driver.findElement(By.id("countbtn")).click();
		driver.findElement(By.xpath("//*[@type='number']")).sendKeys("9090909090");
		driver.findElement(By.id("loginbtn")).click();
		driver.findElement(By.partialLinkText("My Account")).click();
		driver.findElement(By.partialLinkText("View Profile")).click();
		driver.findElement(By.name("name")).sendKeys("");
		driver.findElement(By.name("emailid")).sendKeys("");
		
		driver.findElement(By.name("mobile")).sendKeys("");
		driver.findElement(By.id("updatebtn")).click();
		
		String excMsg = "Please fill out this field.";
		String	actMsg = driver.findElement(By.id("emailid")).getAttribute("actMsg");
		System.out.println(actMsg);
		driver.quit();
		Assert.assertEquals(actMsg,excMsg);
	}
	@Test
	public void verifyProfileUpdateFunUpdateMsg() {
		System.setProperty("webdriver.chrome.driver","chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.qa.jbktest.com/online-exam");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.findElement(By.partialLinkText("Testing")).click();
		driver.findElement(By.xpath("//*[text()='Manual Testing']")).click();
		driver.findElement(By.id("countbtn")).click();
		driver.findElement(By.xpath("//*[@type='number']")).sendKeys("9090909090");
		driver.findElement(By.id("loginbtn")).click();
		driver.findElement(By.partialLinkText("My Account")).click();
		driver.findElement(By.partialLinkText("View Profile")).click();
		driver.findElement(By.name("name")).sendKeys("SP");
		driver.findElement(By.name("emailid")).sendKeys("");
		driver.findElement(By.name("mobile")).sendKeys("");
		driver.findElement(By.id("updatebtn")).click();
		String excMsg="Profile successfully updated";
		String actMsg=driver.findElement(By.id("msg")).getText();
		System.out.println(actMsg);
		driver.quit();
		Assert.assertEquals(actMsg,excMsg );
		
	}
	@Test
	public void verifyTestAttemptTitle() {
		System.setProperty("webdriver.chrome.driver","chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.qa.jbktest.com/online-exam");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.findElement(By.partialLinkText("Testing")).click();
		driver.findElement(By.xpath("//*[text()='Manual Testing']")).click();
		driver.findElement(By.id("countbtn")).click();
		driver.findElement(By.xpath("//*[@type='number']")).sendKeys("9090909090");
		driver.findElement(By.id("loginbtn")).click();
		driver.findElement(By.partialLinkText("My Account")).click();
		System.out.println(driver.getTitle());
		String actMsg=driver.findElement(By.className("card-category")).getText();
		String excMsg="Test Attempted";
		System.out.println(actMsg);
		driver.quit();
		Assert.assertEquals(actMsg, excMsg);
	}
	@Test
	public void verifyGoodScoreTitle() {
		System.setProperty("webdriver.chrome.driver","chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.qa.jbktest.com/online-exam");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.findElement(By.partialLinkText("Testing")).click();
		driver.findElement(By.xpath("//*[text()='Manual Testing']")).click();
		driver.findElement(By.id("countbtn")).click();
		driver.findElement(By.xpath("//*[@type='number']")).sendKeys("9090909090");
		driver.findElement(By.id("loginbtn")).click();
		driver.findElement(By.partialLinkText("My Account")).click();
		driver.findElement(By.xpath("//div[2]/div/div/div/div[1]/div/a")).click();
		String actTitle=	driver.findElement(By.xpath("//*[@class='text-right']")).getText();
		String excTitle="Good Perfomance";
		System.out.println(actTitle);
		driver.quit();
		Assert.assertEquals(actTitle, excTitle);
	}
	@Test
	public void verifyDashboardTitle() {
		System.setProperty("webdriver.chrome.driver","chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.qa.jbktest.com/online-exam");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.findElement(By.partialLinkText("Testing")).click();
		driver.findElement(By.xpath("//*[text()='Manual Testing']")).click();
		driver.findElement(By.id("countbtn")).click();
		driver.findElement(By.xpath("//*[@type='number']")).sendKeys("9090909090");
		driver.findElement(By.id("loginbtn")).click();
		driver.findElement(By.partialLinkText("My Account")).click();
		String actTitle=driver.findElement(By.xpath("//div[2]/div[1]/div[1]/h4")).getText();
		String excTitle="Dashboard";
		System.out.println(actTitle);
		driver.quit();
		Assert.assertEquals(actTitle, excTitle);
		
	}
	@Test
	public void verifyFailedAttemptHeading() {
		System.setProperty("webdriver.chrome.driver","chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.qa.jbktest.com/online-exam");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.findElement(By.partialLinkText("Testing")).click();
		driver.findElement(By.xpath("//*[text()='Manual Testing']")).click();
		driver.findElement(By.id("countbtn")).click();
		driver.findElement(By.xpath("//*[@type='number']")).sendKeys("9090909090");
		driver.findElement(By.id("loginbtn")).click();
		driver.findElement(By.partialLinkText("My Account")).click();
		driver.findElement(By.xpath("//a[@href='https://www.qa.jbktest.com/test/failed-attempt']")).click();
		String actTitle=driver.findElement(By.xpath("//h4[@class='text-right']")).getText();
		String excTitle="Failed Attempted Quiz";
		System.out.println(actTitle);
		driver.quit();
		Assert.assertEquals(actTitle, excTitle);
	
}
	
	@Test
	public void verifyNewRegistionHeading() {
		System.setProperty("webdriver.chrome.driver","chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.qa.jbktest.com/online-exam");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.findElement(By.partialLinkText("Testing")).click();
		driver.findElement(By.xpath("//*[text()='Manual Testing']")).click();
		driver.findElement(By.id("countbtn")).click();
		String actHeading=driver.findElement(By.xpath("//*[@class='signuptab text-primary']")).getText();
		String	excHeading="Do Registaring A New Candidate Click On Link";
		System.out.println(actHeading);
	driver.quit();
		Assert.assertEquals(actHeading, excHeading);
		
	}
@Test
public void verifyTimelineHeading() {
	System.setProperty("webdriver.chrome.driver","chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.qa.jbktest.com/online-exam");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	driver.findElement(By.partialLinkText("Testing")).click();
	driver.findElement(By.xpath("//*[text()='Manual Testing']")).click();
	driver.findElement(By.id("countbtn")).click();
	driver.findElement(By.xpath("//*[@type='number']")).sendKeys("9090909090");
	driver.findElement(By.id("loginbtn")).click();
	driver.findElement(By.partialLinkText("My Account")).click();
	String actHeading=driver.findElement(By.xpath("//div[4]/div/div/div/div[1]/div/p")).getText();
	String excHeading="Timeline";
	System.out.println(actHeading);
	driver.close();
	Assert.assertEquals(actHeading, excHeading);
	
}
}

