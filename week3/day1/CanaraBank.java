package week3.day1;

public abstract class CanaraBank implements Payments{
	@Override
	public void cashOnDelivery() {
		System.out.println("Cash on Delivery possible");
		
	}
	@Override
	public void upiPayments() {
		// TODO Auto-generated method stub
	System.out.println("Upi payments");	
	}
	
	@Override
	public void cardPayments() {
		// TODO Auto-generated method stub
	System.out.println("Card Payments");	
	}
	
	@Override
	public void internetBanking() {
		// TODO Auto-generated method stub
	System.out.println("Internet banking");	
	}

	public abstract void recordPaymentDetails();

}
