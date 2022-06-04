package handlewindows;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Multiplewindowhandlingdemo {
	
	WebDriver driver;
	
	@BeforeTest
	
	public void setup() {
		String cpath="C:\\Users\\Admin_SRV\\git\\completeProject\\Projectcomplete\\src\\test\\resources\\drivers\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver",cpath);
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		
	}
	//@Test
	
	public void handlemulti() throws InterruptedException {
		driver.get("https://www.naukri.com/");
		
		   String parent= driver.getWindowHandle();
		   System.out.println(parent+"parent is-->");
		       driver.findElement(By.xpath("//div//a[text()='Remote']")).click();
		       driver.findElement(By.xpath("//div//a[text()='MNC']")).click();
		 //      driver.findElement(By.xpath("//div//a[text()='Fortune 500']")).click();
		 //      driver.findElement(By.xpath("//div//a[text()='Sales']")).click();
		//       driver.findElement(By.xpath("//div//a[text()='Fresher']")).click();
		Set<String> allwindow= driver.getWindowHandles();
		System.out.println(allwindow.size()+"size");
		
		for(String child:allwindow) {
			if(!parent.equals(child)) {
				driver.switchTo().window(child);
				System.out.println(driver.getTitle()+"title is");
				Thread.sleep(300);
				driver.close();
			}
		}driver.switchTo().window(parent);
		System.out.println(driver.getTitle()+"parent window title:");
		Thread.sleep(3000);
		driver.close();
	}
	@Test
	
	public void handlmult2() throws InterruptedException {
		driver.get("https://www.naukri.com/");
				   String parent= driver.getWindowHandle();
		   System.out.println(parent+"parent is-->");
		       driver.findElement(By.xpath("//div//a[text()='Remote']")).click();
		       driver.findElement(By.xpath("//div//a[text()='MNC']")).click();
		Set<String> wind= driver.getWindowHandles();
		ArrayList<String> tabs=new ArrayList(wind);
		
		         driver.switchTo().window(tabs.get(1));
		         System.out.println(driver.getCurrentUrl());
		         System.out.println(driver.getTitle()+"--->mnc");
		         Thread.sleep(3000);
		         driver.close();
		         driver.switchTo().window(tabs.get(2));
		         System.out.println(driver.getCurrentUrl());
		         System.out.println(driver.getTitle()+"--->remote");
		         Thread.sleep(3000);
		         driver.close();
		         driver.switchTo().window(tabs.get(0));
		         System.out.println(driver.getCurrentUrl());
		         System.out.println(driver.getTitle());
		         Thread.sleep(3000);
		
		       
	}

}
