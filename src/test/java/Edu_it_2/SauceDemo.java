package Edu_it_2;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class SauceDemo {

	@Test 
	public void Desafio_Ej1() {

		//Definir sitio a abrir como variable
		System.setProperty("webdriver.chrome.driver", "..\\Edu_it_2\\Drivers\\chromedriver.exe");
		ChromeOptions options=new ChromeOptions();
		options.addArguments("remote-allow-origins=*");
		WebDriver driver= new ChromeDriver(options);
		String url = "http://www.saucedemo.com/";

		//2-abrir pagina
		driver.get(url);
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();

		//Username
		WebElement userName = driver.findElement(By.id("user-name"));
		userName.clear();
		userName.sendKeys("standar_user");
		userName.sendKeys(Keys.ENTER);

		//Password
		WebElement password = driver.findElement(By.id("password"));
		password.clear();
		password.sendKeys("secret_sauce");
		password.sendKeys(Keys.ENTER);

		//Click en Login
		WebElement btnLogin = driver.findElement(By.id("login-button"));
		btnLogin.click();

		driver.close();

	}
}


