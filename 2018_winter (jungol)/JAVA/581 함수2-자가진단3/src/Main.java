import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		int n1, n2;
		double s1, s2;

		Scanner scan = new Scanner(System.in);
		n1 = scan.nextInt();
		n2 = scan.nextInt();
		s1 = scan.nextDouble();
		s2 = scan.nextDouble();

		max(n1, n2);
		min(s1, s2);
	}

	public static void max(int n1, int n2) {
		if (Math.abs(n1) > Math.abs(n2)) {
			System.out.println(n1);
		} else {
			System.out.println(n2);
		}
	}

	public static void min(double s1, double s2) {
		if (Math.abs(s1) < Math.abs(s2)) {
			System.out.printf("%.2f", s1);
		} else {
			System.out.printf("%.2f", s2);
		}
	}
}
