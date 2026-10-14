package string;

public class CountOccuranceOfString {
	public static void main(String[] args) {

		String n = "anand choudhary";

		for (char ch = 'a'; ch <= 'z'; ch++) {
			int count = 0;
			for (int i = 0; i < n.length(); i++) {

				if (n.charAt(i) == ch) {
					count++;
				}
			}

			if (count > 0) {
				System.out.println(ch + " " + count);
			}

		}
	}

}
