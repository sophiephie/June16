package Activity16June;

public class Question32 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] elements = new int[] { 1, 2, -5, -3, 6, -1 };
		int[] newArray = new int[] { -1, 1, 2, 3, 4, 6 };
		for (int i = 0; i < newArray.length; i++) {
			if (newArray[i] == elements[0]) {
				System.out.println("Rotated : " + i + " times");
			}
		}
	}

}
