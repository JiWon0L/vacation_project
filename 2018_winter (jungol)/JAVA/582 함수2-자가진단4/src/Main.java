import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		int c;

		Scanner scan = new Scanner(System.in);
		c = scan.nextInt();
		circle(c);
	}

	public static void circle(int c) {
		double r = Math.sqrt(c / 3.14);
		System.out.printf("%.2f", r);
	}
}
