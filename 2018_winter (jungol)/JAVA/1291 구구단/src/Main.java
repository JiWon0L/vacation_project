import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		int s;
		int e;
		Scanner scan = new Scanner(System.in);
		while(true) {			
			s = scan.nextInt();
			e = scan.nextInt();
		
			if((s >= 2 && s <= 9) && (e >= 2 && e <= 9)) {
				if(s < e) {
					for(int i = 1 ; i < 10 ; i++) {
						for(int j = s ; j <= e ; j++) {
							System.out.printf(j + " * " + i + " = " + "%2d",j*i);
							System.out.print("   ");
						}
						System.out.println();
					}
				}
				else if(s == e) {
					for(int i = 1 ; i < 10 ; i++) {
						System.out.printf(s + " * " + i + " = " + "%2d",s*i);
						System.out.println();
					}
				}
				else if(s > e) {
					for(int i = 1 ; i < 10 ; i++) {
						for(int j = s ; j >= e ; j--) {
							System.out.printf(j + " * " + i + " = " + "%2d",j*i);
							System.out.print("   ");
						}
						System.out.println();
					}
				}
				break;
			}
			else
				System.out.println("INPUT ERROR!");
		}
	}
}
