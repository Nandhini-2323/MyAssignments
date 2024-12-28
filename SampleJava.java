package week4.day1;

public class SampleJava {
	
	public void reportStep(String Message, String Status) {
		System.out.println("The Message is "+Message + " and Status is "+Status);
	}

	public void reportStep(String Message, String Status, boolean snap) {
		System.out.println("The Message is "+Message + " and Status is "+Status +" It is " +snap);
	}
	
	public static void main(String Args[]) {
		SampleJava rep =new SampleJava();
		
		rep.reportStep("hello","displayed");
		rep.reportStep("World","displayed",true);
		
		
	}
}
