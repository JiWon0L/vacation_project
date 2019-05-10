import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		String spell;
		String[] array = new String[10];

		Scanner scan = new Scanner(System.in);

		for (int i = 0; i < 10; i++) {
			spell = scan.next();
			array[i] = spell;
		}
		System.out.print(array[0] + " " + array[3] + " " + array[6]);
	}
}
