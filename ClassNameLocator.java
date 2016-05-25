package Com.techcanvas.seleniumdemo;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ClassNameLocator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver=new FirefoxDriver();
		driver.get("http://stackoverflow.com/");
		driver.manage().window().maximize();
		List<WebElement> element=driver.findElements(By.className("question-hyperlink"));
		
		int a=element.size();
		
		for(int i=0;i<a; i++)
		{
			System.out.println(element.get(i).getText());
		}
		driver.close();
		

	}

}
