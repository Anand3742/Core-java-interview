package oop.withconstructor;

public class Rectangle extends Shape {
	
	public int 	lenght;
	public int width;
	
	public Rectangle(int lenght, int width) {
		this.lenght = lenght;
		this.width = width;
		
	}
	@Override
	public double area() {
		return lenght * width;
	}
}
