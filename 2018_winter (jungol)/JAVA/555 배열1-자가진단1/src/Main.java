import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		String num;
		String[] array = new String[10];

		Scanner scan = new Scanner(System.in);
		for (int i = 0; i < 10; i++) {
			num = scan.next();
			array[i] = num;
		}
		for (int i = 0; i < 10; i++) {
			System.out.print(array[i]);
		}
	}
}
