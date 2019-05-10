
public class Main {

	public static void main(String[] args) {
		int[][] array = { { 5, 8, 10, 6, 4 }, 
						{ 11, 20, 1, 13, 2 }, 
						{ 7, 9, 14, 22, 3 } };
		
		for(int i = 0; i < array.length; i++) {
			for(int j = 0; j < array[i].length; j++) {
				System.out.print(String.format("%2d", array[i][j]) + "   ");
			}
			System.out.println();
		}
	}
}
