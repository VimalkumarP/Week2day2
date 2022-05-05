package Week2day1;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class NTCreateAccount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/login");
		driver.manage().window().maximize();
		
		driver.findElement(By.id("username")).sendKeys("Demosalesmanager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();

		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.xpath("//a[text()='Accounts']")).click();
		driver.findElement(By.linkText("Create Account")).click();
		
		driver.findElement(By.id("currencyUomId")).sendKeys("INR - Indian Rupee");
		
		driver.findElement(By.name("description")).sendKeys("NRI Account");
		
		driver.findElement(By.xpath("//input[@id='groupNameLocal']")).sendKeys("QTC");
		driver.findElement(By.xpath("//input[@id='officeSiteName']")).sendKeys("WTC");
		
		driver.findElement(By.xpath("//td[@class='titleCell']/following::input[@id='annualRevenue']")).sendKeys("98765467");
		
		driver.findElement(By.xpath("//input[@class='smallSubmit']")).click();
		
		System.out.println(driver.findElement(By.className("errorMessage")).getText());
		
		
		//driver.close();

	}

}
