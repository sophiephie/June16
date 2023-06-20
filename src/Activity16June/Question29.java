package Activity16June;

public class Question29 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int target = 12;
		int[] array = new int[] { 1, 2, 4, 5, 6 };
		boolean isEqual = false;
		for (int i = 0; i < array.length - 3; i++) {
			for (int j = i + 1; j < array.length - 2; j++) {
				for (int k = j + 1; k < array.length - 1; k++) {
					for (int l = k + 1; l < array.length; l++) {
						if (array[i] + array[j] + array[k] + array[l] == target) {
							isEqual = true;
						}
					}
				}
			}

		}

		System.out.println("Sum to target: " + isEqual);
	}
}
