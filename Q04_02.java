import java.util.Scanner;
public class Q04_02 {

	public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
	
	double earthradius;
	earthradius = 6371.01;
    
	System.out.print("Enter point 1 (latitude and longitude) in degrees: ");
	double x1;
	x1 = input.nextDouble();
	double y1;
	y1 = input.nextDouble();
	
	System.out.print("Enter point 2 (latitude and longitude) in degrees: ");
	double x2;
	x2 = input.nextDouble();
	double y2;
	y2 = input.nextDouble();
	
	double distance;
	distance = earthradius * Math.acos(Math.sin(Math.toRadians(x1)) * Math.sin(Math.toRadians(x2)) +
								  	   Math.cos(Math.toRadians(x1)) * Math.cos(Math.toRadians(x2)) *
								       Math.cos(Math.toRadians(y1 - y2)));
	
	System.out.println("The distance between the two points is " + distance + " km");
	
	}

}
