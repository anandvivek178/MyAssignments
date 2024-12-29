package week2.day1;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class LaunchBrowser {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		// Launch Chrome browser
				ChromeDriver driver=new ChromeDriver();
				
				//Launch Edge browser
				//EdgeDriver driver1=new EdgeDriver();
				
				//Load the url
				driver.get("https://www.facebook.com/");
				
				//Maximize the browser
				driver.manage().window().maximize();
				
				//close the browser
				driver.close();
	}

}
