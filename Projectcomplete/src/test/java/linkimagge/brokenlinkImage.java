package linkimagge;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class brokenlinkImage {
	
	WebDriver driver;
	
	@BeforeTest
	
	public void setup() {
	String cpath="C:\\Users\\Admin_SRV\\git\\completeProject\\Projectcomplete\\src\\test\\resources\\drivers\\chromedriver.exe";
	System.setProperty("webdriver.chrome.driver",cpath);
	driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
	
}
	
@Test
 
public void findbroknlinkimage() throws MalformedURLException, IOException {
	driver.get("https://www.naukri.com/");
	
	List<WebElement> alist=driver.findElements(By.tagName("a"));
	alist.addAll(driver.findElements(By.tagName("img")));
	
	System.out.println(alist.size()+"total link size");
	List<WebElement> activelink=new ArrayList();
	
	for(int i=0;i<alist.size();i++) {
	System.out.println(alist.get(i).getAttribute("href"));
	if((alist.get(i).getAttribute("href")!=null)&&(!alist.get(i).getAttribute("href").contains("java script"))) {
		
		  activelink.add(alist.get(i));
	}
	}
	      System.out.println(activelink.size()+"total activelink size");
	      for(int j=0;j<activelink.size();j++) {
	              HttpURLConnection connect=  (HttpURLConnection)new URL (activelink.get(j).getAttribute("href")).openConnection();
  connect.connect();
  
          String msg= connect.getResponseMessage();
        int rcode = connect.getResponseCode();
        connect.disconnect();
        System.out.println(activelink.get(j).getAttribute("href")+rcode+"-->"+msg);
	      
	      }
}
}