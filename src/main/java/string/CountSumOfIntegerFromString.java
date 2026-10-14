package string;

public class CountSumOfIntegerFromString {

	public static void main(String[] args) {
		
		String n = "Anand123451";
		
		int sum = 0;
		
		for(int i=0;i<n.length();i++) {
			if(Character.isDigit(n.charAt(i))) {
				sum =sum + Character.getNumericValue(n.charAt(i));
			}
		}
		System.out.println(sum);
	}
}
