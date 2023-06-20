package Activity16June;

public class Question35 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] elements = new int[] { 6, 1, 4, 2, 5, 3 };
		int[] newArray = new int[elements.length];

		for (int i = 0; i < elements.length; i++) {
			for (int j = 0; j < elements.length; j++) {
				if (i != j && elements[i] < elements[j]) {
					elements[i] = elements[j];
				}
			}
		}

		for (int i = 0; i < newArray.length; i++) {
			System.out.printf("New array index %d : %d %n", i, newArray[i]);
		}
	}

}
