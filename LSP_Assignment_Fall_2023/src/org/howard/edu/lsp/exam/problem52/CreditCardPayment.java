package org.howard.edu.lsp.exam.problem52;

public class CreditCardPayment implements PaymentStrategy {
	
	private String cardNumber;
	
	public CreditCardPayment(String card) {
		this.cardNumber = card;
	}

	@Override
	public void pay(String amount, String card) {
		System.out.println("Paid " + amount + " using credit card " + card);
	}

}
