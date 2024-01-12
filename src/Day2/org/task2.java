package Day2.org;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class task2 {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.com/");
		WebElement google = driver.findElement(By.xpath("//textarea[@jsname='yZiJbe']"));
		google.sendKeys("green technology");
		Thread.sleep(10);
		
		driver.close();
	}

}
