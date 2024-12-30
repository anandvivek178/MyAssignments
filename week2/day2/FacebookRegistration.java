package week2.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FacebookRegistration {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ChromeDriver driver = new ChromeDriver();

		driver.get("https://en-gb.facebook.com/");

		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

		driver.findElement(By.xpath("//a[text()='Create new account']")).click();

		driver.findElement(By.name("firstname")).sendKeys("Sample");

		driver.findElement(By.name("lastname")).sendKeys("Test");

		driver.findElement(By.name("reg_email__")).sendKeys("1234567890");

		driver.findElement(By.id("password_step_input")).sendKeys("@SAmpleTEst");

		WebElement dd1 = driver.findElement(By.id("day"));

		Select s1 = new Select(dd1);

		s1.selectByVisibleText("12");

		WebElement dd2 = driver.findElement(By.id("month"));

		Select s2 = new Select(dd2);

		s2.selectByVisibleText("Dec");
		
		WebElement dd3 = driver.findElement(By.id("year"));

		Select s3 = new Select(dd3);

		s3.selectByVisibleText("1957");
		
		driver.findElement(By.xpath("(//input[@id='sex'])[2]")).click();
		
		driver.quit();

	}

}
