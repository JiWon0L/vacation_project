
public class Main {

	public static void main(String[] args) {
		int[][] array = new int[5][7];
		array[0][1] = 1;
		array[0][3] = 1;
		array[0][5] = 1;

		for (int i = 1; i < array.length; i++) {
			for (int j = 1; j < array[i].length-1; j++) {
				if(array[i - 1][j - 1] != 0 || array[i - 1][j + 1] != 0) {
					array[i][j] = array[i - 1][j - 1] + array[i - 1][j + 1];
					
				}
			}
		}

		for (int i = 0; i < array.length; i++) {
			for (int j = 1; j < array[i].length-1; j++) {
				System.out.print(array[i][j] + " ");
			}
			System.out.println();
		}
	}
}
