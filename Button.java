package Week2day1;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Button {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		WebDriverManager.chromedriver().setup();
	    ChromeDriver driver=new ChromeDriver();
	    driver.get("http://leafground.com/pages/Button.html");
	    driver.manage().window().maximize();
		//Find position of button (x,y)
		System.out.println(driver.findElement(By.id("position")).getLocation());
		//Find button color
		System.out.println(driver.findElement(By.xpath("//button[text()='What color am I?']")).getCssValue("color"));
		//Find the height and width
		System.out.println(driver.findElement(By.id("size")).getSize());
		//Click button to travel home page
		driver.findElement(By.xpath("//button[text()='Go to Home Page']")).click();
		driver.close();
		
	}

}
