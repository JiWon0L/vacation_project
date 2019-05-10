import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		scanner();
	}

	public static void scanner() {
		int n1, n2;
		String s1;

		Scanner scan = new Scanner(System.in);
		n1 = scan.nextInt();
		s1 = scan.next();
		n2 = scan.nextInt();

		calculate(n1, s1, n2);
	}

	public static void calculate(int n1, String s1, int n2) {
		if (s1.equals("+")) {
			System.out.println(n1 + " " + s1 + " " + n2 + " = " + (n1 + n2));
		} else if (s1.equals("-")) {
			System.out.println(n1 + " " + s1 + " " + n2 + " = " + (n1 - n2));
		} else if (s1.equals("*")) {
			System.out.println(n1 + " " + s1 + " " + n2 + " = " + (n1 * n2));
		} else if (s1.equals("/")) {
			System.out.println(n1 + " " + s1 + " " + n2 + " = " + (n1 / n2));
		} else {
			System.out.println(n1 + " " + s1 + " " + n2 + " = 0");
		}
	}
}
