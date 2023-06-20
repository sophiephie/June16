package Activity16June;

public class Question16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int matrix1[][] = { { 1, 2, 3 }, { 2, 3, 4 }, { 4, 5, 6 } };
		int matrix2[][] = { { 5, 6, 7 }, { 6, 7, 8 }, { 7, 8, 9 } };

		int newMatrix[][] = new int[matrix1.length][matrix2.length];

		for (int i = 0; i < matrix1.length; i++) {
			for (int j = 0; j < matrix2.length; j++) {
				newMatrix[i][j] = matrix1[i][j] + matrix2[i][j]; // use - for subtraction
				System.out.print(newMatrix[i][j] + " ");
			}
			System.out.println();// new line
		}
	}

}
