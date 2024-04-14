package Edu_it_2;

import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class Laboratorio1b {
	@Test

	public void Lab1_Test() {

		System.out.println("Hola mundo de automatizacion!");

	}

	@Test
	public void Lab1_E1()
	{

	System.setProperty("webdriver.chromedriver","..\\eduit\\Drivers\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("http://automationpractice.pl/index.php");
		driver.close();

	}
}
