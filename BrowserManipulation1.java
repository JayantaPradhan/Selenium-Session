package Com.techcanvas.seleniumdemo;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BrowserManipulation1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver browser=new FirefoxDriver();
		browser.get("https://www.google.co.in");
		Point point=new Point(100, 50);
		browser.manage().window().setPosition(point);
		browser.manage().window().setSize(new Dimension(550,350));
		browser.manage().window().maximize();
		browser.navigate().to("https://in.yahoo.com/");
		browser.navigate().back();
		browser.navigate().forward();
		browser.navigate().refresh();
		browser.close();
		
		
		}

}
