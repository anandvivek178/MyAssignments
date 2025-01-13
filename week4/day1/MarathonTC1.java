package week4.day1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class MarathonTC1 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		ChromeDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.amazon.in");
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Bags for boys");
		
		driver.findElement(By.id("nav-search-submit-button")).click();
		
		String resultText = driver.findElement(By.xpath("//span[contains(text(), 'results')]")).getText();
		
		String[] split = resultText.split(" ");
		
		String results = split[3];
		
		System.out.println("The searched item has " + results + " results");
		
		int checkBox = 2;
		
		for (int i = 1; i<=checkBox; i++) {
		
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("(//span[text()='Brands']/parent::div/following-sibling::ul/span/span/li/span/a/div/label/input/following-sibling::i)["+i+"]")).click();
		
		}
		
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//i[contains(@class , 'a-icon-dropdown')]/parent::span")).click();

		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//a[text()='Newest Arrivals']")).click();
		
		Thread.sleep(3000);
		
		String firstResult = driver.findElement(By.xpath("(//div[contains(@class , 'a-spacing-base')])[1]/div[2]/div[2]/a/h2/span")).getText();
		
		System.out.println("The first item is " + firstResult);
		
		String discountedPrice = driver.findElement(By.xpath("(//span[@class = 'a-price-whole'])[1]")).getText();
		
		System.out.println("The Discounted Price is " + discountedPrice);
		
		System.out.println(driver.getTitle());
		
		driver.close();
	}

}
