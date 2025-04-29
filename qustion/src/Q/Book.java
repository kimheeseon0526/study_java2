package qustion;

public class Book {
	public static void main(String[] args) {
		
//	Book이라는 클래스를 만들고, 책 제목과 저자 이름을 필드로 가지게 해보자.
//	생성자와 정보를 출력하는 메서드(printInfo)를 작성해보자.
		Book book = new Book();
			book.title = "어린왕자";
			
		


		
	}
	
	public Book() {}
	
	public Book(String title, String name) {
		title = title;
		name = name;
		
	}
	
}
