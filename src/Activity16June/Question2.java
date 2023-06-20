package Activity16June;

public class Question2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] elements = new int[] { 1, 2, 3, 4, 5 };
		int value = 5;
		boolean found = false;
		for (int i = 0; i < elements.length; i++) {
			if (elements[i] == value) {
				found = true;
			}
		}
		System.out.println("Found element : " + found);

	}

}
