package exception;

public class ExceptionHierarchy {
	
	public static void main(String[] args) {
		
		String name ="Anand";
		
		try {
			System.out.println(name.charAt(4));
			
		} catch (StringIndexOutOfBoundsException e) {
			
			System.out.println("Index out of bound");
			
		}catch (Exception e) {
			
			System.out.println("Exception...............");
			
		}finally {
			
			System.out.println("I am Always execute ");
		}
	}

}