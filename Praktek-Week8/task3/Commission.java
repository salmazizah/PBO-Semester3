package task3;

public class Commission extends Hourly{
	private double ttlSales;
	private double commRate;

	public Commission(String eName, String eAddress, String ePhone, String socSecNumber, double rate, double commission) {
		super(eName, eAddress, ePhone, socSecNumber, rate);
		
		commRate = commission;
	}
	
	public void addSales(double totalSales) {
		ttlSales += totalSales;
	}
	
	public double pay() {
		double payment = super.pay();
		
		payment += commRate * ttlSales;
		
		return payment;
	}
	
	public String toString() {
		String result = super.toString();
		
		result += "\nTotal Sales            : " + ttlSales;
		
		return result;
	}
	
}
