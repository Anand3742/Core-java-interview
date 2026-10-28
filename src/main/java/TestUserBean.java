import java.util.Date;

public class TestUserBean {
	
	public static void main(String[] args) {
		
				UserBean u	= new UserBean();
				
				u.setFirstName("anand");
				u.setLastName("choudhary");
				u.setDate(new Date());
				
				
				System.out.println("First name" + u.getFirstName());
				System.out.println("Last Name " + u.getLastName());
				System.out.println("date " + u.getDate());
				System.out.println("Averrage age " + u.AverageAge());
	}

}
