package com.forms;

import java.util.Random;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class TestCases {
	public WebDriver driver;
	WebElement element;
	Random randomGenerator = new Random();  
	int randomInt = randomGenerator.nextInt(500);  
	@Given("^Open Application$")
	public void openbrowser() throws Exception {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\mohdi\\Drivers\\chromedriver_win32\\chromedriver.exe");
	    driver = new ChromeDriver();
	    driver.manage().window().maximize();
		//driver.navigate().to("https://www.smatbot.com/login");
		System.out.println("Application Opened");
//		Thread.sleep(10000);
	}
	@When("^Login Into Smatbot$")
	public void login_Into_Application() throws Exception{
		driver.navigate().to("https://www.smatbot.com/login");
	    Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id=\"email\"]")).sendKeys("test@feltso.com");
		System.out.println("Email entered");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("labolgPaSS@327");
		Thread.sleep(3000);
		System.out.println("password entered");
		driver.findElement(By.xpath("//*[@id=\"login-button\"]")).click();
		System.out.println("clicked on login button");
		Thread.sleep(25000);
}
	@When("^Signup into smatbot$")
	public void smatbotsignup1() throws Exception {
		driver.navigate().to("https://www.smatbot.com/signup");
		Thread.sleep(3000);
		Select st = new Select(driver.findElement(By.xpath("//*[@id=\"body\"]/div[3]/div/form/div[3]/div[1]/select")));
		st.selectByIndex(0);
	    System.out.println("Clicked on free plan");
	    Thread.sleep(3000);
	    driver.findElement(By.xpath("//*[@id=\"email\"]")).sendKeys("testsignup"+randomInt+"@gmail.com");
	    System.out.println("Entered Email address");
	    Thread.sleep(3000);
	    driver.findElement(By.xpath("//*[@id=\"url\"]")).sendKeys("https://www.smatbot.com");
	    System.out.println("Entered Url");
	    Thread.sleep(3000);
	    driver.findElement(By.xpath("//*[@id=\"password-other\"]")).sendKeys("Test123$");
	    System.out.println("Entered Password");
	    Thread.sleep(3000);
	    driver.findElement(By.xpath("//*[@id=\"body\"]/div[3]/div/form/div[3]/div[5]/div/input")).click();
	    System.out.println("Clicked on Terms and Condition check box");
	    Thread.sleep(3000);
	    driver.findElement(By.xpath("//*[@id=\"signup-button\"]/span/span")).click();
	    System.out.println("Clicked on signup button");
	    Thread.sleep(5000);
	}
	@When("^Entering addtional Details$")
	public void detailsenter1() throws Exception {
		driver.findElement(By.xpath("//*[@id=\"body\"]/div[3]/div/form/div[3]/div[1]/input")).sendKeys("test");
	    System.out.println("Entered Name");
	    Thread.sleep(3000);
	    driver.findElement(By.xpath("//*[@id=\"body\"]/div[3]/div/form/div[3]/div[2]/input")).sendKeys("9059085621");
	    System.out.println("Entered mobile number");
	    Thread.sleep(3000);
	    Select st1 = new Select(driver.findElement(By.xpath("//*[@id=\"body\"]/div[3]/div/form/div[3]/div[4]/select")));
		st1.selectByIndex(1);
		driver.findElement(By.xpath("//*[@id=\"body\"]/div[3]/div/form/div[3]/div[5]/button/span")).click();
		Thread.sleep(3000);
		System.out.println("Clicked on submit button");
		Thread.sleep(20000);
	}
	@When("^entering details on ContactUs page$")
	public void contact() throws Exception{
		driver.navigate().to("https://www.smatbot.com/contact-us?user=test_project");
		
		driver.findElement(By.id("contact-name")).sendKeys("test");
		driver.findElement(By.id("contact-email")).sendKeys("testsignup@gmail.com");
		driver.findElement(By.id("contact-phone")).sendKeys("9059082245");
		driver.findElement(By.id("contact-message")).sendKeys("This is a testing msg");
		System.out.println("msg entered");
		Thread.sleep(5000);	
		driver.findElement(By.id("send_message")).click();
		System.out.println("Msg sent");
		Thread.sleep(3000);
	}
	@When("^clicking try free button in GetStarted page$")
	public void getstarted() throws Exception {
		driver.navigate().to("https://www.smatbot.com/");
		Thread.sleep(25000);
		driver.findElement(By.id("minimise")).click();
		
		driver.findElement(By.xpath("(//input[@type='tel'])[last()-1]")).sendKeys("9059084574");
		Thread.sleep(2000);
		
		driver.findElement(By.name("button")).click();
		
		System.out.println("clicked on try free button");
		Thread.sleep(3000);
		
		
	}
	@When("^Entering additional details in get started page$")
	public void detailsgetstarted() throws Exception {
		Select st = new Select(driver.findElement(By.xpath("//*[@id=\"body\"]/div[3]/div/form/div[3]/div[1]/select")));
		st.selectByIndex(0);
	    System.out.println("Clicked on free plan");
	    Thread.sleep(3000);
	    driver.findElement(By.xpath("//*[@id=\"email\"]")).sendKeys("testsignup"+randomInt+"@gmail.com");
	    System.out.println("Entered Email address");
	    Thread.sleep(3000);
	    driver.findElement(By.xpath("//*[@id=\"url\"]")).sendKeys("https://www.smatbot.com");
	    System.out.println("Entered Url");
	    Thread.sleep(3000);
	    driver.findElement(By.xpath("//*[@id=\"password-other\"]")).sendKeys("Test123$");
	    System.out.println("Entered Password");
	    Thread.sleep(3000);
	    driver.findElement(By.xpath("//*[@id=\"body\"]/div[3]/div/form/div[3]/div[5]/div/input")).click();
	    System.out.println("Clicked on Terms and Condition check box");
	    Thread.sleep(3000);
	    driver.findElement(By.xpath("//*[@id=\"signup-button\"]/span/span")).click();
	    System.out.println("Clicked on signup button");
	    Thread.sleep(5000);
	    driver.findElement(By.xpath("//*[@id=\"body\"]/div[3]/div/form/div[3]/div[1]/input")).sendKeys("test");
	    System.out.println("Entered Name");
	    Thread.sleep(3000);
	    Select st1 = new Select(driver.findElement(By.xpath("//*[@id=\"body\"]/div[3]/div/form/div[3]/div[4]/select")));
		st1.selectByIndex(1);
		driver.findElement(By.xpath("//*[@id=\"body\"]/div[3]/div/form/div[3]/div[5]/button/span")).click();
		Thread.sleep(3000);
		System.out.println("Clicked on submit button");
		Thread.sleep(20000);
	}



	@When("^Entering details of OnPremise page$")
	public void onpremise() throws Exception {
		driver.navigate().to("https://www.smatbot.com/on-premise-chatbot#contact");
		Thread.sleep(6000);
		driver.findElement(By.name("name")).sendKeys("test");
		System.out.println("Entered name");
		Thread.sleep(2000);
		driver.findElement(By.name("email")).sendKeys("testsignup@gmail.com");
		System.out.println("Entered Email");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"partner-phone\"]")).sendKeys("9059082225");
		System.out.println("Entered Phone number");
		Thread.sleep(2000);
		driver.findElement(By.id("message")).sendKeys("This is a testing msg");
		System.out.println("msg entered");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"main_contact_form\"]/div/div[6]/button")).click();
		System.out.println("Clicked on submit button");
		Thread.sleep(5000);
	}
	@When("^Entering details on partners lets talk page$")
	public void partnersletstalk() throws Exception {
		driver.navigate().to("https://www.feltso.com/partners#contact-section");
		Thread.sleep(15000);
		driver.findElement(By.xpath("//*[@id=\"referral-name\"]")).sendKeys("test");
		System.out.println("Name Entered");
		
		driver.findElement(By.xpath("//*[@id=\"referral-email\"]")).sendKeys("testsignup@gmail.com");
		System.out.println("Entered Email");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"get-started-below-phone-referral\"]")).sendKeys("9059082225");
		System.out.println("Entered Phone number");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"referral-website\"]")).sendKeys("www.smatbot.com");
		System.out.println("Website Entered");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"referral-message\"]")).sendKeys("This is a testing msg");
		System.out.println("Msg entered");
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,350)", "");
		Thread.sleep(7000);
		
		driver.findElement(By.xpath("/html/body/div[3]/div[2]/section[4]/div/div[4]/div/div/div/div/form/div[3]/div/button/span")).click();
		JavascriptExecutor js1 = (JavascriptExecutor) driver;
		js1.executeScript("window.scrollBy(0,-350)", "");
		Thread.sleep(5000);
	}
		@Then("^Close Application$")
		public void close() throws Exception {
			driver.close();
		}
}
