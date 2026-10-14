package string;

public class StringBufferMethod {

	public static void main(String[] args) {

		StringBuffer sb = new StringBuffer("Anand");

		System.out.println(sb.length());
		System.out.println(sb.capacity());
		System.out.println(sb.deleteCharAt(4));
		System.out.println(sb.delete(0, 2));
		System.out.println(sb.toString());
		System.out.println(sb.append("choudhary"));
		System.out.println(sb.insert(0, "A"));
		System.out.println(sb.insert(1, "n"));
		System.out.println(sb.charAt(4));
		System.out.println(sb.replace(0, 4, "a"));
		System.out.println(sb.reverse());

	}

}
