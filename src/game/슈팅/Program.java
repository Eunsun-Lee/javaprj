package game.슈팅;

import java.awt.Frame;

public class Program {
	public static void main(String[] args) {
//		인터페이스 구현 : 
//			클래스 생성 -> 의미없는 객체수가 늘어남
//			기존 클래스에 생성 -> 사용하려고 하는 클래스 안에서 구현할 것. 
//		class A implements Runnable{
//			@Override
//			public void run() {
//				printList();
//			}
//		}// 쓸모없는 이름을 가진 클래스를 따로 생성하지 않아도 된다.
		
//		Thread th = new Thread(new Runnable() { // <-무명클래스
//			@Override
//			public void run() {
//				printList();
//			}
//		}); // 가장 많이 사용하는 인터페이스 방법
//
//		th.start();
		// 새로운 줄을 만들어 실행 ㄱ
		
		// 자바8부터 지원되는 람다식
//		Thread th = new Thread(()->printList()); // 동시에 돌리기이이(비동기)
//		th.start();
		
//		for(int i=0; i<10;i++)
//			System.out.printf("main : %d\n", i+1);
		
		Frame fram = new GameFrame();
		
		
		
		
	}

	private static void printList() {
		for (int i = 0; i < 10; i++)
			System.out.printf("sub : %d\n",i+1);
	}
	
	
}
