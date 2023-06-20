package Activity16June;

public class Question3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] elements = new int[] { 1, 2, 3, 4, 5 };
		int value = 3;
		int foundIndex = -1;
		for (int i = 0; i < elements.length; i++) {
			if (elements[i] == value) {
				foundIndex = i;
			}
		}
		System.out.println("Found element : " + foundIndex);
	}

}
