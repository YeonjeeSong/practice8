package com.greedy.level01.basic.polymorphism;

public class ShapeManager {

	public void calcShape() {
		
		/* 다형성을 사용하여 사각형 객체와 원 객체를 생성하고 면적과 둘레를 출력 */
		
		/* 다형성을 사용하여 Shape 객체 배열에 가로 34.5, 세로 42.7의 사각형 객체와
		 * 반지름이 15.5인 원 객체를 하나씩 생성 */
		Shape[]	shapes = new Shape[2];
		
		shapes[0] = new Rectangle(34.5, 42.7);
		shapes[1] = new Circle(15.5);
		
		/* 반복문 이용하여 각각의 면적과 둘레 출력 */
		for(int i = 0; i < shapes.length; i++) {
			
			if(shapes[i] instanceof Rectangle) {
				System.out.print("Rectangle 면적 : ");
			} else if(shapes[i] instanceof Circle) {
				System.out.print("Circle 면적 : ");
			}
			System.out.println(shapes[i].area());
				
			if(shapes[i] instanceof Rectangle) {
				System.out.print("Rectangle 둘레 : ");
			} else if(shapes[i] instanceof Circle) {
				System.out.print("Circle 둘레 : ");
			}
			System.out.println(shapes[i].perimeter());
			
		}
		
		/* 향상된 for문 */
		String shapeType = "";
		for(Shape s : shapes) {
			
			shapeType = s instanceof Rectangle ? "Rectangle" : "Circle";
			
			System.out.println(shapeType + " 면적 : " + s.area());
			System.out.println(shapeType + " 둘레 : " + s.perimeter());
		}
		
	}
	
}
