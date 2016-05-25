package Com.techcanvas.seleniumdemo;


import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import org.openqa.selenium.WebElement;

public class TagNameLocator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver=new FirefoxDriver();
		driver.get("http://www.adactin.com/HotelApp/Register.php");
		driver.manage().window().maximize();
		List<WebElement> element=driver.findElements(By.tagName("input"));
		int a=element.size();
		for(int i=0;i<=a;i++)
		{
			System.out.println(element.get(i).getAttribute("name"));
		}
		

	}
	
	
	

}
