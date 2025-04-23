package lesson13_2;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;

public class Distinct {
	public static void main(String[] args) {
		List<Integer> list = new ArrayList<>();
		list.add(3);
		list.add(2);
		list.add(1);
		list.add(2);
		list.add(1);
		list.add(1);
		System.out.println(list); 	// [3, 2, 1, 2, 1, 1]
		
		list = new ArrayList<>(new LinkedHashSet<>(list)); //LinkedHashSet : 저장순서가 유지되면서 중복 제거
		System.out.println(list);	//[3, 2, 1]
	}
}
