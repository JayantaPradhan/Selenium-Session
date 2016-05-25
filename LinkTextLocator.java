package Com.techcanvas.seleniumdemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LinkTextLocator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver=new FirefoxDriver();
		driver.get("http://software-testing-tutorials-automation.blogspot.in/2014/01/how-to-locate-element-by-link-text-or.html ");
		driver.manage().window().maximize();
		driver.findElement(By.linkText("Locate Element By Name")).click();
		driver.close();
	}

}
