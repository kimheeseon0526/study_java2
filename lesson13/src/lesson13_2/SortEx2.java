package lesson13_2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class SortEx2 {
	public static void main(String[] args) {
		List<Integer> l = new ArrayList<Integer>(Arrays.asList(10 ,20 ,30, 30, 45, 77,61 ,10 , 4));	
		//asList() : 배열을 리스트로~
		//고정길이 리스트로 add 사용하면 java.lang.UnsupportedOperationException 로 터진다
		System.out.println(l);
//		l.add(10);
//		System.out.println(l);
//		Arrays.asList(new Integer[] {10, 20, 30});
//		List<Integer> list = new ArrayList<>();
		
		Comparator<Integer> comperator = new Comparator<Integer>() {
			
			@Override
			public int compare(Integer o1, Integer o2) {
				// TODO Auto-generated method stub
				return o1 - o2 ;
			}
		};
		l.sort(comperator);
		System.out.println(l);
		
		l.sort(new Comparator<Integer>() {
			@Override
			public int compare(Integer o1, Integer o2) {
				return o2 - o1;
			}
		});
		l.sort((Integer o1, Integer o2) -> {
				return o2 - o1;
			}
		);
		l.sort((o1, o2) -> o2 - o1);
		
		
	}
}
