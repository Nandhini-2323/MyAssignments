package inheritance;

public class Edge extends Browser {
	public void takeSnap() {
		System.out.println("Take Snap");
	}
	public void clearCookies() {
		System.out.println("Clear cache");
	}

public static void main(String Args[]) {
	Edge e = new Edge();
	e.openUrl();
	e.navigateBack();
	e.takeSnap();
	e.clearCookies();
	e.closeBrowser();
}
}