package Week2day1;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CreateLead {

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
		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.xpath("//a[contains(text(),'Create')]")).click();
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("Amazon");		
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Vimalkumar");		
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("P");
		driver.findElement(By.name("submitButton")).click();
		String title=driver.getTitle();
		System.out.println("title:"+title);
		driver.close();
	}

}
