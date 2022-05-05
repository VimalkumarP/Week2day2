package Week2day1;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Link {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		WebDriverManager.chromedriver().setup();

		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://leafground.com/pages/Link.html");
		
		driver.findElement(By.linkText("Go to Home Page")).click();
		driver.navigate().back();
		
		System.out.println("The page goes without clicking the link is:"+driver.findElement(By.linkText("Find where am supposed to go without clicking me?")).getAttribute("href"));
		//to verify the page is broken
		driver.findElement(By.linkText("Verify am I broken?")).click();		
		String s=driver.findElement(By.tagName("h1")).getText();
		//System.out.println("text:"+s);
		if(s.contains("404"))
			System.out.println("The page is broken");
		else
			System.out.println("The page is not broken");
		
		driver.navigate().back();
		driver.findElement(By.linkText("Go to Home Page")).click();
		System.out.println("The page is returned to home");
		
		driver.close();

	}

}
