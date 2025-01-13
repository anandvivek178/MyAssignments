package week4.day1;

import java.util.Arrays;

public class Amazon extends CanaraBank {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Amazon a = new Amazon();
		a.cashOnDelivery();
		a.cardPayments();
		a.internetBanking();
		a.upiPayments();
		a.recordPaymentDetails();
	

	}

	@Override
	public void cashOnDelivery() {
		// TODO Auto-generated method stub
		
		System.out.println("Cash on Delivery");
		
	}

	@Override
	public void upiPayments() {
		// TODO Auto-generated method stub
		System.out.println("UPI Payments");
	}

	@Override
	public void cardPayments() {
		// TODO Auto-generated method stub
		System.out.println("Card Payments");
	}

	@Override
	public void internetBanking() {
		// TODO Auto-generated method stub
		System.out.println("Internet Banking");
	}

	@Override
	public void recordPaymentDetails() {
		// TODO Auto-generated method stub
		System.out.println("Record Payment Details");
	}

}
