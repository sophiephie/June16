package Activity16June;

public class Question6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] elements = new int[] { 1, 2, 3, 4, 5 };
		int[] newArray = new int[elements.length + 1];
		int newArrayCounter = 0;
		for (int i = 0; i < elements.length; i++) {

			// insert at index 2
			if (i == 2) {
				newArray[newArrayCounter] = 11;
				newArrayCounter++;
			}
			newArray[newArrayCounter] = elements[i];
			newArrayCounter++;
		}

		for (int i = 0; i < newArray.length; i++) {
			System.out.printf("New array index %d : %d %n", i, newArray[i]);
		}

	}

}
