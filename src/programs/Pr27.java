package programs;

public class Pr27 {
	public static void main(String[] args) {
		String str = "Faiz Khan";
		for (int i = 0; i < str.length(); i++) {
			for (int j = i + 1; j < str.length(); j++) {
				if (str.charAt(i) == str.charAt(j)) {
					System.out.println(str.charAt(i));
				}
			}
		}
	}
}
