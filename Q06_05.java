import java.util.Scanner;
import static java.lang.System.out;

public class Q06_05 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		out.print("Enter three numbers: ");
		double num1 = input.nextDouble();
		double num2 = input.nextDouble();
		double num3 = input.nextDouble();
		
		displaySortedNumbers(num1, num2, num3);
	}
	public static void displaySortedNumbers(
			double num1, double num2, double num3) {
		
		if (num1 < num2 && num2 < num3) {
			out.println(num1 + " " + num2 + " " + num3);
		}
		else if (num1 < num3 && num3 < num2) {
			out.println(num1 + " " + num3 + " " + num2);
		}
		else if (num2 < num1 && num1 < num3) {
			out.println(num2 + " " + num1 + " " + num3);
		}
		else if (num2 < num3 && num3 < num1) {
			out.println(num2 + " " + num3 + " " + num1);
		}
		else if (num3 < num1 && num1 < num2) {
			out.println(num3 + " " + num1 + " " + num2);
		}
		else if (num3 < num2 && num2 < num1) {
			out.println(num3 + " " + num2 + " " + num1);
		}
		else {
			out.println("Error, please re-enter numbers");
		}
	}

}
