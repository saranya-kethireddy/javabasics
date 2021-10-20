package inheritance;

public class DemoTaxation {
             public static void main(String[] args) {
				Gst gst = new Gst();
				int tax = gst.calculateTax(11000);
				System.out.println("tax is  "+tax);
			}
}
