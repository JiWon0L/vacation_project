import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		char spell;
		char[] array = new char[6];
		int prt = 0;
		array[0] = 'J';
		array[1] = 'U';
		array[2] = 'N';
		array[3] = 'G';
		array[4] = 'O';
		array[5] = 'L';

		Scanner scan = new Scanner(System.in);
		spell = scan.next().charAt(0);
		for (int i = 0; i < array.length; i++) {
			if (array[i] == spell) {
				System.out.println(i);
				prt = prt + 1;
			}
		}
		if (prt == 0) {
			System.out.println("none");
		}
	}
}
