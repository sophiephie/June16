package Activity16June;

public class Question37 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] elements = new int[] { 0, 1, 2, 3, 4, 5, 6 };
		int[] newArray = new int[elements.length];
		int oddCounter = elements.length - 1;
		int evenCounter = 0;
		for (int i = 0; i < elements.length; i++) {
			if (elements[i] % 2 == 0) {
				newArray[evenCounter] = elements[i];
				evenCounter++;
			} else {
				newArray[oddCounter] = elements[i];
				oddCounter--;
			}
		}
		
		for (int i = 0; i < newArray.length; i++) {
			System.out.printf("New array index %d : %d %n", i, newArray[i]);
		}
	}

}
