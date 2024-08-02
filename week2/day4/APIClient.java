package week2.day4;

public class APIClient {
	
	public static void sendRequest(String endpoint) {
	System.out.println(endpoint);

	}
	public static void sendRequest(String endpoint,String requestBody,String requestStatus) {
		System.out.println(endpoint+requestBody+requestStatus);	

	}
	public static void main(String[] args) {
	
		sendRequest("1st Method");
		sendRequest("2nd Method","Request body","requestStatus");
		
	}

}
