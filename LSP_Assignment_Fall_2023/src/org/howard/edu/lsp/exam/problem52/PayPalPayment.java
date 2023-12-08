package org.howard.edu.lsp.exam.problem52;

public class PayPalPayment implements PaymentStrategy {
	
	private String emailaddr;
	
	public PayPalPayment(String email) {
		this.emailaddr = email;
	}
     
	@Override
	public void pay(String amount, String email) {
		System.out.println("Paid " + amount + " using PayPal account " + email);
	}

}
