package Activity16June;

public class Question17 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] array1 = new String[] { "a", "b", "c" };
		String[] array2 = new String[] { "a", "b", "c" };
		boolean isEqual = true;
		for (int i = 0; i < array1.length; i++) {

			if (array1[i] != array2[i]) {
				isEqual = false;
				break;
			}

		}
		System.out.println("2 arrays are equal : " + isEqual);
	}

}
