package Activity16June;

public class Question21 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] elements = new int[] { 1, 2, 5, 3, 4 };
		int min = 99;
		int max = -1;
		for (int i = 0; i < elements.length; i++) {
			if (min > elements[i]) {
				min = elements[i];
			}
			if (max < elements[i]) {
				max = elements[i];
			}
		}

		System.out.println("Difference : " + (max - min));
	}

}
