import java.util.Scanner;
import static java.lang.System.out;

public class Q06_03 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		out.print("Enter an integer: ");
		int number = input.nextInt();
		
		if (isPalindrome(number)) {
			out.println(number + " is a palindrome");
		} 
		else {
			out.println(number + " is not a palindrome");
		}
	}
	public static boolean isPalindrome(int number) {
		return (number == reverse(number));
	}
	public static int reverse (int number) {
		int reverse = 0;
        while (number != 0) {

            reverse *= 10; 
            reverse += number % 10;
            number /= 10;
        }

       return reverse;
	}

}
