//package lesson17;
//
//public class ThreadEx {
//	public static void main(String[] args) throws Exception {
//		System.out.println("main 시작");
//		MyThread myThread1 = new MyThread(new MyRunnable());
//		MyThread myThread2 = new MyThread(() -> {
//			for(int i = 0 ; i < 50; i++) {
//				System.out.println(i + " :: Thread :: " + Thread.currentThread().getName());
//			}
//		});
//		
//		myThread1.start();	//시작
//		myThread2.start();
////		myThread.run();
//		System.out.println(Thread.currentThread().getName());
//		System.out.println("main 종료");
//		
//		Thread thread = new Thread(new MyRunnable());
//		thread.start();
////		myThread.run();
//		System.out.println(Thread.currentThread().getName());
//		System.out.println("main 종료");
//		
//		
//	}
//}
//class MyThread extends Thread{
//	@Override
//	public void run() {		
//		test();
//		for(int i = 0 ; i < 50; i++) {
//			System.out.println(i + " :: Thread :: " + getName());
//		}
//	}
//	void test() {
//		System.out.println("test");
//	}
//	
//}
////스레드 두 개 사용 : main메서드 , run메서드
//class MyRunnable implements Runnable{
//	@Override
//	public void run() {
//		for(int i = 0; i < 50; i++) {
//			System.out.println(i + " :: Thread :: " + getName());
//			
//		}
//	}
//
//	private int getName() {
//		// TODO Auto-generated method stub
//		return 0;
//	}
//}