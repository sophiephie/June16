package Activity16June;

public class Question25 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] elements = new int[] { 65, 2, 3, 10, 6, 7, 10 };
		boolean contains65 = false;
		boolean contains77 = false;
		for (int i = 0; i < elements.length; i++) {
			if (elements[i] == 65) {
				contains65 = true;
			}
			if (elements[i] == 77) {
				contains77 = true;
			}
			
		}
		
		if (contains65 && contains77) {
			System.out.println("Contains both 65 and 77");
		} else {
			System.out.println("Does not contain both 65 and 77");
		}
	}

}
