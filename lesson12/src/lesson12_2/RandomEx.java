package lesson12_2;

import java.util.Random;

public class RandomEx {
	public static void main(String[] args) {
		Random random = new Random(0);
		random.nextDouble(); //Math.random();
		
		//주사위 랜덤 돌리기
		for(int i = 0 ; i < 10; i++) {
			System.out.println(random.nextInt(6) + 1);
			 //seed값 고정 : 이미 만들어진 난수 테이블에 값을 가져오는 느낌이라 
			//계속 같은 값으로 출력된다
		}
	}

}
