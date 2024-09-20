package PracticeSet;

public class forEach {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// String[] names = new String[] { "swarna", "sayak", "satya", "suvas"
		// };
		// for (String x : names) {
		// System.out.println(x);
		//
		String s1 = "Swarnajit";
		String s2 = "swarnajit";
		if (s1.equalsIgnoreCase(s2)) {
			// Only equals method dia korle duto variable er obj check korbe .
			// same hole true and other hole false.
			// But equals Method case sensitive. Tai ignore Method use
			// KeyboardResizeToggleHandler hoe
			System.out.println("True");
		} else {
			System.out.println("false");

		}
	}

}
