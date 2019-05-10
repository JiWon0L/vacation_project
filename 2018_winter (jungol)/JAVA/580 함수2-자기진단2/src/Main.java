import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		int mouth, day;

		Scanner scan = new Scanner(System.in);
		mouth = scan.nextInt();
		day = scan.nextInt();
		year(mouth, day);
	}

	public static void year(int mouth, int day) {
		if ((mouth < 1) || (mouth > 12) || (day < 1)) {
			System.out.println("BAD!");
		} else if (mouth == 2) {
			if (day <= 29) {
				System.out.println("OK!");
			} else {
				System.out.println("BAD!");
			}
		} else if ((mouth == 4) && (mouth == 6) && (mouth == 9) && (mouth == 11)) {
			if (day <= 30) {
				System.out.println("OK!");
			} else {
				System.out.println("BAD!");
			}
		} else {
			if (day <= 31) {
				System.out.println("OK!");
			} else {
				System.out.println("BAD!");
			}
		}
	}
}
