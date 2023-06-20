package Activity16June;

public class Question33 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] elements = new int[] { 1, 2, -5, -3, 6, -1 };
		int[] newArray = new int[elements.length];
		int negativeCounter = 0;
		int positiveCounter = elements.length - 1;
		for (int i = 0; i < elements.length; i++) {
			if (elements[i] < 0) {
				newArray[negativeCounter] = elements[i];
				negativeCounter++;
			} else {
				newArray[positiveCounter] = elements[i];
				positiveCounter--;
			}
		}
		
		for (int i = 0; i < newArray.length; i++) {
			System.out.printf("New array index %d : %d %n", i, newArray[i]);
		}
	}

}
