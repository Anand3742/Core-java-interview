package exception;

public class TestLoginException {

	public static void main(String[] args) {

		String s = "Anand";

		try {
			if (s.equals("admin")) {
				System.out.println("This is valid user");

			} else {
				throw new LoginException();

			}

		} catch (LoginException e) {

			System.out.println(e.getMessage());
			e.printStackTrace();
		}
	}

}
