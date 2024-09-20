package Min;

public class miniimumFound {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int number[] = new int[] { 3, 5, 2, 9, 7 };
		int min = number[0];
		for (int i = 1; i < number.length; i++) {
			if (number[i] < min) {
				min = number[i];
			}

		}

		System.out.println(" num is: " + min);

	}

}
