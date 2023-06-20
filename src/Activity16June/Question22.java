package Activity16June;

public class Question22 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] elements = new int[] { 1, 2, 5, 3, 11 };
		int min = 99;
		int max = -1;
		int sum = 0;
		for (int i = 0; i < elements.length; i++) {
			if (min > elements[i]) {
				min = elements[i];
			}
			if (max < elements[i]) {
				max = elements[i];
			}
		}
		
		for (int i = 0; i < elements.length; i++) {
			sum += elements[i];
		}
		
		

		System.out.println("Average : " + ((sum - min - max) / (elements.length - 2)));
	}

}
