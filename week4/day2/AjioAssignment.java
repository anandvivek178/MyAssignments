package week4.day2;

import java.time.Duration;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AjioAssignment {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		ChromeDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("https://www.ajio.com/");

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

		driver.findElement(By.xpath("//input[@name='searchVal']")).sendKeys("bags");

		driver.findElement(By.xpath("//input[@name='searchVal']")).sendKeys(Keys.ENTER);

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

		driver.findElement(By.xpath("//input[@id='Men']/following-sibling::label")).click();

		Thread.sleep(3000);

		driver.findElement(By.xpath("//input[@id='Men - Fashion Bags']/following-sibling::label")).click();

		Thread.sleep(3000);

		String searchResultCount = driver.findElement(By.xpath("//div[@class = 'length']/strong")).getText();

		System.out.println(searchResultCount);

		List<WebElement> brandNames = driver.findElements(By.xpath("//div[@class = 'brand']/strong"));

		HashSet <String> brand = new HashSet<String>();

		for(WebElement a :  brandNames) {

			brand.add(a.getText());
		}

		System.out.println("The brand results are : " +brand);

		List<WebElement> bagNames = driver.findElements(By.xpath("//div[@class='brand']/following::div[1]"));

		List<String> bag = new ArrayList<String>();
		 
		for(WebElement a :  bagNames) {

			bag.add(a.getText());
		}
		
		System.out.println("The bag results are : " + bag);
		
		driver.close();
	}

}
