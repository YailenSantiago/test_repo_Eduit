package Edu_it_2;


import java.time.Duration;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Laboratorio2c {
	@Test
	public void lab2_E1() {
	System.setProperty("webdriver.chrome.driver", "..\\Edu_it_2\\Drivers\\chromedriver.exe");
	ChromeOptions options=new ChromeOptions();
	options.addArguments("remote-allow-origins=*");
	WebDriver driver= new ChromeDriver(options);
	driver.get("http://www.automationpractice.pl/index.php?controller=authentication&back=my-account");
	driver.manage().window().maximize();
	driver.manage().deleteAllCookies();
	
	WebElement txtEmail=driver.findElement(By.id("email_create"));
	txtEmail.sendKeys("micorreo"+ Math.random()+ "@correo.com");
	
	WebElement btnCreate=driver.findElement(By.xpath("//button[@name='SubmitCreate']"));
	btnCreate.click();
	
	WebDriverWait mywait=new WebDriverWait(driver,Duration.ofSeconds(10));
	mywait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[contains(@id,'id_gender1')]")));
	
	driver.findElement(By.id("id_gender1")).click();
	
	driver.findElement(By.name("customer_firstname")).sendKeys("Juan Torres"); 
	
	
	driver.findElement(By.name("passwd")).sendKeys("123456"); 
	
	Select months= new Select(driver.findElement(By.id("months")));
	months.selectByValue("4");
	
	driver.findElement(By.xpath("//*[text()='Register']")).click();
	
	
	driver.close();
	
	}
}
