import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		int r;

		Scanner scan = new Scanner(System.in);
		r = scan.nextInt();

		circle(r);
	}

	public static void circle(int r) {
		double cir = r * r * 3.14;
		System.out.printf("%.2f", cir);
	}
}
