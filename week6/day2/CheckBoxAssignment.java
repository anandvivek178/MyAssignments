package week6.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class CheckBoxAssignment {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		ChromeDriver driver = new ChromeDriver();

		driver.get("https://leafground.com/checkbox.xhtml");

		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		driver.findElement(By.xpath("(//div[contains(@class , 'ui-chkbox-box')])[1]")).click();

		driver.findElement(By.xpath("(//span[text()='Ajax']/preceding-sibling::div)[2]")).click();

		WebDriverWait wait = new WebDriverWait(driver , Duration.ofSeconds(30));

		WebElement ajax = driver.findElement(By.xpath("//span[text()='Checked']"));

		String ajaxText = wait.until(ExpectedConditions.visibilityOf(ajax)).getText();

		System.out.println(ajaxText);

		String expectedAjaxText = "Checked";

		Assert.assertEquals(ajaxText, expectedAjaxText);
		
		wait.until(ExpectedConditions.invisibilityOf(ajax));

		driver.findElement(By.xpath("//label[text()='Java']/preceding-sibling::div")).click();

		driver.findElement(By.xpath("//label[text()='Python']/preceding-sibling::div")).click();

		driver.findElement(By.xpath("//div[contains(@id , 'ajaxTriState')]/div[2]")).click();

		WebElement triState = driver.findElement(By.xpath("//span[@class = 'ui-growl-title']"));

		WebElement triStateNum = driver.findElement(By.xpath("//span[@class = 'ui-growl-title']/following::p"));

		String  triStateText = wait.until(ExpectedConditions.visibilityOf(triState)).getText();

		String  triStateNumText = wait.until(ExpectedConditions.visibilityOf(triStateNum)).getText();
		
		System.out.println(triStateText);
		
		System.out.println(triStateNumText);
		
		wait.until(ExpectedConditions.invisibilityOf(triState));
		
		driver.findElement(By.xpath("//div[(@class = 'ui-toggleswitch-slider')]")).click();
		
		String toggle = driver.findElement(By.xpath("//span[text()='Checked']")).getText();
		
		System.out.println(toggle);
		
		Assert.assertEquals(toggle, expectedAjaxText);
		
		wait.until(ExpectedConditions.invisibilityOf(driver.findElement(By.xpath("//span[text()='Checked']"))));
		
		boolean enabled = driver.findElement(By.xpath("//span[text() = 'Disabled']/preceding::div[1]")).isEnabled();
		
		System.out.println(enabled);
		
		if(enabled == false) {
			
			System.out.println("The checkbox is disabled");
		}
		
		else {
			
			System.out.println("The checkbox is enabled");
		}
		
		driver.findElement(By.xpath("//div[contains(@class , 'ui-selectcheckboxmenu-multiple')]")).click();
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("(//label[text() = 'Miami'])[2]/preceding::span[1]/parent::div")).click();
		
		driver.findElement(By.xpath("(//label[text() = 'London'])[2]/preceding::span[1]/parent::div")).click();
		
		driver.findElement(By.xpath("(//label[text() = 'Berlin'])[2]/preceding::span[1]/parent::div")).click();
		
		driver.quit();
		
		}

	}


