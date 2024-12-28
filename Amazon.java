package week4.day1;

public class Amazon extends CanaraBank {

	
	public static void main(String[] args) {
		Amazon payment = new Amazon();
		payment.cashOnDelivery();
		payment.upiPayments();
		payment.cardPayments();
		payment.internetBanking();
		payment.recordPaymentDetails();

	}
	@Override
	public void recordPaymentDetails() {
		System.out.println("Recording the payment details");
		
	}

}
