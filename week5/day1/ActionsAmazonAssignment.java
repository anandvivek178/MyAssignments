package week5.day1;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;


public class ActionsAmazonAssignment {

	public static void main(String[] args) throws InterruptedException, IOException, AWTException {
		// TODO Auto-generated method stub

		ChromeDriver driver = new ChromeDriver();

		driver.get("https://www.amazon.in/");

		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("oneplus 9 pro");

		driver.findElement(By.id("nav-search-submit-button")).click();

		String priceOfFirstProduct = driver.findElement(By.xpath("(//span[@class = 'a-price'])[1]")).getText();

		System.out.println("The price of first product is : " + priceOfFirstProduct);

		String ratingsCount = driver.findElement(By.xpath("(//a[contains(@aria-label , 'ratings')])[1]/span")).getText();

		System.out.println("The number of global ratings are : " + ratingsCount);

		WebElement productPic = driver.findElement(By.xpath("(//div[@data-cy = 'title-recipe'])[1]/a"));

		Actions action = new Actions(driver);

		action.moveToElement(productPic).perform();

		productPic.click();

		Set<String> windowHandles = driver.getWindowHandles(); 

		List<String> windowHandle = new LinkedList<String>(windowHandles);

		String parentTitle = driver.getTitle();

		System.out.println(parentTitle);

		driver.switchTo().window(windowHandle.get(2));

		Thread.sleep(3000);

		TakesScreenshot scrShot = ((TakesScreenshot)driver);

		File srcFile = scrShot.getScreenshotAs(OutputType.FILE);

		File destFile = new File("C:\\Users\\vivek\\Downloads\\Testleaf\\Assignments\\TC.jpeg");

		FileUtils.copyFile(srcFile, destFile);

		String childTitle = driver.getTitle();

		System.out.println(childTitle);

		Robot robot = new Robot();

		robot.keyPress(KeyEvent.VK_PAGE_DOWN);

		robot.keyRelease(KeyEvent.VK_PAGE_DOWN);
		
		Thread.sleep(3000);

		WebElement addToCart = driver.findElement(By.id("add-to-cart-button"));

		JavascriptExecutor jsExecutor = (JavascriptExecutor) driver;

		jsExecutor.executeScript("arguments[0].click();", addToCart);

		Thread.sleep(3000);

		String subTotalCart = driver.findElement(By.id("attach-accessory-cart-subtotal")).getText();

		System.out.println("The Cart subtotal is : " + subTotalCart);

		driver.close();
	}



}
