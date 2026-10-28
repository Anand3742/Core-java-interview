package oop.MethodOverriding;

public class Rectangle extends Shape {

	public int lenght;
	public int width;

	public int getLength() {
		return lenght;

	}

	public void setLength(int lenght) {
		this.lenght = lenght;
	}
	
	public int getWidth() {
		return width;
	}
	
	public void setWidth(int width) {
		this.width = width;
	}
	@Override
	public double area() {
		System.out.println("Rectengle area method");
		return lenght * width;
		
	}
}
