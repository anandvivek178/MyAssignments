package week6.day2;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WebTableAssignment {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ChromeDriver driver = new ChromeDriver();

		driver.get("https://erail.in/");	

		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

		driver.findElement(By.id("txtStationFrom")).clear();

		driver.findElement(By.id("txtStationFrom")).sendKeys("MAS");

		driver.findElement(By.id("txtStationFrom")).sendKeys(Keys.ENTER);

		driver.findElement(By.id("txtStationTo")).clear();

		driver.findElement(By.id("txtStationTo")).sendKeys("MDU");

		driver.findElement(By.id("txtStationTo")).sendKeys(Keys.ENTER);

		driver.findElement(By.id("chkSelectDateOnly")).click();

		WebDriverWait wait = new WebDriverWait(driver , Duration.ofSeconds(10));

		wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//table[contains(@class , 'TrainList')]"))));

		List<WebElement> trainRow = driver.findElements(By.xpath("//table[contains(@class , 'TrainList')]/tbody/tr/td[2]"));
		
		List<String> trainsAvailable = new ArrayList<String>();

		int rowCount = trainRow.size();
		
		System.out.println("Number of rows in the tables is " + rowCount);

		List<WebElement> trainColumn = driver.findElements(By.xpath("//table[contains(@class , 'TrainList')]/tbody/tr/th"));

		int columnCount = trainColumn.size();
		
		System.out.println("Number of columns in the tables is " + columnCount);
		
		System.out.println("The trains names are below");
		
		for (int i = 0 ; i < rowCount ; i++) {
			
			String trainNames = trainRow.get(i).getText();
			
			trainsAvailable.add(trainNames);
			
		}
		
		
		Collections.sort(trainsAvailable);
		
		System.out.println(trainsAvailable);

		List<String> duplicates = new ArrayList<String>();
		
		for(int i = 0; i<trainsAvailable.size() ; i++) {
			
			for(int j= i+1 ; j<trainsAvailable.size(); j++ ) {
				
				if(trainsAvailable.get(i).equals(trainsAvailable.get(j))) {
					
					duplicates.add(trainsAvailable.get(j));
				}
			}
		}
		
		int dSize = duplicates.size();
			
			if(dSize==0) {
				
				System.out.println("No Duplicate trains");
			}
			
			else {
				
				System.out.println("The duplicate trains names are "+ duplicates);
			}
			
			driver.quit();
		}
	}


