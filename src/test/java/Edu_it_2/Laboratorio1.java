package Edu_it_2;


import org.junit.Ignore;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Laboratorio1 {
	@Test @Ignore
	public void Lab1_Test() {
		
		System.out.println("Hola mundo de automatización!");
		
	}
	
	@Test @Ignore
	public void Lab1_E1() {
		
		System.setProperty("webdriver.chrome.driver", "..\\Edu_it_2\\Drivers\\chromedriver.exe");
		ChromeOptions options=new ChromeOptions();
		options.addArguments("remote-allow-origins=*");
		WebDriver driver= new ChromeDriver(options);
		driver.get("http://automationpractice.pl/index.php");
		driver.manage().window().maximize();
		driver.close();
		
	}
	
	@Test
	public void Lab1_E3() {
		System.setProperty("webdriver.chrome.driver", "..\\Edu_it_2\\Drivers\\chromedriver.exe");
		ChromeOptions options=new ChromeOptions();
		options.addArguments("remote-allow-origins=*");
		WebDriver driver= new ChromeDriver(options);
		driver.get("http://automationpractice.pl/index.php");
		driver.manage().window().maximize();
		
		WebElement txtBuscador=driver.findElement(By.id("search_query_top"));
		txtBuscador.clear();
		txtBuscador.sendKeys("Blouse");
		txtBuscador.sendKeys(Keys.ENTER);
		driver.close();

		

		
	}
	
	
	


}
