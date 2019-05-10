import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		char spell;
		char[] array = new char[10];

		Scanner scan = new Scanner(System.in);
		for (int i = 0; i < 10; i++) {
			spell = scan.next().charAt(0);
			array[i] = spell;
		}
		for (int i = 10; i > 0; i--) {
			System.out.print(array[i - 1] + " ");
		}
	}
}
