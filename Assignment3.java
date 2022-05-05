package Week2day1;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Assignment3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		WebDriverManager.chromedriver().setup();

		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.opencart.com/index.php?route=account/register");
		
		driver.findElement(By.id("input-username")).sendKeys("Mrblck");
		driver.findElement(By.id("input-firstname")).sendKeys("Vimalkumar");
		driver.findElement(By.id("input-lastname")).sendKeys("P");
		driver.findElement(By.id("input-email")).sendKeys("vimal975111@gmail.com");
		driver.findElement(By.id("input-country")).sendKeys("India");
		driver.findElement(By.id("input-password")).sendKeys("1997vimal");
		//driver.findElement(By.linkText("Register")).click();
	}

}
