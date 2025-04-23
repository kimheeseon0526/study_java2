package lesson13;

import java.util.ArrayList;
import java.util.List;

public class ListEx {
	public static void main(String[] args) {
		//List 인터페이스
		
		ArrayList<Integer> list = new ArrayList<Integer>();	//크기 지정x,, 타입 지정x

		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		list.add(5);
		list.add(6);
		list.add((int)'A');	//65
		
		for(int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
		System.out.println(list.toString());
		//빼거나 교체 가능
		//
	}
}
