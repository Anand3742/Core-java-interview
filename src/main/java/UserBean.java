import java.util.Date;

public class UserBean {

	public static final int AVERAGE_AGE = 18;

	public String firstName;
	public String lastName;
	public Date date;

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;

	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;

	}
	
	public Date getDate() {
		return date;
		
	}
	public void setDate(Date date) {
		this.date = date;
	}

	public int AverageAge() {
		return AVERAGE_AGE;
	}


}
