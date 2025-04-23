package lesson13;

import java.util.LinkedList;
import java.util.List;
import java.util.Vector;

public class ListEx2 {
	public static void main(String[] args) {
		Vector<String> list = new Vector<String>();
		list.add("홍길동");
		list.add("새똥이");
		list.add("멍청이");
		
		list.remove(0); //0번 인덱스 지워라
		list.add("210");
		list.remove("멍청이");	//객체 자체를 지울 수 있다
		list.set(0, "리릴룡222");
		list.add(0, "리릴룡");
		
		for(String s : list) {
			System.out.println(s);
		}
		System.out.println(list);
		System.out.println(list.size());
	}
}
