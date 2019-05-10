import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		int num = 0;
		int[] array = new int[100];

		Scanner scan = new Scanner(System.in);
		for (int i = 0; i < 100; i++) {
			num = scan.nextInt();
			array[i] = num;
			if(num == 0) {
				num = i;
				break;
			}
		}

		for (int i = num; i > 0; i--) {
			System.out.print(array[i - 1] + " ");
		}
	}
}