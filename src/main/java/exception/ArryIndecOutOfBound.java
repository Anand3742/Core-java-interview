package exception;

public class ArryIndecOutOfBound {

	public static void main(String[] args) {

		int[] i = { 1, 2, 3, 4, 5 };

		try {
			System.out.println(i[3]);

		} catch (ArrayIndexOutOfBoundsException e) {
			
			e.printStackTrace();
			System.out.println("index out of bound");

		}
	}
}
