package lesson17;

import java.util.ArrayList;
//import java.util.Arrays;
import java.util.List;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

public class ThreadWait {
	public static void main(String[] args) throws InterruptedException {
		Table table = new Table();
		new Thread(new Cooker(table)).start();
		new Thread(new Customer(table, "햄부기"), "상혀니 ").start();
		new Thread(new Customer(table, "파슷하"), "태후니 ").start();
		new Thread(new Customer(table, "핏짜"), "찌유 ").start();
	
		Thread.sleep(10000);
		System.exit(0);
	
	}

}

class Table {
	List<String> dishNames = new ArrayList<String>(List.of("햄부기", "파슷하", "핏짜"));
	final int MAX_FOOD = 10;

	List<String> dishes = new ArrayList<>();
	private ReentrantLock lock = new ReentrantLock();
	private Condition forCook = lock.newCondition();
	private Condition forCust = lock.newCondition();

	// 테이블에 음식 추가
	public void add(String dish) {
		lock.lock();
		try {
			while (dishes.size() >= MAX_FOOD) {
				String name = Thread.currentThread().getName();
				System.out.println(name + "이 기다립니다");
				try {
					forCook.await();// 요리가 기다리게 하기
					Thread.sleep(50000);
				} catch (InterruptedException e) {
				}
			}
			dishes.add(dish); // 음식 추가
			forCust.signal(); // notify wating 스레드 깨우기
			System.out.println("현재 테이블의 음식 ::" + dishes);
		} finally {
			lock.unlock();
		}
	}

	// 테이블에서 음식 제거
	public void remove(String dish) {
		lock.lock();

		try {
			while (dishes.isEmpty()) {
				String name = Thread.currentThread().getName();
				System.out.println(name + "이 기다립니다");
				try {
					forCust.await();
					Thread.sleep(500);
				} catch (Exception e) {
				}
			}
			while (true) {
				for (int i = 0; i < dishes.size(); i++) {
					if (dish.equals(dishes.get(i))) {
						dishes.remove(i);
						forCust.signal(); // 요리사가 잠자고 있다면 깨우기
						return;
					}
				}
				String name = Thread.currentThread().getName();
				System.out.println(name + "이 기다립니다");
				try {
					forCust.await();
					Thread.sleep(500);

				} catch (Exception e) {}
			}
		} finally {
			lock.unlock();
		}

	}
}

class Customer implements Runnable {
	Table table;
	String food;

	public Customer(Table table, String food) {
		super();
		this.table = table;
		this.food = food;
	}

	@Override
	public void run() { // 음식 먹기
		while (true) {
			try {
				Thread.sleep(100); // 잠시 텀을 주는 것
			} catch (InterruptedException e) {}
			String name = Thread.currentThread().getName();
			table.remove(food);
			System.out.println(name + "이" + food + "를 먹었땅");
		}
	}
}

class Cooker implements Runnable {
	Table table;

	public Cooker(Table table) {
		super();
		this.table = table;
	}

	@Override
	public void run() { // 요리 만들기
		while (true) {
			table.add(table.dishNames.get((int) (Math.random() * 3)));
			try {
				Thread.sleep(20);
			} catch (Exception e) {
			}
		}
	}
}
