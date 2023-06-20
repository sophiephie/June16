package Activity16June;

public class Question11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] array1 = new String[] { "a", "b", "c", "d" };
		String[] array2 = new String[] { "a", "d", "e", "c" };

		for (int i = 0; i < array1.length; i++) {

			for (int j = 0; j < array1.length; j++)
				if (array1[i] == array2[j]) {
					System.out.println("Common element : " + array1[i]);
				}
		}

	}

}
