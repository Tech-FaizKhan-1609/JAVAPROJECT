package programs;

public class ReverseSentence {
	public static void main(String[] args) {
		String str = "i am faiz khan";
		String[] s = str.split(" ");
		for (int i = s.length - 1; i >= 0; i--) {
			System.out.print(" " + s[i]);
		}
	}
}