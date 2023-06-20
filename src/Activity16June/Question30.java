package Activity16June;

public class Question30 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int triangleCount = 0;
		int[] array = new int[] { 14, 6, 5, 7, 4 };
		for (int i = 0; i < array.length - 2; i++) {
			for (int j = i + 1; j < array.length - 1; j++) {
				for (int k = j + 1; k < array.length; k++) {
					if ((array[i] + array[j] > array[k]) && (array[j] + array[k] > array[i])
							&& (array[i] + array[k] > array[j])) {
						triangleCount++;
					}
				}
			}
		}

		System.out.println("Number of possible triangles : " + triangleCount);
	}

}
