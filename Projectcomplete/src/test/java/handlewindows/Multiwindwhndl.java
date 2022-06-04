package handlewindows;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.google.common.io.Files;

public class Multiwindwhndl {
	WebDriver driver;
	@BeforeTest
	public void setup() {
		
		String path="C:\\Users\\Admin_SRV\\git\\completeProject\\Projectcomplete\\src\\test\\resources\\drivers\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver",path);
		driver=new ChromeDriver();
		
	}
	@Test
	
	public void testmultiwindowhandle() throws IOException, InterruptedException {
		driver.get("https://www.gingerwebs.com/");
	String parent=driver.getWindowHandle();
	System.out.println(parent+"parent is:");
	 driver.findElement(By.xpath("//div//a[@class='sprite fb face']")).click();
	 
	   Set<String> allwindow=  driver.getWindowHandles();
	   System.out.println(allwindow.size());
	   
	   for(String child:allwindow) {
		   
		   if(!parent.equals(child)) {
			   driver.switchTo().window(child);
			   Thread.sleep(3000);
			   driver.findElement(By.xpath("//label//input[@placeholder='Email or phone']")).sendKeys("86546455654");
			  System.out.println(driver.getTitle());
			  String imgpath="C:\\Users\\Admin_SRV\\git\\completeProject\\Projectcomplete\\src\\test\\resources\\Screenshots\\window.png";
			  File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
			  Files.copy(src, new File(imgpath));
			  Thread.sleep(4000);  
			   driver.close();
			   }
		   
	   }  driver.switchTo().window(parent);
	       driver.findElement(By.xpath("//li//a[text()='Industry']")).click();
	}
	
	@Test
	
	public void test2() throws InterruptedException {
		driver.get("https://www.gingerwebs.com/industry/education.php");
		
		String parent=driver.getWindowHandle();
		System.out.println("parent is:-->"+parent);
		driver.findElement(By.xpath("//div//a[@class='sprite twt']")).click();
		driver.findElement(By.xpath("//div//a[@class='sprite in']")).click();
		Set<String> allwind=driver.getWindowHandles();
		ArrayList<String> tabs=new ArrayList(allwind);
		System.out.println("multiwindowsize"+tabs.size());
		driver.switchTo().window(tabs.get(2));
	System.out.println(driver.getTitle());
	Thread.sleep(3000);
	driver.close();
	driver.switchTo().window(tabs.get(1));
	System.out.println(driver.getTitle());
	Thread.sleep(3000);
	driver.close();
	driver.switchTo().window(tabs.get(0));
	System.out.println(driver.getTitle());

				
	}
	

}
