package oop.MethodOverloading;

public class Person {

	public void login(String loginId) {
		System.err.println(loginId);

	}

	public void login(String loginId, String password) {
		System.out.println(loginId + password);
	}

	public void login(String loginId, String password, String name) {
		System.err.println(loginId + password + name);
	}
}
