package week3.day2;

public class Chrome extends Browser {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Chrome c = new Chrome();
		
		c.openURL();
		c.clearCache();
		c.openIncognito();
		c.navigateBack();
		c.closeBrowser();
	
	}
	
	public void openIncognito() {
		
		System.out.println("Open Incognito");
	}
	
	public void clearCache() {
		
		System.out.println("Clear Cache");
	}

}
