package week5.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class TestngParameterization {
     
	@Parameters({"URL" , "Username" , "Password"})
	@Test
	public void testCase(String url , String username , String password) {
		
		ChromeDriver driver = new ChromeDriver();
		
		driver.get(url);
		
		driver.manage().window().maximize();
		
		driver.findElement(By.id("username")).sendKeys(username);

		driver.findElement(By.id("password")).sendKeys(password);

		driver.findElement(By.className("decorativeSubmit")).click();
		
		System.out.println(driver.getTitle());
		
		driver.close();
		
	}
	
}
