package Com.techcanvas.seleniumdemo;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.WebElement;

public class PartialLinkTextLocator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver=new FirefoxDriver();
		driver.get("http://software-testing-tutorials-automation.blogspot.in/2014/01/how-to-locate-element-by-link-text-or.html");
		driver.manage().window().maximize();

		List<WebElement> element=driver.findElements(By.partialLinkText("Element By"));
		int a=element.size();
		for(int i=0;i<a; i++)
		{
			System.out.println(element.get(i).getText());
		}
		driver.close();
		
	}

}
