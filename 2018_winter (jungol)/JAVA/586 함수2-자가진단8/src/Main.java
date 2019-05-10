import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		int n1, n2;
		Scanner scan = new Scanner(System.in);
		n1 = scan.nextInt();
		n2 = scan.nextInt();
		calculate(n1, n2);
	}

	public static void calculate(int n1, int n2) {
		System.out.println("(" + n1 + " - " + n2 + ") ^ 2 = " + (int) Math.pow(n1 - n2, 2));
		System.out.println("(" + n1 + " + " + n2 + ") ^ 3 = " + (int) Math.pow(n1 + n2, 3));
	}
}
