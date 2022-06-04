package tests;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import Dataexcelutils.Exceldatademo;
import pages.Homepages;
import pages.login;

public class exceldatalogin {
	WebDriver driver;
	Exceldatademo edd;
	login lg;
	Homepages hp;
	
	@BeforeTest
	@Parameters("Browser")
	public void setup(String Browser) {
		System.out.println("browser is:"+Browser);
		if(Browser.contains("chrome")) {
	String path="C:\\Users\\Admin_SRV\\git\\completeProject\\Projectcomplete\\src\\test\\resources\\drivers\\chromedriver.exe";
	System.setProperty("webdriver.chrome.driver",path);
	driver=new ChromeDriver();
	driver.manage().window().maximize();
		}else if(Browser.contains("firefox")) {
			String gpath="C:\\Users\\Admin_SRV\\git\\completeProject\\Projectcomplete\\src\\test\\resources\\drivers\\geckodriver.exe";
			System.setProperty("webdriver.gecko.driver",gpath);
			driver=new FirefoxDriver();
		}
	}
	
	@DataProvider(name="testdata")
	public Object [][] dataprovid() throws IOException{
		String xlpath="C:\\Users\\Admin_SRV\\git\\completeProject\\Projectcomplete\\src\\test\\resources\\Datautils\\loginDataprovider.xlsx";
		String sheetname="Sheet1";
		Object data [][]=getcellstringdata(xlpath, sheetname);
		return data;
	}
	
	@Test(dataProvider="testdata")
	public void finaldata(String username,String password,String id) throws IOException, InterruptedException {
	System.out.println(username+" | "+password+" | "+id);
	driver.get("https://example.testproject.io/web/");
	lg=new login(driver);
	lg.user(username);
	lg.pass(password);
	lg.submit();
	Thread.sleep(2000);
	hp=new Homepages(driver);
	hp.Country();
	hp.address();
	hp.Email();
	hp.Telephonenumber();
	hp.Savedbuton();
	
			
	}
	@AfterTest
	public void teardown() {
		driver.close();
	}
	
	
	
	public Object [][] getcellstringdata(String xlpath,String sheetname) throws IOException {
		edd=new Exceldatademo(xlpath, sheetname);
		
	int Rowcount=edd.getrownum();
	int Colcount=edd.getcellnum();
	     
	            Object data [][]=new Object[Rowcount-1][Colcount];
	            
	            for(int i=1;i<Rowcount;i++) {
	            	for(int j=0;j<Colcount;j++) {
	            		
	            		data [i-1][j]=edd.exelcellstringdata(i, j);
	            	}
	            }
	            return data;	
	}

}
