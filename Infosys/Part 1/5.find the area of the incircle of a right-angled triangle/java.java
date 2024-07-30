// Java code to find the area of inscribed
// circle of right angled triangle
import java.lang.*;

class PRIME {

	static double PI = 3.14159265;

	// Function to find the area of
	// inscribed circle
	public static double area_inscribed(double P, double B,
										double H)
	{
		return ((P + B - H) * (P + B - H) * (PI / 4));
	}

	// Driver code
	public static void main(String[] args)
	{
		double P = 3, B = 4, H = 5;
		System.out.println(area_inscribed(P, B, H));
	}
}
