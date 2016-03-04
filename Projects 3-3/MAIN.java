
public class MAIN {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		double hoursWorked;
		hoursWorked = 37.00f;
				
		double payRate;
		payRate = 22.50f;
				
		double grossPay;
		grossPay = hoursWorked * payRate;
		
		String dollar;
		dollar = "$";
		
	
		System.out.printf(dollar + "%.2f",grossPay);
	}

}
