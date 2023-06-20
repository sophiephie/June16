package Activity16June;

public class Question15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] elements = new int[] { 0, 1, 2, 5, 3, 4, 6, -6 };
		int min = 99;
		int secondMin = 99;
		for (int i = 0; i < elements.length; i++) {
			if (min > elements[i]) {
				secondMin = min;
				min = elements[i];
			} else {
				if (secondMin > elements[i]) {
					secondMin = elements[i];
				}
			}
		}

		System.out.println("Second Min : " + secondMin);
	}

}
