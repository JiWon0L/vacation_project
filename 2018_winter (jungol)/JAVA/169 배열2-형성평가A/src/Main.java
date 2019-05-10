import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		char spell;
		char[][] array = new char[3][5];

		Scanner scan = new Scanner(System.in);
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {
				spell = scan.next().charAt(0);
				array[i][j] = (char) (spell + 32);
			}
		}

		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {
				System.out.print(array[i][j] + " ");
			}
			System.out.println();
		}
	}
}
