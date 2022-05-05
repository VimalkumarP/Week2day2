package Week2day1;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Assignment1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriverManager.chromedriver().setup();
		 ChromeDriver driver=new ChromeDriver(); 
			driver.manage().window().maximize();
			driver.get("https://acme-test.uipath.com/login");
			//enter email
			driver.findElement(By.id("email")).sendKeys("kumar.testleaf@gmail.com");
			//enter password
			driver.findElement(By.id("password")).sendKeys("leaf@12");
			//click login
			driver.findElement(By.xpath("//button[@type='submit']")).click();
			//get title
		    String s=driver.getTitle();
		    System.out.println(s);
		    //click logout
		    driver.findElement(By.linkText("Log Out")).click();
		    //close
		    driver.close();
	}

}
