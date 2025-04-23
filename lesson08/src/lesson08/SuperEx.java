package lesson08;

public class SuperEx {
	public static void main(String[] args) {
		
//		Child child = new Child();
//		Child.class.newInstance();
	}

}


class Parent /*extends Object */ {	
	int number = 3;
	
	Parent(){	//생성자
		super();		//모든 클래스의 최고 조상은 object
		System.out.println("부모 객체 생성");
	}
}
class Child extends Parent {
	int number = 2;
	
	Child(){	//생성자
		super();		//생성자 첫 줄에 없으면 컴파일러가 자동 생성해줌. 반드시 첫줄에 와야되고, 두 번 올 수 없다★★★★★
		System.out.println("자식 객체 생성");
	}
	void print() {
		int number = 1;
		System.out.println(number);
		System.out.println(this.number);
		System.out.println(super.number);
	}
	
}
