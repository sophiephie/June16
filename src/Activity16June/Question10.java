package Activity16June;

public class Question10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] elements = new String[] { "a", "b", "c", "a" };
		boolean foundDuplicate = false;
		for (int i = 0; i < elements.length; i++) {

			for (int j = 0; j < elements.length; j++)
				if (i != j && elements[i] == elements[j]) {
					foundDuplicate = true;
					break;
				}
		}

		System.out.println("Found duplicate : " + foundDuplicate);

	}

}
