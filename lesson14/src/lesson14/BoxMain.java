package lesson14;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

//<> 제네릭 : 객체의 타입을 미리 명시해서 값을 처리할 때 형변환을 하지 않는것
//타입을 따로 지정하지 않으면 Object 타입이다

public class BoxMain {
	public static void main(String[] args) {
		Box<String> box = new Box();
		box.setItem("양말");
		System.out.println(box.getItem());
		
		Box<Integer> box2 = new Box<>();
		box2.setItem(10);
		System.out.println(box2.getItem());
		
		Comparator<Integer> comp = (a , b) -> a - b;
		List<Integer> list = new ArrayList<Integer>();
		list.sort(comp);
		
	}
}
class Box<T>{
	private T item;

	public T getItem() {
		return item;
	}

	public void setItem(T item) {
		this.item = item;
	}
	
	public static <T> void sm(T t) {
		System.out.println(t);
	}
}
