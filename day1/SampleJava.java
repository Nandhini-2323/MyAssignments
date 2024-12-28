package week4.day1;

public class SampleJava {
	
	public void reportStep(String Message, String Status) {
		System.out.println("The Message is "+Message + " and Status is "+Status);
	}

	public void reportStep(String Message, String Status, boolean snap) {
		System.out.println("The Message is "+Message + " and Status is "+Status +". "+"Snap is " +snap);
	}
	
	public void takeSnap() {
		System.out.println("Snap is taken successfully2");}
	
	public static void main(String Args[]) {
		SampleJava rep =new SampleJava();
		
		rep.reportStep("hello","displayed");
		rep.reportStep("World","displayed",true);
		
		
	}
}
