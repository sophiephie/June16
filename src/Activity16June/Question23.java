package Activity16June;

public class Question23 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] elements = new int[] { 1, 2, 3, 4, 6, -1 };
		boolean contains = false;
		for (int i = 0; i < elements.length; i++) {
			if (elements[i] == 0 || elements[i] == -1) {
				contains = true;
				break;
			}
		}

		System.out.println("Contains 0 or -1 : " + contains);
	}

}
