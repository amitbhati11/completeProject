package pages;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.google.common.io.Files;

public class Homepages {
	WebDriver driver;
	
	@FindBy(xpath="//select[@id='country']")
	WebElement contry;
	@FindBy(xpath="//input[@placeholder='Enter your address']")
	WebElement add;
	@FindBy(xpath="//input[@placeholder='Enter your email']")
	WebElement email;
	@FindBy(xpath="//input[@placeholder='Enter your phone number']")
	WebElement phone;
	@FindBy(xpath="//button[@onclick='performSave()']")
	WebElement savbtn;
	
	//constructor
	
	public Homepages(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	public void Country() {
		contry.click();
		Select sc=new Select(contry);
		sc.selectByValue("US");
	}
	public void address() {
		add.sendKeys("Newyork");
	}
	public void Email() {
		email.sendKeys("abc@gmail.com");
	}
	public void Telephonenumber() {
		phone.sendKeys("3233#######&");
	}
	public void Savedbuton() throws IOException, InterruptedException {
		savbtn.click();
		String srcpath="C:\\Users\\Admin_SRV\\git\\completeProject\\Projectcomplete\\src\\test\\resources\\Screenshots\\home.png";
		File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		Files.copy(src, new File(srcpath));
		Thread.sleep(5000);
	}
	

}
