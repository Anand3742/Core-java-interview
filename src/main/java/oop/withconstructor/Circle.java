package oop.withconstructor;

public class Circle extends Shape {

	public int radius;

	public static final double PI = 3.14;

	public Circle(int radius) {
		this.radius = radius;

	}

	public double area() {
		return PI * radius * radius;

	}

}
