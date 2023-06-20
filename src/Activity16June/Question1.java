package Activity16June;

public class Question1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] elements = new int[] { 1, 2, 3, 4, 5 };
		int sum = 0;
		for (int i = 0; i < elements.length; i++) {
			sum += elements[i];
		}
		double average = sum / elements.length;
		System.out.println("Average is : " + average);

	}

}
