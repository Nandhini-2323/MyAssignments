package week4.day1;

public abstract class CanaraBank implements Payments {

	public void cashOnDelivery() {
		System.out.println("cash on delivery is opted");
	}
	
	public void upiPayments() {
		System.out.println("UPI Payment is opted");
	}
	
	public void cardPayments() {
		System.out.println("Card payment is opted");
	}
	
	public void internetBanking() {
		System.out.println("Internet banking is opted");
	}
	
	public abstract void recordPaymentDetails();		
	}

