package test3.����;

import test3.Exam;

public class WrapperClass {
	public static void main(String[] args) {
		int x = 3;
		float y = 3.5f;
		char c = 'a';
		double d = 4.7; // d ���� ����
		Exam r = new Exam(1, 1, 1);

		Object[] data = new Object[5];
//		data[0] = new Integer(x); // new���� �����ؼ� ���� ���� ���� / �ڽ�
		data[0] = Integer.valueOf(x);
		data[1] = y; // ����ڽ� �÷԰�
//		data[2] = new Character(c); // ĳ���Ͱ�
		data[2] = Character.valueOf(c);
		data[3] = d; // ����
		data[4] = r; // Ŭ������ �����ؼ� ����ڽ��� ���Ͼ

//		String s = Integer.toString(x); // ���ڸ� ���ڿ��� ����
		String s = String.valueOf(x); // ���� ����.

		String s1 = "35";
//		int n = s1; // �Ұ���
		int n = Integer.parseInt(s1); // ���ڿ��� ���������� ����

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
		
//		���ڿ� ��

		String name1 = "����";
		String name2 = new String("����");
		System.out.println(name1 == name2); // ���� ������
		System.out.println(name1.equals(name2)); // ���� ����
		System.out.println(name2.hashCode());
		
		String fileName = "photo.jpg";
		System.out.println(fileName.length()); // ���ڿ��� ���ڼ�(����) Ȯ��
		System.out.println(fileName.indexOf(".")); // ���ڿ��� �ش� ���ڰ� ���°�ִ��� Ȯ�� (0������ ����)
		System.out.println(fileName.substring(0, 3)); // ���ڿ��� 0������ 3���� ���ڸ� ������
		System.out.println(fileName.substring(0, fileName.indexOf(".")));
		System.out.println(fileName.substring(0, fileName.length()-4));
		System.out.println(fileName.replace('o', 't'));
	}
}
