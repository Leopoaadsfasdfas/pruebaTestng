package other;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class NewTest {
  @Test
  public void f() {
	  System.setProperty("webdriver.chrome.driver","./src/test/java/chromedriver/chromedriver90");
	  WebDriver driver=new ChromeDriver();
	  System.out.println("Hi, welcome to edureka's Youtube live session on selenium webdriver");
	  driver.navigate().to("https:/www.amazon.in");
	  driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
	  
	  driver.findElement(By.id("twotabsearchtextbox")).sendKeys("nike shoues");
	  
	  driver.findElement(By.xpath("(//input[@class='nav-input nav-progressive-attribute'])[last()]")).click();
	  driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	  
	  driver.navigate().back();
	  String title=driver.getTitle();
	  
	  System.out.println("Page Title is:-"+title);
	  
	  driver.navigate().to("https://www.facebook.com");
	  driver.findElement(By.name("email")).sendKeys("mendezporciento1@hotmail.com");
	  driver.findElement(By.name("pass")).sendKeys("1234");
	  driver.findElement(By.xpath("//button[contains(text(),'Iniciar sesión')]")).click();
	  
	  driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
	  driver.quit();
	  
  }
}
