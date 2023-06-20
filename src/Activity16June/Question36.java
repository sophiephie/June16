package Activity16June;

public class Question36 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] elements = new int[] { 0, 1, 1, 0, 1, 0, 1 };
		int[] newArray = new int[elements.length];
		int oneCounter = elements.length - 1;
		int zeroCounter = 0;
		for (int i = 0; i < elements.length; i++) {
			if (elements[i] == 0) {
				newArray[zeroCounter] = elements[i];
				zeroCounter++;
			} else {
				newArray[oneCounter] = elements[i];
				oneCounter--;
			}
		}
		
		for (int i = 0; i < newArray.length; i++) {
			System.out.printf("New array index %d : %d %n", i, newArray[i]);
		}
	}

}
