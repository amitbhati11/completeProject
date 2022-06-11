package tests;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import IndainRailwayPage.Enqueypage;
import net.sourceforge.tess4j.TesseractException;

public class IndainRailwayTest {
	
	WebDriver driver;
	Enqueypage ep;
	
	@BeforeTest
	public void setup() {
		String cpath="C:\\Users\\Admin_SRV\\git\\completeProject\\Projectcomplete\\src\\test\\resources\\drivers\\chromedriver.exe";
	    System.setProperty("webdriver.chrome.driver",cpath);
	    driver=new ChromeDriver();
	    driver.switchTo().alert();
	}
	
	@Test
	public void testexecution() throws InterruptedException, IOException, TesseractException {
		
		driver.get("https://www.indianrail.gov.in/enquiry/SEAT/SeatAvailability.html?locale=en");
		ep=new Enqueypage(driver);
		ep.Trainno();
		ep.date();
		ep.departure();
		ep.Arrival();
		ep.classtype();
		ep.quotatype();
		ep.submitbtn();
		Thread.sleep(5000);
		ep.Captchacode();
	}

}
