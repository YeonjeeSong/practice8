package com.greedy.level02.normal.polymorphism;

public class Circle implements IShape {

	public static double PI = Math.PI;	 	// Math.PI로 초기화
	private double radius;					// 반지름
	
	/* 기본 생성자 */
	public Circle() {}
	
	/* 매개변수 생성자 */
	public Circle(double radius) {
		this.radius = radius;
	}
	
	/* setter */
	public void setRadius(double radius) {
		this.radius = radius;
	}
	
	/* getter */
	public double getRadius() {
		return radius;
	}
	
	/* 추상메소드를 오버라이딩 하여 원의 면적을 계산하여 리턴하는 메소드 */
	@Override
	public double area() {
		return PI * radius * radius;
	}

	/* 추상메소드를 오버라이딩하여 원의 둘레를 계산하여 리턴하는 메소드 */
	@Override
	public double perimeter() {
		return 2 * PI * radius;
	}

}
