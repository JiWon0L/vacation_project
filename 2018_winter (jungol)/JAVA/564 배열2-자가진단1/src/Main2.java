import java.util.Scanner;

public class Main2 {

	public static void main(String[] args) {
		char num = 'A';
		int[] array = new int[26];
		
		Scanner scan = new Scanner(System.in);
		while(true) {
			num = scan.next().charAt(0);
			if('A' > num || 'Z' < num) {
				break;
			}
			array[num - 'A']++;
		}
		for(int i = 0 ; i < 26 ; i ++) {
			if(array[i] != 0) {
				System.out.println((char)(65+i) + " : " + array[i]);
			}
		}
	}

}