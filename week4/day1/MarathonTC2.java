package week4.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class MarathonTC2 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("https://www.pvrcinemas.com");
		
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//span[text()='Cinema']")).click();
		
		driver.findElement(By.xpath("//span[text()='Select Cinema']")).click();
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//li/span[contains(text(),'INOX The Marina Mall')]")).click();
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//span[contains(text(),'Tomorrow')]")).click();
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//li/span[text()='GAME CHANGER']")).click();
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//span[text()='11:50 AM']")).click();
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("(//span[text()='Book'])[4]/parent::button")).click();
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//button[text()='Accept']")).click();
		
		driver.findElement(By.xpath("(//span[contains(@id, 'CLUB') and @class='seat-current-pvr'])[1]")).click();
		
		driver.findElement(By.xpath("//button[text()='Proceed']")).click();
		
		Thread.sleep(2000);
		
		String seatNum = driver.findElement(By.xpath("//div[@class='seat-number']/p")).getText();
		
		System.out.println("The Seat Number is " + seatNum);
		
		Thread.sleep(2000);
		
		String ticketCost = driver.findElement(By.xpath("//h6[text()='Grand Total']/following::h6/child::span")).getText();
		
		System.out.println("The Ticket Cost is " + ticketCost);
		
		driver.findElement(By.xpath("//button[text()='Proceed']")).click();
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("(//div[contains(@class , 'cross-icon')])[2]")).click();
		
		String title = driver.getTitle();
		
		System.out.println(title);
		
		driver.close();
		
		
	}

}
