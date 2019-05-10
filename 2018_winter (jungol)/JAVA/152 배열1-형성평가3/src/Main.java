import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		int num;
		int[] array = new int[10];
		int oddSum = 0, evenSum = 0;

		Scanner scan = new Scanner(System.in);
		for (int i = 0; i < array.length; i++) {
			num = scan.nextInt();
			array[i] = num;
		}

		for (int i = 0; i < 5; i++) {
			oddSum += array[i * 2];
		}

		for (int i = 0; i < 5; i++) {
			evenSum += array[i * 2 + 1];
		}

		System.out.print("odd : " + oddSum + "\neven : " + evenSum);
	}

}
