package Activity16June;

public class Question28 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int target = 6;
		int[] array = new int[] { 1, 2, 4, 5, 6 };
		boolean isEqual = false;
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array.length; j++) {
				if (i != j && (array[i] + array[j] == target)) {
					isEqual = true;
				}
			}
		}

		System.out.println("Sum to target: " + isEqual);

	}

}
