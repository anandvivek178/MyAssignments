package week3.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class EditLeadAssignment {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ChromeDriver driver = new ChromeDriver();

		driver.get("http://leaftaps.com/opentaps/control/main");

		driver.manage().window().maximize();

		driver.findElement(By.id("username")).sendKeys("Demosalesmanager");

		driver.findElement(By.id("password")).sendKeys("crmsfa");

		driver.findElement(By.className("decorativeSubmit")).click();

		driver.findElement(By.linkText("CRM/SFA")).click();
		
		driver.findElement(By.linkText("Create Lead")).click();
		
		driver.findElement(By.xpath("//input[@id='createLeadForm_companyName']")).sendKeys("Company");
		
		driver.findElement(By.xpath("//input[@id='createLeadForm_firstName']")).sendKeys("First");
		
		driver.findElement(By.xpath("//input[@id='createLeadForm_lastName']")).sendKeys("Last");
		
		driver.findElement(By.xpath("//input[@id='createLeadForm_firstNameLocal']")).sendKeys("FirstLocal");
		
		driver.findElement(By.xpath("//input[@id='createLeadForm_departmentName']")).sendKeys("Science");
		
		driver.findElement(By.id("createLeadForm_description")).sendKeys("Desc");
		
		driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("test@gmail.com");
		
		WebElement dd1 = driver.findElement(By.id("createLeadForm_generalStateProvinceGeoId"));
		
		Select s1 = new Select(dd1);
		
		s1.selectByVisibleText("New York");
		
		driver.findElement(By.xpath("//input[@value='Create Lead']")).click();
		
		driver.findElement(By.linkText("Edit")).click();
		
		driver.findElement(By.id("updateLeadForm_description")).clear();
		
		driver.findElement(By.id("updateLeadForm_importantNote")).sendKeys("test");
		
		driver.findElement(By.xpath("//input[@value='Update']")).click();
		
		String title = driver.getTitle();
		
		System.out.println(title);
		
		driver.close();
		
		
		

	}

}
