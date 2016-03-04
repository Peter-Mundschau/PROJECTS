import java.util.*;
import java.text.*;

public class Payroll_With_OT {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter your hourly wage");
		
		double payRate=
		
	Double.parseDouble(scanner.next());
		
		System.out.println("Enter your Hours Worked");		
		double hoursWorked=
	Double.parseDouble(scanner.next());
		
		double OT = (hoursWorked - 40);
		
		if (hoursWorked >40) {
		
		double grossPay;
		grossPay = ((1.5*payRate*OT))+(40*payRate);
		
		String dollar;
		dollar = "Your Gross Pay is $";
		
				System.out.printf(dollar + "%.2f",grossPay);
		}else{
		
		
		double grossPay;
		grossPay = hoursWorked * payRate;
		
		String dollar;
		dollar = "Your Gross Pay is $";
		
	
		System.out.printf(dollar + "%.2f",grossPay);
	}

}
}