package week4.day1;

public class APIClient {
	
	public void sendRequest(String a) {
		System.out.println(a+" is the endpoint ");
		System.out.println("------------------------------");
	}
	public void sendRequest(String a, String b, boolean c) {
		System.out.println(a+" is given at the endpoint ");
		System.out.println(b+ " is given to request the body");
		System.out.println(c+ " declares the request is successful");
	}
	public static void main(String[] args) {
		// object for APIClient
		APIClient client = new APIClient();
		client.sendRequest("Complete");
		client.sendRequest("Finish", "Process", true);
	}

}
