import java.util.Scanner;

public class Main {

	/* Call by Reference */
	public static void main(String[] args) {
		int a, b;
		int[] array = new int[2];
		
		Scanner scanner = new Scanner(System.in);
		array[0] = scanner.nextInt();
		array[1] = scanner.nextInt();
		calculate(array);
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + " ");
		}
	}

	public static void calculate(int[] array) {
		if (array[0] > array[1]) {
			array[0] = array[0] / 2;
			array[1] = array[1] * 2;
		} else {
			array[0] = array[0] * 2;
			array[1] = array[1] / 2;
		}
	}
	

	/* Call by Value */
//	public static void main(String[] args) {
//		int a, b;
//
//		Scanner scanner = new Scanner(System.in);
//		a = scanner.nextInt();
//		b = scanner.nextInt();
//		calculate(a,b);
//		System.out.println(a + " " + b);
//	}
//
//	public static void calculate(int a, int b) {
//		if (a > b) {
//			a = b / 2;
//			b = b * 2;
//		} else {
//			a = b * 2;
//			b = b / 2;
//		}
//	}
}
