import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		int num;
		int[] array = new int[6];

		Scanner scan = new Scanner(System.in);
		for (int i = 0; i < array.length; i++) {
			num = scan.nextInt();
			array[num - 1]++;
		}

		for (int i = 0; i < 6; i++) {
			System.out.println((i + 1) + " : " + array[i]);
		}
	}
}