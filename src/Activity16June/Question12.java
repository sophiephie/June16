package Activity16June;

public class Question12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] array1 = new int[] { 1, 2, 3, 4, 5 };
		int[] array2 = new int[] { 1, 3, 5, 6, 7 };

		for (int i = 0; i < array1.length; i++) {

			for (int j = 0; j < array1.length; j++)
				if (array1[i] == array2[j]) {
					System.out.println("Common element : " + array1[i]);
				}
		}
	}

}
