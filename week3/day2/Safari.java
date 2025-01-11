package week3.day2;

public class Safari extends Browser {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Safari s = new Safari();
		
		s.openURL();
		s.readerMode();
		s.fullScreenMode();
		s.navigateBack();
		s.closeBrowser();

	}
	
	public void readerMode() {
		
		System.out.println("Reader Mode");
	}
	
	public void fullScreenMode() {
		
		System.out.println("Full Screen Mode");
	}

}
