package com.greedy.level02.normal.polymorphism;

public class Triangle implements IShape {

	private double base;
	private double height;
	
	
	/* 기본 생성자 */
	public Triangle() {}
	
	/* 매개변수 생성자 */
	public Triangle(double base, double height) {
		this.base = base;
		this.height = height;
	}
	
	/* setter */
	public void setBase(double base) {
		this.base = base;
	}
	
	public void setHeight(double height) {
		this.height = height;
	}
	
	/* getter */
	public double getBase() {
		return base;
	}
	
	public double getHeight() {
		return height;
	}

	/* 추상메소드를 오버라이딩 하여 삼각형의 면적을 계산하여 리턴하는 메소드
	 * 넓이 = (밑변 * 높이)/2 */
	@Override
	public double area() {
		return (base * height)/2;
	}

	/* 추상메소드를 오버라이딩 하여 삼각형의 둘레를 계산하여 리턴하는 메소드
	 * 둘레 = 밑변 + 높이 + 빗변길이 */
	@Override
	public double perimeter() {
		return base + height ;
	}
	
	/* 삼각형의 빗변 길이를 계산하여 리턴하는 기능 작성
	 * 빗변 길이 = Math.sqrt(밑변 * 밑변 + 높이 * 높이) */
	public double hypotenuse() {
		return Math.sqrt(base * base + height * height);
	}
	
}
