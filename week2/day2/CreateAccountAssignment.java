package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class CreateAccountAssignment {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ChromeDriver driver = new ChromeDriver();

		driver.get("http://leaftaps.com/opentaps/");

		driver.manage().window().maximize();

		driver.findElement(By.id("username")).sendKeys("Demosalesmanager");

		driver.findElement(By.id("password")).sendKeys("crmsfa");

		driver.findElement(By.className("decorativeSubmit")).click();

		driver.findElement(By.linkText("CRM/SFA")).click();

		driver.findElement(By.linkText("Accounts")).click();

		driver.findElement(By.linkText("Create Account")).click();
		
		String accountNameEntered = "Sample Test7";

		driver.findElement(By.id("accountName")).sendKeys(accountNameEntered);

		driver.findElement(By.name("description")).sendKeys("Selenium Automation Tester");

		WebElement dd1 = driver.findElement(By.name("industryEnumId"));

		Select s1 = new Select(dd1);

		s1.selectByVisibleText("Computer Software");

		WebElement dd2 = driver.findElement(By.name("ownershipEnumId"));

		Select s2 = new Select(dd2);

		s2.selectByVisibleText("S-Corporation");

		WebElement dd3 = driver.findElement(By.name("dataSourceId"));

		Select s3 = new Select(dd3);

		s3.selectByValue("LEAD_EMPLOYEE");
		
		WebElement dd4 = driver.findElement(By.name("marketingCampaignId"));

		Select s4 = new Select(dd4);

		s4.selectByIndex(6);
		
		WebElement dd5 = driver.findElement(By.name("generalStateProvinceGeoId"));

		Select s5 = new Select(dd5);

		s5.selectByValue("TX");
		
		driver.findElement(By.className("smallSubmit")).click();
		
		//Xpath to get the text of Account name along with id
		
		String accountNameWithId = driver.findElement(By.xpath("//span[text()='Account Name']/parent::td/following-sibling::td/span[@class='tabletext']")).getText();
		
		//to get the index of '(' after AccountName to split from ID
		
		int index = accountNameWithId.indexOf('(');
		
		//to split and get the accountName from Id
		
	    String accountName = accountNameWithId.substring(0, index).trim();
	    
	    //to verify if the Account name created matches with Account name entered
	    
	    Assert.assertEquals(accountName, accountNameEntered);
 
	    System.out.println("The account with name " + accountName + " has been created" );
	    
	    driver.close();

	}

}
