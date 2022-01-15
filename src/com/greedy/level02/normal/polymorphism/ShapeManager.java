package com.greedy.level02.normal.polymorphism;

public class ShapeManager {
	
	public void calcShape() {
		
		/* 다형성을 사용하여 사각형 객체와 원 객체를 생성하고 면적과 둘레를 출력 */
		
		/* 다형성을 사용하여 IShape 객체 배열에 가로 34.5, 세로 42.7의 사각형 객체와
		 * 반지름이 15.5인 원 객체를 하나씩 생성 */
		IShape[] iShapes = new IShape[2];
		
		iShapes[0] = new Rectangle(34.5, 42.7);
		iShapes[1] = new Circle(15.5);
		
		/* 반복문을 이용하여 각각의 면적과 둘레 출력 */
		for(int i = 0; i < iShapes.length; i++) {
			
			if(iShapes[i] instanceof Rectangle) {
				System.out.print("Rectangle 면적 : ");
			} else if(iShapes[i] instanceof Circle) {
				System.out.print("Circle 면적 : ");
			}
			System.out.println(iShapes[i].area());
			
			if(iShapes[i] instanceof Rectangle) {
				System.out.print("Rectangle 둘레 : ");
			} else if(iShapes[i] instanceof Circle) {
				System.out.print("Circle 둘레 : ");
			}
			System.out.println(iShapes[i].perimeter());
			
		}
		
		System.out.println();
		
	}
	
	public void calcShapeArray() {
		
		/* 다형성을 사용하여 사각형 객체와 원 객체와 삼각형 객체를 생성하고 면적과 둘레를 출력
		 * 단, Triangle 객체는 빗변 길이도 출력 */
		
		/* 다형성을 사용하여 위의 IShape 객체 배열에 Circle, Rectangle, Triangle 클래스를
		 * 무작위의 데이터를 넣어서 5개 생성함. */
		IShape[] iarr = new IShape[5];
		
		iarr[0] = new Rectangle(3.3, 5.5);
		iarr[1] = new Circle(5.5);
		iarr[2] = new Triangle(4.5, 7.5);
		iarr[3] = new Circle(7.7);
		iarr[4] = new Triangle(4.9, 9.3);
		
		/* for문으로 각 객체의 면적과 둘레를 출력
		 * 단, Triangle 객체의 경우 빗변 길이도 출력 */
		for(int i = 0; i < iarr.length; i++) {
			
			String shapeType = "";
			
			if(iarr[i] instanceof Rectangle) {
				shapeType = "Rectangle";
			} else if(iarr[i] instanceof Circle) {
				shapeType = "Circle";
			} else if(iarr[i] instanceof Triangle) {
				shapeType = "Triangle";
			}
			System.out.print(shapeType + " - 면적 : " + iarr[i].area() + ", 둘레 : " + iarr[i].perimeter());
			
			if(iarr[i] instanceof Triangle) {
				System.out.println(", 빗변 : " + ((Triangle)iarr[i]).hypotenuse());
			} else {
				System.out.println();
			}
			
		}
		
	}

}
