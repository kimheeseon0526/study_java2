package lesson09_03;



public class InnerMain {
	public static void main(String[] args) {
		Outer outer = new Outer();
		Outer.Inner i;
		Outer.SInner si;
		i = outer.new Inner();
		si = new Outer.SInner();
	}
	
}

class Outer {
	class Inner{
		
	}
	static class SInner{
		
	}
	void m() {
		class Local{
			
		}
	}
}
