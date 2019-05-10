import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		int n;
		Scanner scan = new Scanner(System.in);
		n = scan.nextInt();

		int result = 65;

		for (int i = n; i >= 1; i--) {
			result = 65 + n - i;
			if (result > 90) {
				result = 65 + ((result - 65) % 26);
			}
			System.out.print((char) result + " ");
			for (int j = 1; j < n; j++) {
				if (j % 2 == 1) {
					result += 2 * i - 1;
				} else {
					result += (2 * n) - (2 * i - 1);
				}
				if (result > 90) {
					result = 65 + ((result - 65) % 26);
				}
				System.out.print((char) result + " ");
			}
			System.out.println();
		}
	}
}

//import java.util.Scanner;
//
//public class Main {
//
//	public static void main(String[] args) {
//		int n;
//		Scanner scan = new Scanner(System.in);
//		n = scan.nextInt();
//
//		int number = 2 * n;
//		int result = 65;
//		for (int i = 1; i <= n; i++) {
//			System.out.print((char)result + " ");
//			int a = 2 * (n - i + 1) - 1;
//			for (int j = n; j > 1 ; j--) {
//				if (j % 2 == 0) {
//					result = result + ((number-a) % 26);
//					if (result > 90) {
//						result = 65 + ((result - 65) % 26);
//					}
//					System.out.print((char)result + " ");
//				} else {
//					result = result + (a % 26);
//					if (result > 90) {
//						result = 65 + ((result - 65) % 26);
//					}
//					System.out.print((char)result + " ");
//				}
//			}
//			System.out.println();
//			result = 65;
//			result = result + i % 26;
//		}
//	}
//}