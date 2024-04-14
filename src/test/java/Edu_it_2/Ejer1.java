package Edu_it_2;
import org.junit.Ignore;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Ejer1  {
	@Test @Ignore
	public void Lab1_test() {
		System.out.println("Hola mundo de automatizacion!");
	}
	@Test
	public void Lab1_E1() {
		System.setProperty("webdriver.chrome.driver", "..\\Edu_it_2\\Drivers\\chromedriver.exe");
		ChromeOptions options=new ChromeOptions();
		options.addArguments("remote-allow-origins=*");
		WebDriver driver= new ChromeDriver(options);
		driver.get("http://automationpractice.pl/index.php");
		driver.close();
	}
}


