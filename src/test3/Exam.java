package test3;

import java.util.Scanner;

public class Exam {
	private int kor=1; // ==���� �����ڸ� ������ �ʰ�  �ٷ� �⺻���� ������ �� �ִ�. ������ �⺻������
//	private int kor;
	private int eng;
	private int math;
	
	private static int type;
	static{
		type=3;
	} // ��������
	
	//=====================================
	public Exam() {
		this(0, 0, 0);
	}
	
	public Exam(int kor, int eng, int math) { // �� �����߸� �ϴ� ��Ȳ������ ����°�
//		this.kor = 0;
//		this.eng = 0;
//		this.math = 0;
		this.kor=kor;
		this.eng=eng;
		this.math=math;
	} // this�� ���������Ҷ��� �����ϴ°����� �򰥸��� ��쿡�� ǥ�����ٰ�
	//======================================
	
	public static void input(Exam exam) {
		Scanner sc = new Scanner(System.in);
		System.out.print("�������� : ");
		exam.kor = sc.nextInt();
		System.out.print("�������� : ");
		exam.eng = sc.nextInt();
		System.out.print("�������� : ");
		exam.math = sc.nextInt();
	} // static������ this����� �Ұ�, static�� ������ �ν��Ͻ��Լ��� �ƴϴ�  
	
	public void input() {
		Scanner sc = new Scanner(System.in);
		System.out.print("�������� : ");
		this.kor = sc.nextInt();
		System.out.print("�������� : ");
		this.eng = sc.nextInt();
		System.out.print("�������� : ");
		this.math = sc.nextInt();
	}
	
	public static void print(Exam exam) {
		System.out.printf("���� : %d�� ", exam.kor);
		System.out.printf("���� : %d�� ", exam.eng);
		System.out.printf("���� : %d�� ", exam.math);
	}
	
	public void print() {
		System.out.printf("���� : %d�� ", this.kor);
		System.out.printf("���� : %d�� ", this.eng);
		System.out.printf("���� : %d�� ", this.math);
	}

}
