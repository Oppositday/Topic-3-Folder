import java.util.Scanner;
import static java.lang.System.out;

public class Q04_11 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		out.print("Enter a decimal value (0 to 15): ");
		int decimal = input.nextInt();
		
		if (decimal >= 0 && decimal <= 9)
			out.println("The hex value is " + decimal);
		else if (decimal >= 10 && decimal <= 15)
			out.println("The hex value is " + (char)(decimal + 'A' - 10));
		else
			out.println(decimal + " is an invalid input");
	}

}
