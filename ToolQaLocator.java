package Com.techcanvas.seleniumdemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ToolQaLocator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver=new FirefoxDriver();
		driver.get("http://toolsqa.com/Automation-practice-form/");
		driver.manage().window().maximize();
		driver.findElement(By.name("firstname")).sendKeys("Jayant");
		driver.findElement(By.name("lastname")).sendKeys("Pradhan");
		driver.findElement(By.id("submit")).click();
		driver.close();

	}

}
