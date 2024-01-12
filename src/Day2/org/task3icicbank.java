package Day2.org;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class task3icicbank {
	public static void main(String[] args) throws AWTException, InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("https://infinity.icicibank.com/corp/Login.jsp");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		WebElement dummy = driver.findElement(By.name("DUMMY1"));

		Actions s=new Actions(driver);
		s.doubleClick(dummy).perform();
//		Robot r=new Robot();
//		r.keyPress(KeyEvent.VK_ENTER);
//		r.keyPress(KeyEvent.VK_ENTER);
		Thread.sleep(10);
		WebElement login = driver.findElement(By.xpath("//input[contains(@class,'login-input type_UserPr')]"));
		login.sendKeys("1234567");
		WebElement pass = driver.findElement(By.xpath("(//input[@type='password'])[4]"));
		pass.sendKeys("Divya@98");
		driver.close();
		
//		
//		dummy.sendKeys("876543");
		
	}

}
