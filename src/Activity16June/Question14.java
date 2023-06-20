package Activity16June;

public class Question14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] elements = new int[] { 1, 2, 5, 3, 4, 6 };
		int max = -1;
		int secondMax = -1;
		for (int i = 0; i < elements.length; i++) {
			if (max < elements[i]) {
				secondMax = max;
				max = elements[i];
			} else {
				if (secondMax < elements[i]) {
					secondMax = elements[i];
				}
			}
		}

		System.out.println("Second Max : " + secondMax);
	}

}
