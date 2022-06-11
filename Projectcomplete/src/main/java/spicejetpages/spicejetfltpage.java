package spicejetpages;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class spicejetfltpage {
	
	WebDriver driver;
	
	By round=By.xpath("//div[text()='round trip']");
	
	By dept=By.xpath("//div[text()='From']");
	By dcity=By.xpath("//div[text()='AMD']");
	By dest=By.xpath("//div[text()='To']");
	By arctity=By.xpath("//div[text()='GOI']");
	By ddat=By.xpath("//div[text()='Departure Date']");
	By ddt=By.xpath("(//div[@class='css-1dbjc4n r-1mdbw0j r-ymttw5 r-b2dl2 r-mzjzbw r-wk8lta r-tvv088']//div[@class='css-1dbjc4n'])[8]//div//div[@data-focusable='true']");
	By rddt=By.xpath("(//div[@class='css-1dbjc4n r-1mdbw0j r-ymttw5 r-b2dl2 r-mzjzbw r-wk8lta r-tvv088']//div[@class='css-1dbjc4n'])[16]//div[@data-focusable='true']");
	By rdat=By.xpath("//div[text()='Return Date']");
	By totp=By.xpath("//div[text()='Passengers']");
	By adultp=By.xpath("(//div[@data-testid='Adult-testID-plus-one-cta'])");
	By chilp=By.xpath("(//div[@data-testid='Children-testID-plus-one-cta'])");
	By infanp=By.xpath("(//div[@data-testid='Infant-testID-plus-one-cta'])");
	
	By cuur=By.xpath("//div[text()='Currency']");
	By cuid=By.xpath("//div[@class='css-1dbjc4n r-14lw9ot r-z2wwpe r-1rjd0u6 r-1g94qm0 r-h3f8nf r-u8s1d r-8fdsdq']//div[@class='css-1dbjc4n r-150rngu r-eqz5dr r-16y2uox r-1wbh5a2 r-11yh6sk r-1rnoaur r-1sncvnh']//div");
	By emp=By.xpath("//div[text()='Students']");
	By clkbtn=By.xpath("//div[contains(text(),'Search Flight')]");
	
	public spicejetfltpage(WebDriver driver) {
		this.driver=driver;
		
	}
	
	public void roundtrip() {
		driver.findElement(round).click();
	}
	public void departure() {
		driver.findElement(dept).click();
		driver.findElement(dcity).click();
	
}
	public void arriv() {
		for(int i=1;i<=2;i++) {
		driver.findElement(dest).click();
		}
		driver.findElement(arctity).click();
	}
	public void depdat() {
		
		for(int i=1; i<=2;i++) {
			driver.findElement(ddat).click();
		}
		/*String expdate="10-March 2023";
		String eday=expdate.split("-")[0];
		String emonthyr=expdate.split("-")[1];
		System.out.println(emonthyr+"exp");
		
		String cmonthyr=driver.findElement(By.xpath("(//div[@class='css-76zvg2 r-homxoj r-adyw6z r-1kfrs79'])[1]")).getText().trim();
		System.out.println(cmonthyr);
		while(!cmonthyr.equals(emonthyr)) {
			driver.findElement(By.xpath("(//div[@data-focusable='true'])[18]")).click();
			cmonthyr=driver.findElement(By.xpath("(//div[@class='css-76zvg2 r-homxoj r-adyw6z r-1kfrs79'])[1]")).getText().trim();
		}*/
		String eday="23";
		         List<WebElement> list= driver.findElements(ddt);
		         for(int i=0;i<list.size();i++) {
		        	String cday= list.get(i).getText();
		        	
		        	if(cday.equals(eday)) {
		        		list.get(i).click();
		        		break;
		        	}
		         }
		         
		         String reday="12";
		         
		  List<WebElement>  listr= driver.findElements(rddt);
		  
		  for(int k=0;k<listr.size();k++) {
			String rday= listr.get(k).getText();
			
			if(rday.equals(reday)) {
				listr.get(k).click();
				break;
			}
		  }
		         }
	public void toatlpassanger() {
		driver.findElement(totp).click();
		for(int i=1;i<=2;i++) {
			driver.findElement(adultp).click();
		}
		for(int k=1;k<=3;k++) {
			driver.findElement(chilp).click();
		}
		for(int j=1;j<=3;j++) {
			driver.findElement(infanp).click();
		}
	}
	
	public void currency() {
		driver.findElement(cuur).click();
		String expcur="USD";
		List<WebElement> lst=driver.findElements(cuid);
		for(int i=0;i<lst.size();i++) {
		String cur=	lst.get(i).getText();
		
		if(cur.equals(expcur)) {
			lst.get(i).click();
			break;
		}
		}
	}
	
	public void pasntype() {
		driver.findElement(emp).click();
	}
	
	public void submitbtn()  {
		/*WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(10));
		wait.until(ExpectedConditions.visibilityOf(driver.findElement(clkbtn)));
		*/
		
		driver.findElement(clkbtn).click();
		
	}
	
	
}