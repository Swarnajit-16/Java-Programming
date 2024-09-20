package Max;

public class maximumFound {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int number[] = new int[] { 3, 5, 2, 9, 7 };
		int max = number[0];
		for (int i = 1; i < number.length; i++) {
			if (number[i] > max) {
				max = number[i];
			}

		}

		System.out.println(" num is: " + max);

	}

}
