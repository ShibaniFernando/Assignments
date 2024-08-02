package week2.day4;

public class LoginTestData extends SuperClassExample {
	public void enterUsername(){
		System.out.println("Enter the username:");
	}
	
	public void enterPassword(){
		System.out.println("Enter the password:");
	}
	public static void main(String[] args) {
		
		LoginTestData s= new LoginTestData();
		s.enterCredentials();
		s.navigateToHomePage();
		s.enterUsername();
		s.enterPassword();
		
		
	}

}
