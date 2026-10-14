package javabasics;

public class RandomNumber {
	
	public static void main(String[] args) {
		
		for(int i = 0; i<=4; i++) {
			int a = (int) (Math.random() * 10);
			System.out.println(a+" ");
		}
	}

}
