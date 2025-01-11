package week3.day2;

public class LoginTestData extends TestData {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LoginTestData login = new LoginTestData();

		login.enterCredentials();
		login.enterUsername();
		login.enterPassword();
		login.navigateToHomePage();
	}

	public void enterUsername() {

		System.out.println("Enter your Username");

	}

	public void enterPassword() {

		System.out.println("Enter your Password");

	}

}
