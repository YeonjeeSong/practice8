package com.greedy.level01.basic.polymorphism;

public class Application {

	public static void main(String[] args) {
		
		/* ShapeManager 객체 생성 후 calcShape() 메소드 호출하여 실행 */
		ShapeManager shapeManager = new ShapeManager();
		
		shapeManager.calcShape();
		
		//new ShapeManager().calcShape();

	}

}
