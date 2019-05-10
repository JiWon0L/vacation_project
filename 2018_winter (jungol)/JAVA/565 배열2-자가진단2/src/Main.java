import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		int num;
		int[] array = new int[10];

		Scanner scan = new Scanner(System.in);
		while (true) {
			num = scan.nextInt();
			if (num == 0) {
				break;
			}
			array[num / 10]++;
		}
		for (int i = 0; i < array.length; i++) {
			if (array[i] != 0) {
				System.out.println(i + " : " + array[i]);
			}
		}
	}
}
