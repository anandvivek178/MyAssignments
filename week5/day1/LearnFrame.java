package week5.day1;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnFrame {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		ChromeDriver driver = new ChromeDriver();

		driver.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_confirm");

		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

		driver.switchTo().frame(driver.findElement(By.id("iframeResult")));

		driver.findElement(By.xpath("//button[text() = 'Try it']")).click();

		Thread.sleep(2000);

		Alert alert = driver.switchTo().alert();

		System.out.println(alert.getText());

		alert.accept();

		Thread.sleep(2000);

		String text = driver.findElement(By.xpath("//p[@id = 'demo']")).getText();

		System.out.println(text);

		if (text.equals("You pressed OK!")) {

			System.out.println("Testcase is pass");
		}
		
		else {
			System.out.println("Testcase is fail");
		}

		driver.close();

	}

}
