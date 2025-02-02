package week6.day2;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RadioButtonAssignment {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ChromeDriver driver = new ChromeDriver();

		driver.get("https://www.leafground.com/radio.xhtml");

		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.findElement(By.xpath("(//label[text() = 'Chrome'])[1]/preceding::div[1]")).click();

		WebElement unselected = driver.findElement(By.xpath("(//label[text() = 'Chennai'])[1]/preceding::div[1]"));
		
		unselected.click();
		
		unselected.click();
		
		boolean selected = unselected.isSelected();
		
		System.out.println(selected);
		
		List<WebElement> radioButtons = driver.findElements(By.xpath("(//table)[6]/tbody/tr/td"));
		
		for (int i = 1; i <= radioButtons.size(); i++) {
			
			boolean selected2 = driver.findElement(By.xpath("(//table)[6]/tbody/tr/td["+i+"]/div/div[2]")).isSelected();
			
			if(selected2) {
				
				String selectedRadioButton = driver.findElement(By.xpath("(//table)[6]/tbody/tr/td["+i+"]/div/following::label[1]")).getText();
				
				System.out.println("Default selected buttion is " + selectedRadioButton);
			}
			
		}
		
		boolean selected2 = driver.findElement(By.xpath("//label[text() = '21-40 Years']/preceding::div[1]")).isSelected();
		
		System.out.println(selected2);
		
		if(selected2 == false) {
			
			driver.findElement(By.xpath("//label[text() = '21-40 Years']/preceding::div[1]")).click();
			
		}
		
		driver.quit();
	}

}
