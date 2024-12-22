package inheritance;

public class Browser {
	String browsername= "chrome";
	String browserVersion = "version1";
	public void openUrl() {
		System.out.println("Open the browser ");
	}
	public void closeBrowser() {
		System.out.println("Close the browser");
	}
	public void navigateBack() {
		System.out.println("Navigate to previous window");
	}
	
	


public static void main(String Args[]) {
	Browser b =new Browser();
	b.openUrl();
	b.closeBrowser();
	b.navigateBack();

}


}