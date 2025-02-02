package week6.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class ButtonAssignment {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ChromeDriver driver = new ChromeDriver();

		driver.get("https://leafground.com/button.xhtml");

		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.findElement(By.xpath("//span[text() = 'Click']/parent::button")).click();
		
		String firstTitleExpected = "Dashboard";
		
		String firstTitleActual = driver.getTitle();
		
		driver.navigate().back();
		
		System.out.println(firstTitleActual);
		
		Assert.assertEquals(firstTitleActual, firstTitleExpected);
		
		boolean enabledButton = driver.findElement(By.xpath("(//span[text() = 'Click']/parent::button/following::div/child::button)[1]")).isEnabled();
		
		System.out.println(enabledButton);
		
		if(enabledButton) {
			
			System.out.println("Button is enabled");
		}
		
		else {
			
			System.out.println("Button is disabled");
		}
		
		
		Point location = driver.findElement(By.xpath("(//span[text() = 'Submit'])[1]/parent::button")).getLocation();
		
		System.out.println("The position (x,y) is" + " : " + location.getX() + " , " + location.getY());
		
		String color = driver.findElement(By.xpath("//span[text() = 'Save']/parent::button")).getCssValue("background-color");
		
		System.out.println(color);
		
		Dimension size = driver.findElement(By.xpath("(//span[text() = 'Submit'])[2]/parent::button")).getSize();

		int height = size.getHeight();
		
		int width = size.getWidth();
		
		System.out.println("Height is " + height + " and " + "Width is " + width);
		
		driver.quit();
	}

}
