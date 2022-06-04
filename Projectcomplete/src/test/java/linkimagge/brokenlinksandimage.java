package linkimagge;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

import javax.net.ssl.HttpsURLConnection;

import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class brokenlinksandimage {
	WebDriver driver;
	
	@BeforeTest
	
	public void setup() {
		String path="C:\\Users\\Admin_SRV\\git\\completeProject\\Projectcomplete\\src\\test\\resources\\drivers\\chromedriver.exe";
	System.setProperty("webdriver.chrome.driver", path);
	driver=new ChromeDriver();
	driver.manage().window().maximize();
	}
	@Test
	
	public void execution() throws MalformedURLException, IOException {
		driver.get("http://makemysushi.com/404");
		try {
	List<WebElement> alllinks= driver.findElements(By.tagName("a"));
	alllinks.addAll(driver.findElements(By.tagName("img")));
		List<WebElement> activelink=new ArrayList();
	System.out.println("total liks are:"+alllinks.size());
	
	for(int i=0;i<alllinks.size();i++) {
		
		System.out.println( alllinks.get(i).getAttribute("href"));
		    
	
	//System.out.println("Activelinkcount are:->"+activelink.size());
		  if((alllinks.get(i).getAttribute("href")!=null)&&(!alllinks.get(i).getAttribute("href").contains("java script"))){
			  activelink.add(alllinks.get(i));
			  
	}          
		  }System.out.println("activelink size are:"+activelink.size());
		for(int j=0;j<activelink.size();j++) {
			
			      HttpsURLConnection connect= (HttpsURLConnection) new URL (activelink.get(j).getAttribute("href")).openConnection();
			      connect.connect();
			  int responsecode=    connect.getResponseCode();
			String msg= connect.getResponseMessage();
			connect.disconnect();
			System.out.println(activelink.get(j).getAttribute("href")+"activelinks are -->"+responsecode+"-->"+msg);
		}}catch(StaleElementReferenceException e) {
			e.getCause();
		}
	}
	@AfterTest
	public void teardown() {
		driver.close();;
		System.out.println(driver.getCurrentUrl());
	}
	}


