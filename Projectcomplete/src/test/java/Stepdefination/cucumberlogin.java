package Stepdefination;


import static org.junit.Assert.assertEquals;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.*;
import junit.framework.Assert;
import pages.login;
public class cucumberlogin {
	WebDriver driver;
	login lg;
	//Softassert softassert=new Softassert();
	@Before
	public void setup() {
		String chpath="C:\\Users\\Admin_SRV\\eclipse-workspace\\Projectcomplete\\src\\test\\resources\\drivers\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver",chpath);
		driver=new ChromeDriver();
		driver.manage().window().maximize();
	}
	@Given("enter the url")
	public void enter_the_url() {
    driver.get("https://example.testproject.io/web/");
	}

	@And("^login with valid (.*) and (.*)$")
	public void login_with_valid_username_and_password(String username,String password) throws InterruptedException {
        lg=new login(driver);
        lg.user(username);
        lg.pass(password);
        Thread.sleep(1000);
	}
	
	@And("^login with invalid (.*) and (.*)$")
	public void login_with_invalid_username_and_password(String username,String password) throws InterruptedException {
		  lg=new login(driver);
	        lg.user(username);
	        lg.pass(password);
	        //assert.assertEquals(message, expected, actual);
	        Thread.sleep(1000);
	}

	@When("click on login button")
	public void click_on_login_button() throws InterruptedException, IOException {
		lg=new login(driver);
		lg.submit();
		Thread.sleep(3000);
	String txt=	driver.findElement(By.xpath("//div//p[text()='Hello ']")).getText();
	//System.out.println(txt);
	Assert.assertTrue(txt.contains("Hello"));
		
	}

	@Then("navigate to home page")
	public void navigate_to_home_page() {

	}
	
	@After
	public void teardown() {
		driver.close();
	}

}
