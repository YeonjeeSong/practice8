package com.greedy.level02.normal.polymorphism;

public interface IShape {

	/* 면적을 계산하여 리턴하는 메소드 */
	// 인터페이스는 추상메소드만 작성 가능 - 묵시적으로 public abstract
	public double area();
	
	/* 둘레를 계산하여 리턴하는 메소드 */
	// 인터페이스는 추상메소드만 작성 가능 - 묵시적으로 public abstract
	public double perimeter();
	
}
