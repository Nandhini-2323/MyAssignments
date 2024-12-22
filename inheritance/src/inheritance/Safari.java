package inheritance;

public class Safari extends Browser {
	public void readerMode() {
		System.out.println("Reader Mode");
	}
	public void fullScreenMode() {
		System.out.println("Full screen mode");
	}


public static void main(String Args[]) {
	Safari s = new Safari();
	s.openUrl();
	s.navigateBack();
	s.readerMode();
	s.fullScreenMode();
	s.closeBrowser();
	
}}