package test3;

//import java.util.Scanner;

public class ExamProgram {
	// static
//	static int kor=3; // static�� �پ ���������� ��, int kor �� ��������
//	int kor =3; // ����� ���� ������ ����
	
	public static void main(String[] args) {		
		Exam exam = new Exam(); // Exam + (); <- �������Լ� (������ : ��ü�� �ʱ�ȭ, ������� ȣ��) ��������� ��ü�� �پ ������� �� �ִ�
								// �������Լ��� �̸��� ���� // �¾���� �ѹ���
								// �⺻�����ڴ� ��ü�� �����ϴ� �⺻���� �ʿ��ϹǷ� ���������ʾƾ��ϴ� ��츦 ���� ����������
		Exam exam1 = new Exam(10,10,10); 
//		exam.init(); // �ʱ�ȭ�� ������ �� ����
	
		
		//1. ������ �Է¹ޱ�
		Exam.input(exam); // �Լ�����, new �ʿ��
		exam.input(); // ��ü���� ; static�� ��
			// method�Լ�
		
		//2. ������ ����ϱ�
		Exam.print(exam);
		exam.print();
	}
			  // ��ȯ�� �Լ��� (�Ű������� �Ű�������) { } <- �Լ��� �����ϴ� ���
//	public static void input(Exam exam) {
//		Scanner sc = new Scanner(System.in);
//		System.out.print("�������� : ");
//		exam.kor = sc.nextInt();
//	}
//	public static void print(Exam exam) {
//		System.out.printf("���� : %d��", exam.kor);
//		
//	}
}
