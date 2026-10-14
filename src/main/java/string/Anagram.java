package string;
import java.util.Arrays;

public class Anagram {

	public static void main(String[] args) {

		String n1 = "Anand";
		String n2 = "dnanA";

		char[] c1 = n1.toCharArray();
		char[] c2 = n2.toCharArray();

		Arrays.sort(c1);
		Arrays.sort(c2);

		if (Arrays.equals(c1, c2)) {
			System.out.println("This is Aanagram");
		} else {
			System.out.println("This is Not Anagram");

		}
	}

}