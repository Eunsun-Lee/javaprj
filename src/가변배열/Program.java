package 가변배열;

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
//		do { // input의 index와 위의 index는 다른것, 증가시켜도 받아올 수 없음
////			input(data/*참조전달*/, index/*값 전달*/); // 입력
//			input(list);
////			print(data, index); // 출력
//			print(list); 
//			System.out.print("go?(1 or 0)");
//			exit = sc.nextInt();
//		} while (exit != 1);
//		System.out.println("시스템 종료");
		
		
		ObjectList list = new ObjectList(); // 다
//		GList<String> list = new GList(); // 글자만
//		GList<Exam> list = new GList(); // Exam만
//		GList<Integer> list = new GList(); // 숫자(정수)만
		
		// 모든 것을 담는 것은 단점일수 있다
		list.add("Hello");
		list.add(30);
		list.add(new Exam());

		//서비스 함수를 사용하려면 형식을 변환해야 한다.
		((Exam)list.get(2)).input();
		((Exam)list.get(2)).input();
		
		
		
		
		
	}
	private static void input(ObjectList list) {
		Scanner sc = new Scanner(System.in);
		System.out.print("kor : "); // 데이터 입력 저장
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
