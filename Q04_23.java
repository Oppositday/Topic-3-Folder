import java.util.Scanner;
import static java.lang.System.out;

public class Q04_23 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		out.print("Enter the employee's name: ");
		String name = input.next();
		out.print("Enter number of hours worked in a week: ");
		double hours = input.nextDouble();
		out.print("Enter hourly pay rate: ");
		double rate = input.nextDouble();
		out.print("Enter federal tax withholding rate: ");
		double federal = input.nextDouble();
		out.print("Enter state withholding rate: ");
		double state = input.nextDouble();
		
		double gross, ftax, stax, total;
		out.println("Employee Name: " + name);
		out.println("Hours worked: " + hours);
		out.println("Pay Rate: $" + rate);
		out.println("Gross Pay: $" + (gross = rate * hours));
		out.println("Deductions:");
		out.println("Federal Withholding (" + federal + "): $"+ (ftax = rate * hours * federal));
		out.println("State Withholding (" + state + "): $"+ (stax = rate * hours * state));
		out.println("Total Deduction: $" + (total = rate * hours * federal + rate * hours * state));
		out.println("Net Pay: $" + (gross - total));
	}

}
