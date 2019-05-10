import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		int num;
		int[] array = new int[11];

		Scanner scan = new Scanner(System.in);
		for (int i = 0; i < 100; i++) {
			num = scan.nextInt();
			if (num == 0) {
				break;
			}
			array[num / 10]++;
		}

		for (int i = 10; i >= 0; i--) {
			if (array[i] != 0) {
				System.out.println((i * 10) + " : " + array[i] + " person");
			}
		}
	}
}
