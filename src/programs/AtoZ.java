package programs;

public class AtoZ {

	public static void main(String[] args) {

		for (char i = 'a'; i <= 'z'; i++) {
			if (i == 'a' || i == 'e' || i == 'i' || i == 'o' || i == 'u') {
				System.out.print(i + " ");
			}
		}
	}
}
