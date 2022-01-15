package com.greedy.level02.normal.polymorphism;

public class Rectangle implements IShape {

	private double width;		// 가로
	private double height;		// 세로
	
	/* 기본 생성자 */
	public Rectangle() {}
	
	/* 매개변수 생성자 */
	public Rectangle(double width, double height) {
		this.width = width;
		this.height = height;
	}
	
	/* setter */
	public void setWidth(double width) {
		this.width = width;
	}
	
	public void setHeight(double height) {
		this.height = height;
	}
	
	/* getter */
	public double getWidth() {
		return width;
	}
	
	public double getHeight() {
		return height;
	}
	
	/* 추상메소드를 오버라이딩 하여 사각형의 면적을 계산하여 리턴하는 메소드 */
	@Override
	public double area() {
		return width * height;
	}

	/* 추상메소드를 오버라이딩하여 사각형의 둘레를 계산하여 리턴하는 메소드 */
	@Override
	public double perimeter() {
		return (width + height) * 2;
	}
	
}
