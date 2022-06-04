package handlewindows;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
 
public class multiplewindowhandle {

	public static void main(String[] args) throws InterruptedException {
WebDriver driver;
		
String path="C:\\Users\\Admin_SRV\\eclipse-workspace\\Projectcomplete\\src\\test\\resources\\drivers\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver",path);
		
       driver=new ChromeDriver();
		driver.get("https://www.gingerwebs.com/about-ginger/who-we-are.php");
	String parent=	driver.getWindowHandle();
	System.out.println("parent window is"+parent);
	driver.findElement(By.xpath("//div//a[@class='sprite thinkexam']")).click();
	Set<String> allwindow=driver.getWindowHandles();
	System.out.println("to no of window"+allwindow.size());
	for(String child:allwindow) {
		if(!parent.equals(child)) {
			driver.switchTo().window(child);
			driver.findElement(By.xpath("//li//a[text()='Free Trial']")).click();
			System.out.println("url for child"+driver.getCurrentUrl());
			Thread.sleep(5000);
			driver.close();
		}
		
	}
	driver.switchTo().window(parent);
	System.out.println("parent window is:"+driver.getTitle());
	System.out.println("url for parent is:"+driver.getCurrentUrl());
	
	
	}

}
