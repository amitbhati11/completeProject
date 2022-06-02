package handlewindows;

import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class multiplewindowhandling {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver;
		
		String path="C:\\Users\\Admin_SRV\\eclipse-workspace\\Projectcomplete\\src\\test\\resources\\drivers\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", path);
		driver=new ChromeDriver();
		driver.get("https://www.gingerwebs.com/");
		driver.manage().window().maximize();
		String parent=driver.getWindowHandle();
		driver.findElement(By.xpath("//div//a[@class='sprite thinkexam']")).click();
		driver.findElement(By.xpath("//div//a[@class='sprite omrhome']")).click();
		Set<String> allwindows=driver.getWindowHandles();
		ArrayList<String> tabs= new ArrayList(allwindows);
		tabs.size();
		System.out.println(tabs.size());
		driver.switchTo().window(tabs.get(2));
		driver.findElement(By.id("crprtetab")).click();
		System.out.println("tab2 title is:thinksys"+driver.getTitle());
		Thread.sleep(4000);
		driver.close();
		
		driver.switchTo().window(tabs.get(1));
		System.out.println("tab1 title is:omr"+driver.getTitle());
		Thread.sleep(4000);
		driver.close();
		
		driver.switchTo().window(tabs.get(0));
		System.out.println("parent window title is:"+driver.getTitle());
		driver.close();
	}

}
