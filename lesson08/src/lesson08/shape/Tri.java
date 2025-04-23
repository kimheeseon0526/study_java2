package lesson08.shape;

public abstract class Tri extends Shape{
	int x, y, z,a;
	
	public Tri(){}
	public Tri(int x, int y, int z) {
		this.x =x;
		this.y =y;
		this.z =z;
	}
	
	public double circum() {	//삼각형 둘레
		return (x + y + z);
	}
	
	public double area() {	//삼각형 넓이
		return (x + a)/2d;
	}
}
	
