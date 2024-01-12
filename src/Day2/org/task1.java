package Day2.org;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class task1 {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("http://www.facebook.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		WebElement user = driver.findElement(By.id("email"));
		user.sendKeys("divya098");
		String print = user.getAttribute("value");
		System.out.println(print);
		WebElement pass = driver.findElement(By.id("pass"));
		pass.sendKeys("1234");
		WebElement btn = driver.findElement(By.name("login"));
		btn.click();
		Thread.sleep(10);
		driver.quit();
		
	}

}
