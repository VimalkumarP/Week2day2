package Week2day1;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Edit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://leafground.com/pages/Edit.html");
		driver.manage().window().maximize();	
		//Enter email
		driver.findElement(By.id("email")).sendKeys("vimal975111@gmail.com");
		//Enter text and press keyboard tab
		driver.findElement(By.xpath("//label[text()='Append a text and press keyboard tab']/following-sibling::input")).sendKeys("TestLeaf");
		WebElement ele=driver.findElement(By.xpath("//label[text()='Append a text and press keyboard tab']/following-sibling::input"));
		ele.sendKeys(Keys.TAB);
		
		//text entered
		String s1=driver.findElement(By.xpath("//label[text()='Get default text entered']/following-sibling::input")).getAttribute("value");
		System.out.println(s1);
        //Clear
        driver.findElement(By.xpath("//label[text()='Clear the text']/following-sibling::input")).clear();
        //field is disabled
		boolean s2=driver.findElement(By.xpath("//label[text()='Confirm that edit field is disabled']/following-sibling::input")).isEnabled();
		System.out.println(s2);
		driver.quit();
		
	}

}
