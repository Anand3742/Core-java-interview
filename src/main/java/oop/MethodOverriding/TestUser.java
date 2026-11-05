package oop.MethodOverriding;

public class TestUser {
	public static void main(String[] args) {

		BaseCtl b = new BaseCtl();
		b.add();

		UserCtl u = new UserCtl();
		u.add();

		BaseCtl b1 = new UserCtl();
		b1.add();
	}
}
