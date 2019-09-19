package otg.task;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SnapDeal {
	public static void main(String[] args) throws Throwable  {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Greens-12\\eclipse\\jee-2019-06\\eclipse\\Manish Vinay\\GitTask\\driverrrs\\chromedriver.exe");
	
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.snapdeal.com/");
		WebElement search = driver.findElement(By.xpath("//input[@placeholder='Search products & brands']"));
		search.sendKeys("fasttrack");
	WebElement cl = driver.findElement(By.xpath("//button[@class='searchformButton col-xs-4 rippleGrey']"));
		cl.click();
		
		WebElement fs = driver.findElement(By.xpath("(//img[@class='product-image '])[3]"));
		fs.click();
		String pWid = driver.getWindowHandle();
		System.out.println(pWid);
		Set<String> allWid = driver.getWindowHandles();
		System.out.println(allWid);
		for (String eachWid : allWid) {
			if (!pWid.equals(allWid)) {
				driver.switchTo().window(eachWid);
			}
			
		}
			
		WebElement cart = driver.findElement(By.xpath("//div[@id='add-cart-button-id']"));
		cart.click();
		WebElement view = driver.findElement(By.xpath("//div[@class='btn btn-theme-secondary open-cart']"));
		view.click();
		WebElement qua = driver.findElement(By.xpath("//div[@id='CS1']"));
	qua.click();
	WebElement la = driver.findElement(By.xpath("//li[@rel='2']"));
	la.click();
	Thread.sleep(5000);
	driver.quit();
	}
		
		
	}

