package exception;

public class numberFormatException {
	
	public static void main(String[] args) {
		
		String str = "Anand123";
	
		try {
			System.out.println(Integer.parseInt(str));
		}catch (NumberFormatException e) {
			e.printStackTrace();
			System.out.println(e.getMessage());
		}
		
	}

}
