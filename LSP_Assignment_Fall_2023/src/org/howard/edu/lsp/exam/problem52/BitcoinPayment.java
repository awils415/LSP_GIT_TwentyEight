package org.howard.edu.lsp.exam.problem52;

public class BitcoinPayment implements PaymentStrategy {

	private String bitcoinAddr;
	
	public BitcoinPayment(String bitcoin) {
		this.bitcoinAddr = bitcoin;
	}

	@Override
	public void pay(String amount, String bitcoin) {
		System.out.println("Paid " + amount + " using BitCoin address " + bitcoin);
	}

}
