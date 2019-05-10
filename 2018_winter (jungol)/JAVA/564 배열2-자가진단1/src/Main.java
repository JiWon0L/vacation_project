import java.util.Scanner;

public class Main {
	public static void main(String args[]) {
		char spell;
		int[] array = new int[26];

		Scanner scan = new Scanner(System.in);
		while (true) {
			spell = scan.next().charAt(0);
			if (spell < 'A' || spell > 'Z') {
				break;
			}
			array[spell - 'A']++;
		}

		for (int i = 0; i < 26; i++) {
			if (array[i] != 0) {
				System.out.println((char) (i + 65) + " : " + array[i]);
			}
		}
	}
}
