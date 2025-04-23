package lesson08.shape;

public abstract class Circle extends Shape implements Shape2D{
	int r;	//반지름
	int h;	//높이
	public Circle(){}	//기본 생성자
	public Circle(int r) {	//필드 가지는 생성자
		this.r = r;
	}
	
	public double circum() {	//둘레
		return 2 * r * Math.PI;
	}
	public double area() {		//넓이
		return r * r * Math.PI;
	}
	public String toString() {
		return super.toString() + " \n 둘레 : " + circum();
	}
	
	
}
