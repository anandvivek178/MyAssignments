package week3.day2;

public class Edge extends Browser {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Edge e = new Edge();
		
		e.openURL();
		e.takeSnap();
		e.clearCookies();
		e.navigateBack();
		e.closeBrowser();

	}
	
	public void takeSnap() {
		
		System.out.println("Take Snap");
	}
	
	public void clearCookies() {
		
		System.out.println("Clear Cookies");
	}

}
