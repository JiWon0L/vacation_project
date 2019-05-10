import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		int num1, num2;
		int[] array = new int[10];
		int sum;

		Scanner scan = new Scanner(System.in);
		num1 = scan.nextInt();
		array[0] = num1;
		num2 = scan.nextInt();
		array[1] = num2;

		for (int i = 2; i < array.length; i++) {
			sum = (num1 + num2) % 10;
			array[i] = sum;
			num1 = array[i - 1];
			num2 = array[i];
		}

		for (int i = 0; i < 10; i++) {
			System.out.print(array[i] + " ");
		}
	}

}
