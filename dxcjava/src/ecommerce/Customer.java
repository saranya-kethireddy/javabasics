package ecommerce;

public class Customer {

	public void walkin() {
		System.out.println("abdul is going inside big bazaar");
		
	}

	public void shop() {
		System.out.println("customer is shopping");
	}

	public void checkout() {
		Cashier ansariCashier = new Cashier();
		ansariCashier.estimate();
	}

}
