package lesson08.shape;

public class TriDoong extends Tri{
	int x, y, z;
	int h;
	
	TriDoong(int h){
		this.h = h;
	}
	public TriDoong(int x ,int a, int h) {
		this.x = x;
		this.a = a;
		this.h = h;
	}
	TriDoong(int x, int y, int z, int a , int h){
		this.x = x;
		this.y = y;
		this.z = z;
		this.a = a;
		this.h = h;
	}
	public double circum() {	//삼각형 둘레
		return (x + y + z);
	}
	
	public double area() {	//삼각형 넓이
		return (x + a)/2d;
	}
	
	public double area2() {
		return (area() * 2) + (circum() * h) ; 
	}
	
	public double bupi() {
		return area() * h; 
	}
	
	
	//겉넓이
	//area * 2 + 둘레 * h

}
