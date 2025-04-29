package practice;

public class Book {
//	Book이라는 클래스를 만들고, 책 제목과 저자 이름을 필드로 가지게 해보자.
//	생성자와 정보를 출력하는 메서드(printInfo)를 작성해보자.
	
	String name ;
	String title;
	
	public Book() {	}
	
public Book(String name, String title) {
		super();
		this.name = name;
		this.title = title;
	}
public static void main(String[] args) {
	
	Book b = new Book();
	b.name = "남궁성";
	b.title = "잡아의 정석";
	System.out.println("저자 : " + b.name + " , 제목 : " + b.title);
	
	}
}

