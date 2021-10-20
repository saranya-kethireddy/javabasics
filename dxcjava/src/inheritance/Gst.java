package inheritance;

public class Gst extends IncomeTax {
	
	String aadharcard;
	
	@Override
	int calculateTax(int income) {
		// TODO Auto-generated method stub
		int tax = super.calculateTax(income);
		if(income > 10000) {
			tax = income/5;	
			}
		return tax;
	}
	

}
