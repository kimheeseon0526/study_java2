package lesson08_2;

public class AbsMain {
	public static void main(String[] args) {
		
	}

}
abstract class Parent {
	abstract void m();
}
abstract class Child extends Parent{
	void m() {
		
	}
}

class GrandChild extends Child{				//?
	
}
class GrandGrandChild extends GrandChild{
	
}
