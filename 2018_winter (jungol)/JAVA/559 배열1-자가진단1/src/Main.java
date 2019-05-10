import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		int c1, c2;
		double[] average = {85.6 , 79.5, 83.1, 80.0, 78.2, 75.0};
		
		Scanner scan = new Scanner(System.in);
		c1 = scan.nextInt();
		c2 = scan.nextInt();
		
		 System.out.printf("%.1f", average[c1 - 1] + average[c2 - 1]);
	}
}
