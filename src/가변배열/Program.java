package �����迭;

import java.util.Scanner;

import test3.Exam;

public class Program {
	public static void main(String[] args) {
//		Object[] data = new Object[3];
//		int index = 0;
//		ObjectList list;
//		list = new ObjectList();
//		int exit = 0;
//		
//		Scanner sc = new Scanner(System.in);
//
//		do { // input�� index�� ���� index�� �ٸ���, �������ѵ� �޾ƿ� �� ����
////			input(data/*��������*/, index/*�� ����*/); // �Է�
//			input(list);
////			print(data, index); // ���
//			print(list); 
//			System.out.print("go?(1 or 0)");
//			exit = sc.nextInt();
//		} while (exit != 1);
//		System.out.println("�ý��� ����");
		
		
		ObjectList list = new ObjectList(); // ��
//		GList<String> list = new GList(); // ���ڸ�
//		GList<Exam> list = new GList(); // Exam��
//		GList<Integer> list = new GList(); // ����(����)��
		
		// ��� ���� ��� ���� �����ϼ� �ִ�
		list.add("Hello");
		list.add(30);
		list.add(new Exam());

		//���� �Լ��� ����Ϸ��� ������ ��ȯ�ؾ� �Ѵ�.
		((Exam)list.get(2)).input();
		((Exam)list.get(2)).input();
		
		
		
		
		
	}
	private static void input(ObjectList list) {
		Scanner sc = new Scanner(System.in);
		System.out.print("kor : "); // ������ �Է� ����
		list.add(sc.nextInt());
		
//		data[index] = sc.nextInt();
//		index++;
	}

	private static void print(ObjectList list) {
		for(int i = 0; i<list.size(); i++)
		System.out.println("kor : "+list.get(i));
//		System.out.println(list.get(0));
		
	}
}
