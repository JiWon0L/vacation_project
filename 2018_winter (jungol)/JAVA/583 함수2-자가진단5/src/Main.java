import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		double n1, n2, n3;

		Scanner scan = new Scanner(System.in);
		n1 = scan.nextDouble();
		n2 = scan.nextDouble();
		n3 = scan.nextDouble();

		num(n1, n2, n3);
	}

	public static void num(double n1, double n2, double n3) {
		double temp;
		if (n1 > n2) {
			temp = n2;
			n2 = n1;
			n1 = temp;
		}
		if (n2 > n3) {
			temp = n3;
			n3 = n2;
			n2 = temp;
		}
		System.out.print((int)Math.ceil(n3) + " ");
		if (n1 > n2) {
			temp = n2;
			n2 = n1;
			n1 = temp;
		}
		System.out.print((int)Math.floor(n1) + " " + (int)Math.round(n2));
	}
}
