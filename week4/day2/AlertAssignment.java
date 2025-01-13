package week4.day2;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class AlertAssignment {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		ChromeDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("https://www.leafground.com/alert.xhtml");
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.findElement(By.xpath("(//span[text() = 'Show'])[5]")).click();
		
		Thread.sleep(2000);
		
		String alertText = "Vivek";
		
		Alert alert = driver.switchTo().alert();
		
		System.out.println(alert.getText());
		
		alert.sendKeys(alertText);
		
		alert.dismiss();
		
		Thread.sleep(2000);
		
		String dismissText = driver.findElement(By.xpath("//span[@id = 'confirm_result']")).getText();
		
		System.out.println(dismissText);
		
		driver.findElement(By.xpath("(//span[text() = 'Show'])[5]")).click();
		
		Thread.sleep(2000);
		
		Alert alert1 = driver.switchTo().alert();
		
		alert1.sendKeys(alertText);
		
		alert1.accept();
		
		Thread.sleep(2000);
		
		String acceptText = driver.findElement(By.xpath("//span[@id = 'confirm_result']")).getText();
		
		System.out.println(acceptText);
		
		String[] split = acceptText.split(": ");
		
		String alertEnteredText = split[1].trim();
		
		Assert.assertEquals(alertText, alertEnteredText);
		
		System.out.println("The entered text in the alert is : " + alertEnteredText);
		
		driver.close();
	
		
	}

}
