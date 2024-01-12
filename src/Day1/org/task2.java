package Day1.org;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class task2 {
	public static void main(String[] args) {
		WebDriver driver=new EdgeDriver();
		driver.get("http://www.flipkart.com/");
		String url = driver.getCurrentUrl();
		System.out.println(url);
		String title = driver.getTitle();
		System.out.println(title);
		driver.manage().window().maximize();
		driver.close();
	}

}
