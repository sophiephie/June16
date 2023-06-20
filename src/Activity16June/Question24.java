package Activity16June;

public class Question24 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] elements = new int[] { 10, 2, 3, 10, 6, 10, 10 };
		int sum = 0;
		for (int i = 0; i < elements.length; i++) {
			if (elements[i] == 10) {
				sum += elements[i];
			}
		}
		
		if (sum == 30) {
			System.out.println("Sum of 10's is 30");
		} else {
			System.out.println("Sum of 10's is not 30");
		}

	}

}
