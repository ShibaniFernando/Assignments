package week3.day1;

public class Amazon extends CanaraBank  {
	


	public void recordPaymentDetails(){
		System.out.println("Abstract method of the abstract is imlemented here");

	}

	public static void main(String[] args) {
		Amazon a = new Amazon();
		a.cardPayments();
		a.cashOnDelivery();
		a.internetBanking();
		a.recordPaymentDetails();
		a.upiPayments();
		
	}

}
