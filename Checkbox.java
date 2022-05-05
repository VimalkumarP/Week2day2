package Week2day1;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Checkbox {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://leafground.com/pages/checkbox.html");
	    driver.manage().window().maximize();
	    //select
	     driver.findElement(By.xpath("(//label[text()='Select the languages that you know?']/following-sibling::input)[4]")).click();
	     //verify
	     System.out.println(driver.findElement(By.xpath("//label[text()='Confirm Selenium is checked']/following-sibling::input")).isSelected());
	     //unselect
	     driver.findElement(By.xpath("(//label[text()='DeSelect only checked']/following-sibling::input)[2]")).click();   
	     //selectall
	     driver.findElement(By.xpath("(//label[text()='Select all below checkboxes ']/following-sibling::input)[1]")).click();
	     driver.findElement(By.xpath("(//label[text()='Select all below checkboxes ']/following-sibling::input)[2]")).click();
	     driver.findElement(By.xpath("(//label[text()='Select all below checkboxes ']/following-sibling::input)[3]")).click();
	     driver.findElement(By.xpath("(//label[text()='Select all below checkboxes ']/following-sibling::input)[4]")).click();
	     driver.findElement(By.xpath("(//label[text()='Select all below checkboxes ']/following-sibling::input)[5]")).click();
	     driver.findElement(By.xpath("(//label[text()='Select all below checkboxes ']/following-sibling::input)[6]")).click();
	     //quit
	     driver.quit();
	     
	}

}
