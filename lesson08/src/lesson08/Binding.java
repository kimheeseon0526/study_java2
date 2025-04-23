package lesson08;

public class Binding {
	public static void main(String[] args) {
		A obj = new B();
		System.out.println(obj);
		
		System.out.println(obj.si);
		System.out.println(obj.i);
		obj.sm();
		obj.m();
		
		////////////////////////////////////////////////////////////
		
		A a = new A();
		B b = new B();
		
		A c = b;		//애초에 선언을 조상타입(A)으로 해서 b 가능
		System.out.println(c);
//		B d = (B)a;	//a 인스턴스의 타입은 A . 조상타입을 강제로 자식타입에 넣을 수 없다
//		
//		B e = c;	//c 인스턴스는 b이나 선은은 이미 A로 했기 때문에 타입 미스매치
		
		B e = (B)c ;
		System.out.println(e);
		
		
	}
}
class A{
	static int si = 1;
	int i = 2;
	static void sm() {System.out.println("A.sm()");}
	void m() {System.out.println("A.m()");}
}
class B extends A{
	static int si = 3;
	int i = 4;
	static void sm() {System.out.println("B.sm()");}
	void m() {System.out.println("B.m()");}
	
}