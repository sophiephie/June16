package Activity16June;

public class Question38 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] elements = new int[] { 6, 1, 4, 3, 6, 5, 3 };
		int[] newArray = new int[elements.length];

		for (int i = 0; i < elements.length; i++) {

			int number = elements[i];
			if (i == elements.length - 1) {
				newArray[i] = -1;
				break;
			}

			for (int j = i; j < elements.length; j++) {
				if (number < elements[j]) {
					number = elements[j];
				}
			}
			newArray[i] = number;

		}

		for (int i = 0; i < newArray.length; i++) {
			System.out.printf("New array index %d : %d %n", i, newArray[i]);
		}
	}

}
