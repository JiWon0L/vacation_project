import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		int s;
		int e;
		Scanner scan = new Scanner(System.in);
		s = scan.nextInt();
		e = scan.nextInt();

		if ((s >= 2 && s <= 9) && (e >= 2 && e <= 9)) {
			if (s < e) {
				for (int j = s; j <= e; j++) {
					for (int i = 1; i < 10; i++) {
						System.out.printf(j + " * " + i + " = " + "%2d", j * i);
						System.out.print("   ");
						if (i % 3 == 0) {
							System.out.println();
						}
					}
					System.out.println();
				}
			} else if (s == e) {
				for (int i = 1; i < 10; i++) {
					System.out.printf(s + " * " + i + " = " + "%2d", s * i);
					System.out.print("   ");
					if (i % 3 == 0) {
						System.out.println();
					}
				}
			} else if (s > e) {
				for (int j = s; j >= e; j--) {
					for (int i = 1; i < 10; i++) {
						System.out.printf(j + " * " + i + " = " + "%2d", j * i);
						System.out.print("   ");
						if (i % 3 == 0) {
							System.out.println();
						}
					}
					System.out.println();
				}
			}
		}
	}
}
