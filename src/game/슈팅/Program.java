package game.����;

import java.awt.Frame;

public class Program {
	public static void main(String[] args) {
//		�������̽� ���� : 
//			Ŭ���� ���� -> �ǹ̾��� ��ü���� �þ
//			���� Ŭ������ ���� -> ����Ϸ��� �ϴ� Ŭ���� �ȿ��� ������ ��. 
//		class A implements Runnable{
//			@Override
//			public void run() {
//				printList();
//			}
//		}// ������� �̸��� ���� Ŭ������ ���� �������� �ʾƵ� �ȴ�.
		
//		Thread th = new Thread(new Runnable() { // <-����Ŭ����
//			@Override
//			public void run() {
//				printList();
//			}
//		}); // ���� ���� ����ϴ� �������̽� ���
//
//		th.start();
		// ���ο� ���� ����� ���� ��
		
		// �ڹ�8���� �����Ǵ� ���ٽ�
//		Thread th = new Thread(()->printList()); // ���ÿ� ����������(�񵿱�)
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
