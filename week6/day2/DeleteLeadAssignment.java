package week6.day2;


import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;


public class DeleteLeadAssignment {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://leaftaps.com/opentaps/control/main");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.findElement(By.id("username")).sendKeys("Demosalesmanager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.linkText("Find Leads")).click();
		driver.findElement(By.xpath("//span[text() = 'Phone']")).click();
		driver.findElement(By.name("phoneNumber")).sendKeys("1");
		driver.findElement(By.xpath("//button[text() = 'Find Leads']")).click();
		Thread.sleep(2000);
		WebElement firstLead = driver.findElement(By.xpath("(//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a)[1]"));
		String leadID = firstLead.getText();
		firstLead.click();
		driver.findElement(By.linkText("Delete")).click();
		driver.findElement(By.linkText("Find Leads")).click();
		driver.findElement(By.name("id")).sendKeys(leadID);
		driver.findElement(By.xpath("//button[text() = 'Find Leads']")).click();
		
		Thread.sleep(2000);
		
		String expectedText = "No records to display";
		
		String actualText = driver.findElement(By.xpath("//div[@class = 'x-paging-info']")).getText();
		
		System.out.println(actualText);
		
		Assert.assertEquals(actualText, expectedText);
		
		driver.quit();
		
		

	}

}
