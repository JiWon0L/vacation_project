import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		int num;
		int[] array = new int[5];

		Scanner scan = new Scanner(System.in);
		for (int i = 0; i < 5; i++) {
			num = scan.nextInt();
			array[i] = num;
		}
		System.out.print(array[0] + array[2] + array[4]);
	}
}
