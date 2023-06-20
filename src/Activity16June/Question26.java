package Activity16June;

public class Question26 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] elements = new int[] { 20, 20, 30, 40, 50, 50, 50 };
		int[] newArray = new int[elements.length];
		int newArrayCounter = 0;
		int newArrayLength = 0;
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
			if (newArray[i] != 0) {
				newArrayLength++;
			}
		}
		
		System.out.println(newArrayLength);
	}

}
