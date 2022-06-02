package pages;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.google.common.io.Files;

public class login {
	
	WebDriver driver;
	
	@FindBy(xpath="//input[@placeholder='Enter your full name']")
	private WebElement us_nm;
	
	@FindBy(xpath="//input[@placeholder='Enter your password']")
	private WebElement us_pwd;
	
	@FindBy(xpath="//button[@id='login']")
	private WebElement loginbuton;
	
	//constructor
	public login(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	
	public void  user(String username) {
		us_nm.sendKeys(username);
	}
	public void pass(String password) {
		us_pwd.sendKeys(password);
	}
	public void submit() throws IOException, InterruptedException {
		loginbuton.click();
		String path="C:\\Users\\Admin_SRV\\eclipse-workspace\\Projectcomplete\\src\\test\\resources\\Screenshots\\img.png";
	 File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	 Files.copy(src,new File(path));
	 Thread.sleep(3000);
	}
	

}
