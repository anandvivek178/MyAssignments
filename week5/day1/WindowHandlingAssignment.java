package week5.day1;

import java.time.Duration;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WindowHandlingAssignment {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		ChromeDriver driver = new ChromeDriver();

		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));

		driver.get("http://leaftaps.com/opentaps/control/main");

		driver.manage().window().maximize();

		driver.findElement(By.id("username")).sendKeys("Demosalesmanager");

		driver.findElement(By.id("password")).sendKeys("crmsfa");

		driver.findElement(By.className("decorativeSubmit")).click();

		driver.findElement(By.linkText("CRM/SFA")).click();

		driver.findElement(By.linkText("Contacts")).click();

		driver.findElement(By.linkText("Merge Contacts")).click();

		driver.findElement(By.xpath("//input[@id = 'partyIdFrom']/parent::td/a/img")).click();

		Set<String> windowHandles1 = driver.getWindowHandles();

		List<String> wH1 = new LinkedList<String>(windowHandles1);

		driver.switchTo().window(wH1.get(2));

		driver.manage().window().maximize();

		System.out.println(driver.getTitle());
		
		wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.xpath("(//a[@class = 'linktext'])[1]"))));

		driver.findElement(By.xpath("(//a[@class = 'linktext'])[1]")).click();

		driver.switchTo().window(wH1.get(1));

		System.out.println(driver.getTitle());

		driver.findElement(By.xpath("//input[@id = 'partyIdTo']/parent::td/a/img")).click();

		Set<String> windowHandles2 = driver.getWindowHandles();

		List<String> wH2 = new LinkedList<String>(windowHandles2);

		driver.switchTo().window(wH2.get(2));

		driver.manage().window().maximize();

		System.out.println(driver.getTitle());
		
		wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.xpath("(//div[contains(@class,'firstName')])[3]/a"))));

		driver.findElement(By.xpath("(//div[contains(@class,'firstName')])[3]/a")).click();

		driver.switchTo().window(wH2.get(1));

		System.out.println(driver.getTitle());

		Thread.sleep(3000);

		driver.findElement(By.linkText("Merge")).click();

		Alert alert = driver.switchTo().alert();

		Thread.sleep(2000);

		alert.accept();

		String lastTitleExpected = 	"View Contact | opentaps CRM";

		String lastTitleActual = driver.getTitle();

		System.out.println(lastTitleActual);

		if(lastTitleExpected.equals(lastTitleActual)) {

			System.out.println("Testcase is pass");
		}
		else {

			System.out.println("Testcase is fail");
		}
		
		driver.quit();
	}

}
