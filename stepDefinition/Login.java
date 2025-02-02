package stepDefinition;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.But;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Login extends BaseClass {

	@Given("Setup the test env")
	public void setEnv() {

		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://leaftaps.com/opentaps/control/main");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}

	@Given("Enter the username as {string}")
	public void enterUserName(String uname) {
		driver.findElement(By.id("username")).sendKeys(uname);

	}
	@Given("Enter the password as {string}")
	public void enterPassword(String pass) {

		driver.findElement(By.id("password")).sendKeys(pass);
	}
	@When("Click on Login Button")
	public void clickLoginButton() {

		driver.findElement(By.className("decorativeSubmit")).click();
	}
	@Then("Login is successful")
	public void validateLogin() {

		System.out.println(driver.getTitle());
		
	}
	
	@But("Login is not successful")
	public void validateLoginFailure() {

		System.out.println(driver.getTitle());
		
	}
	
	

}
