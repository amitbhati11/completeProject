package IndainRailwayPage;

import java.io.File;
import java.io.IOException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.google.common.io.Files;

import net.sourceforge.tess4j.ITesseract;
import net.sourceforge.tess4j.Tesseract;
import net.sourceforge.tess4j.TesseractException;

public class Enqueypage {
	WebDriver driver;
	
	@FindBy(xpath="//input[@placeholder='Train Number']")
     WebElement enqpage;
	
	@FindBy(xpath="//img[@title='Select date']")
	WebElement calendr;
	
	@FindBy(xpath="//input[@placeholder='Enter Source Station']")
	WebElement  sourc_stn;
	
	@FindBy(xpath="//input[@placeholder='Enter Destination Station']")
	WebElement dest_stn;
	
	@FindBy(xpath="//select[@name='class']")
	WebElement en_cls;
	
	@FindBy(xpath="//select[@name='quota']")
	WebElement quot;
	
	@FindBy(xpath="(//input[@value='Get Availability'])[3]")
	WebElement submit;
	
	@FindBy(xpath="//img[@id='CaptchaImgID']")
	WebElement caph;
	
	@FindBy(id="inputCaptcha")
	WebElement entcpha;
	
	@FindBy(id="test")
	WebElement gbtn;
	//Constructor
	
	public Enqueypage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	public void Trainno() throws InterruptedException {
		enqpage.sendKeys("556");
		Thread.sleep(2000);
		enqpage.sendKeys(Keys.ARROW_DOWN);
		Thread.sleep(3000);
		enqpage.sendKeys(Keys.TAB);
		}
	
	public void date() {
		calendr.click();
		
		String expdate="15-September-2022";
		String eday=expdate.split("-")[0];
		String emonth=expdate.split("-")[1];
		String eyer=expdate.split("-")[2];
		System.out.println(eday+"#"+emonth+"#"+eyer);
		
	String cmonth=driver.findElement(By.xpath("//div[@class='ui-datepicker-group ui-datepicker-group-first']//span[@class='ui-datepicker-month']")).getText();
	
	String cyer= driver.findElement(By.xpath("(//span[@class='ui-datepicker-year'])[1]")).getText();
	
	while((!cmonth.equals(emonth)||(!cyer.equals(eyer)))) {
		driver.findElement(By.xpath("(//span[text()='Next'])[1]")).click();
		cmonth=driver.findElement(By.xpath("//div[@class='ui-datepicker-group ui-datepicker-group-first']//span[@class='ui-datepicker-month']")).getText();
		 cyer= driver.findElement(By.xpath("(//span[@class='ui-datepicker-year'])[1]")).getText();
	}
	       List<WebElement> list=driver.findElements(By.xpath("//div[@class='ui-datepicker-group ui-datepicker-group-first']//table//tbody//tr//td"));
	       
	       for(int i=0;i<list.size();i++) {
	    	 String cday= list.get(i).getText();
	    	 
	    	 if(cday.equals(eday)) {
	    		 list.get(i).click();
	    		 break;
	    	 }
	       }
	}
	
	public void departure() throws InterruptedException {
		sourc_stn.sendKeys("DHARMA");
		Thread.sleep(2000);
		sourc_stn.sendKeys(Keys.ARROW_DOWN);
		Thread.sleep(2000);
		sourc_stn.sendKeys(Keys.TAB);
	}
	public void Arrival() throws InterruptedException {
		dest_stn.sendKeys("AGART");
		Thread.sleep(2000);
		dest_stn.sendKeys(Keys.ARROW_DOWN);
		Thread.sleep(2000);
		dest_stn.sendKeys(Keys.TAB);
	}
	
	public void classtype() {
		en_cls.click();
		Select sc=new Select(en_cls);
		sc.selectByIndex(0);
	}
	public void quotatype() {
		quot.click();
		Select sq=new Select(quot);
		sq.selectByVisibleText(" Foreign Tourist Quota");
	}
	public void submitbtn() throws InterruptedException {
		submit.click();
		Thread.sleep(2000);
	}
	public void Captchacode() throws IOException, TesseractException, InterruptedException {
		String path="C:\\Users\\Admin_SRV\\git\\completeProject\\Projectcomplete\\src\\test\\resources\\Screenshots\\captch.png";
		File src=caph.getScreenshotAs(OutputType.FILE);
		Files.copy(src, new File(path));
		Thread.sleep(3000);
		ITesseract its=new Tesseract();
		
		String imgtxt=its.doOCR(new File(path));
		System.out.println(imgtxt);
		String seperator="=";
	int sepo=imgtxt.lastIndexOf(seperator);
		String s1=imgtxt.substring(0,3);
		String s2=imgtxt.substring(5,sepo).trim();
		int i1=Integer.valueOf(s1);
		int i2=Integer.valueOf(s2);
		if(imgtxt.contains("+")) {
			int I=i1+i2;
			String S=String.valueOf(I);
			entcpha.sendKeys(S);
			gbtn.click();
			
			}else if(imgtxt.contains("-")) {
				int I=i1-i2;
				String S=String.valueOf(I);
				entcpha.sendKeys(S);
				gbtn.click();
			}
		
		
	}
}
