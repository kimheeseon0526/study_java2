package lesson08.shape;

public class Main {
	public static void main(String[] args) {
		Circle circle = new Circle(3);	//객체 생성
//		System.out.println(circle.area());	//넓이
//		System.out.println(circle.circum());	//둘레
//		
		Rect rect = new Rect(4 , 5);
//		System.out.println(rect.area());
//		System.out.println(rect.circum());
//		
//		Tri tri = new Tri(3,4,5);		//삼각형 인스턴스 생성
//		System.out.println(tri.area());
//		System.out.println(tri.circum());
		
		Cylinder cylinder = new Cylinder(new Circle(4), 5);
		
		Shape[] shapes = {circle, rect, cylinder};	//[0],[1],[2]
		
		for(int i = 0; i <shapes.length; i++) {
			System.out.println("=========" + shapes.getClass().getSimpleName() + "==========");
			System.out.println(shapes[i].area());
			if(shapes[i] instanceof Shape2D){
		System.out.println("둘레 " + ((shape2D)shapes[i].circum());
	}
	else if(shapes[i] instanceof Shape3D) {
		System.out.println("부피 :" + ((shape3D)shapes[i].volume()));
		}
		System.out.println("===================원,Rect , 삼각형의 둘레 및 넓이 구하기 끝=================");

		}
	
	}
}
