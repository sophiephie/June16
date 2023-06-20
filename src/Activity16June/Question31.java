package Activity16June;

public class Question31 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] elements = new int[] { 1, 2, 3, 4, 6, -1 };
		int[] newArray = new int[elements.length];
		for (int i = 0; i < elements.length; i++) {
			if (i == elements.length - 1) {
				newArray[0] = elements[i];
				break;
			}
			newArray[i + 1] = elements[i];
		}

		for (int i = 0; i < newArray.length; i++) {
			System.out.printf("New array index %d : %d %n", i, newArray[i]);
		}
	}

}
