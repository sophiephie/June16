package Activity16June;

public class Question13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] elements = new int[] { 1, 2, 3, 4, 5, 2 };
		int[] newArray = new int[elements.length];
		int newArrayCounter = 0;
		for (int i = 0; i < newArray.length; i++) {
			boolean noDuplicate = true;
			for (int j = 0; j < newArray.length; j++) {
				if (newArray[j] == elements[i]) {
					noDuplicate = false;
				}
			}
			if (noDuplicate) {
				newArray[newArrayCounter] = elements[i];
				newArrayCounter++;
			}
		}

		for (int i = 0; i < newArray.length; i++) {
			System.out.printf("New array index %d : %d %n", i, newArray[i]);
		}
	}

}
