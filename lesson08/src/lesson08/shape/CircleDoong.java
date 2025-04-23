package lesson08.shape;

public class CircleDoong extends Circle {
	int h;
	
	
	CircleDoong(int h){
		this.h = h;
	}
	
	CircleDoong(int r, int h){
		this.r = r;
		this.h = h;
		
	}
	
	public double area2() {		//겉넓이
		return (area() * .2d) + (circum() * h);
	}
	
	public double bupi() {		//부피
		return area() * h;
	}
	

	
	//원기둥 겉넓이, 부피
	//겉넓이 : 2πr2+2πrh
	//부피 : πr2 * h
}
