package Com.techcanvas.seleniumdemo;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class NameLocator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver=new FirefoxDriver();
		driver.get("http://tutorialspoint.com/");
		driver.manage().window().maximize();
		WebElement element=driver.findElement(By.name("q"));
		String a=element.getAttribute("name");
		System.out.println(a);
		driver.close();
		
		
		//Doubt:What operations to do  after this

	}

}
