package Week2day1;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FindAccount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriverManager.chromedriver().setup();

		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://leaftaps.com/opentaps/control/main");
		
		 driver.findElement(By.id("username")).sendKeys("Demosalesmanager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();		
		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.xpath("//a[contains(text(),'Accounts')]")).click();
		driver.findElement(By.xpath("//a[contains(text(),'Find')]")).click();
		driver.findElement(By.xpath("(//input[@name='accountName'])[2]")).sendKeys("credit limited account");
		driver.findElement(By.xpath("//button[contains(text(),'Find')]")).click();
		driver.findElement(By.xpath("//a[contains(text(),'Credit')][1]")).click();
		driver.findElement(By.xpath("//a[contains(text(),'Edit')][1]")).click();
		System.out.println(driver.findElement(By.id("accountName")).getAttribute("value"));
		System.out.println(driver.findElement(By.name("description")).getText());
		System.out.println(driver.getTitle());
		driver.close();

	}

}
