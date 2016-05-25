package Com.techcanvas.seleniumdemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class IdLocator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver=new FirefoxDriver();
		driver.get("http://google.co.in/");
		driver.manage().window().maximize();
		WebElement element=driver.findElement(By.id("gs_htif0"));
		
		System.out.println(element);
		driver.close();

	}

}
