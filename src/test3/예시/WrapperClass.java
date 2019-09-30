package test3.예시;

import test3.Exam;

public class WrapperClass {
	public static void main(String[] args) {
		int x = 3;
		float y = 3.5f;
		char c = 'a';
		double d = 4.7; // d 생략 가능
		Exam r = new Exam(1, 1, 1);

		Object[] data = new Object[5];
//		data[0] = new Integer(x); // new이후 생략해서 값만 참조 가능 / 박싱
		data[0] = Integer.valueOf(x);
		data[1] = y; // 오토박싱 플롯값
//		data[2] = new Character(c); // 캐릭터값
		data[2] = Character.valueOf(c);
		data[3] = d; // 더블값
		data[4] = r; // 클래스를 참조해서 오토박싱이 안일어남

//		String s = Integer.toString(x); // 숫자를 문자열로 변경
		String s = String.valueOf(x); // 위와 같음.

		String s1 = "35";
//		int n = s1; // 불가능
		int n = Integer.parseInt(s1); // 문자열을 정수값으로 변경

		for (int i = 0; i < data.length; i++) {
			System.out.println(data[i]);
			System.out.println(s);
			System.out.println(n);
		}

		String korS = "40";
		String engS = "50";
		String mathS = "60";

		int kor = Integer.parseInt(korS);
		int eng = Integer.parseInt(engS);
		int math = Integer.parseInt(mathS);

		int total = kor + eng + math;
		System.out.println(total);
		
//		문자열 비교

		String name1 = "글자";
		String name2 = new String("글자");
		System.out.println(name1 == name2); // 같은 참조값
		System.out.println(name1.equals(name2)); // 같은 내용
		System.out.println(name2.hashCode());
		
		String fileName = "photo.jpg";
		System.out.println(fileName.length()); // 문자열의 글자수(길이) 확인
		System.out.println(fileName.indexOf(".")); // 문자열에 해당 글자가 몇번째있는지 확인 (0번부터 시작)
		System.out.println(fileName.substring(0, 3)); // 문자열의 0번부터 3개의 문자만 가져옴
		System.out.println(fileName.substring(0, fileName.indexOf(".")));
		System.out.println(fileName.substring(0, fileName.length()-4));
		System.out.println(fileName.replace('o', 't'));
	}
}
