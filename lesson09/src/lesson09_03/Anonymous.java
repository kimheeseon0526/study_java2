package lesson09_03;

import java.util.Arrays;
import java.util.Comparator;

public class Anonymous {
	public static void main(String[] args) {
		//익명클래스
		
		Runnable runnable = new Runnable() {
			int i;
			static int si = 20;
			@Override	
			public void run() {	//run메서드 선언한다  
				// TODO Auto-generated method stub
				System.out.println("실행");
				
			}
			void m() {
				System.out.println(i);
			}
			void m2(int i) {
				i = 20;
			}
		};
		
		runnable.run();
		
//		System.out.println(runnable.i);
//		runnable.m();
		Outer outer = new Outer() {
		//객체 생성하면서 오버라이딩 가능하다
			void m() {
				System.out.println("오버라이드 메서드");
			}
		};
		outer.m();
		
		Integer[] arr = {1, 5, 3, 2, 4, 1};
		
		Comparator<Integer> iter = new Comparator<Integer>() {
			
			@Override
			public int compare(Integer o1, Integer o2) {
				// TODO Auto-generated method stub
				return o2 - o1;
			}
		};
		Arrays.sort(arr, iter);
		System.out.println(Arrays.toString(arr));
	}
}
