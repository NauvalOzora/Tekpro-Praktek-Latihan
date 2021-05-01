package Latihan7_3;

public class Commission extends Hourly {
	private double totalsales;
	private double CommissionRate;
	
	public Commission(String eName, String eAddress, String ePhone, String socSecNumber, double rate, double comRate) {
		super(eName, eAddress, ePhone, socSecNumber, comRate);
		
		CommissionRate = comRate;
	}
	
	public void addSales (double totalsales) {
		this.totalsales += totalsales; 
	}

	public double pay() {
		double payment = super.pay();
		payment += totalsales * CommissionRate;
		totalsales = 0;
		
		return payment;
	}
	
	public String toString() {
		String result = super.toString();
	    result += "\nTotal Sales: " + totalsales; 
	    return result;
	}
}
