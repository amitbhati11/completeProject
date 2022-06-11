package tests;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import spicejetpages.spicejetfltpage;

public class spicejettest {
	
	WebDriver driver;
	spicejetfltpage sp;
	@BeforeTest
	
	public void setUP() {
		String path="C:\\Users\\Admin_SRV\\git\\completeProject\\Projectcomplete\\src\\test\\resources\\drivers\\chromedriver.exe";
	      System.setProperty("webdriver.chrome.driver", path);
	      ChromeOptions options = new ChromeOptions();
	      options.addArguments("--disable-notifications");
	      driver=new ChromeDriver(options);
	      driver.manage().window().maximize();
	      
	}
	@Test
	public void testexecution() throws InterruptedException, MalformedURLException, IOException {
		driver.get("https://www.spicejet.com/");
		sp=new spicejetfltpage(driver);
		sp.roundtrip();
		sp.departure();
		sp.arriv();
		sp.depdat();
		sp.toatlpassanger();
		sp.currency();
		sp.pasntype();
	JavascriptExecutor js=(JavascriptExecutor)driver;
	js.executeScript("window.scrollBy(0,100)");
		//sp.submitbtn();
		//multiwindow handle
		String parent=driver.getWindowHandle();
		System.out.println(parent+"parentwindow...");
		driver.findElement(By.xpath("//div[text()='Hotels']")).click();
		driver.findElement(By.xpath("//div[text()='Cargo']//parent::div[@class='css-1dbjc4n r-1awozwy r-18u37iz r-le9fof']")).click();
		Set<String> wind=driver.getWindowHandles();
		System.out.println(wind.size()+"totalwind");
		/*ArrayList<String> tabs=new ArrayList(wind);
	//System.out.println(tabs.get(1));
	        driver.switchTo().window(tabs.get(1));
	      System.out.println(driver.getCurrentUrl()+"cargo");
	      System.out.println(driver.getTitle());
	      Thread.sleep(3000);
	      driver.close();
	      driver.switchTo().window(tabs.get(2));
	      System.out.println(driver.getCurrentUrl()+"Hotels");
	      System.out.println(driver.getTitle());
	      Thread.sleep(2000);
	      driver.close();
	      driver.switchTo().window(tabs.get(0));
	      System.out.println(driver.getCurrentUrl()+"parent");
	      System.out.println(driver.getTitle());*/
	   //inhanceforloop   
		for(String child:wind) {
			if(!child.equals(parent)) {
				driver.switchTo().window(child);
				System.out.println(driver.getTitle());
				 System.out.println(driver.getCurrentUrl());
				Thread.sleep(3000);
				driver.close();
				
			}
		}
		driver.switchTo().window(parent);
		System.out.println(driver.getTitle());
		
	      //Brokenlink
		
                 List<WebElement> alist=driver.findElements(By.tagName("a"));
                 alist.addAll(driver.findElements(By.tagName("img")));
                 
                 System.out.println(alist.size()+"---toatllist are");
                 ArrayList<WebElement>  activelink=new ArrayList();
                 for(int i=0;i<alist.size();i++) {
                	System.out.println(alist.get(i).getAttribute("href"));
                	if((alist.get(i).getAttribute("href")!=null)&&(!alist.get(i).getAttribute("href").equals("javascript"))) {
                		activelink.add(alist.get(i));
                	}
                	 
                 }System.out.println(activelink.size()+"--activelinksize");
                 for(int j=0;j<activelink.size();j++) {
                	 
                	 HttpURLConnection con=  (HttpURLConnection) new URL (activelink.get(j).getAttribute("href")).openConnection();
                  con.connect();
               int code=   con.getResponseCode();
                String msg=  con.getResponseMessage();
                  con.disconnect();
                try {
                  System.out.println(activelink.get(j).getAttribute("href")+"-->"+code+"-->"+msg);
                  
                   
                }catch(Exception e) {
                	e.getCause();
                }
                  
                  
                 
                 }
		
		
	
	
		
	}

}
