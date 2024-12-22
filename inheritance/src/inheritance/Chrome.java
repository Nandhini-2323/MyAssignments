package inheritance;

public class Chrome extends Browser {
	public void openIncognito() {
		System.out.println("Open Incognito");
	}
	public void clearCache() {
		System.out.println("Clear the Cache");
	}
	

public static void main(String Args[]) {
	Chrome c = new Chrome();
	c.openIncognito();
	c.clearCache();
	c.openUrl();
	c.closeBrowser();
	c.navigateBack();
}
}