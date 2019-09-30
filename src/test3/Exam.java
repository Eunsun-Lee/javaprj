package test3;

import java.util.Scanner;

public class Exam {
	private int kor=1; // ==안의 생성자를 만들지 않고  바로 기본값을 설정할 수 있다. 만든경우 기본값안줌
//	private int kor;
	private int eng;
	private int math;
	
	private static int type;
	static{
		type=3;
	} // 전역변수
	
	//=====================================
	public Exam() {
		this(0, 0, 0);
	}
	
	public Exam(int kor, int eng, int math) { // 꼭 만들어야만 하는 상황에서만 만드는것
//		this.kor = 0;
//		this.eng = 0;
//		this.math = 0;
		this.kor=kor;
		this.eng=eng;
		this.math=math;
	} // this가 생략가능할때는 생략하는게좋음 헷갈리는 경우에는 표기해줄것
	//======================================
	
	public static void input(Exam exam) {
		Scanner sc = new Scanner(System.in);
		System.out.print("국어점수 : ");
		exam.kor = sc.nextInt();
		System.out.print("영어점수 : ");
		exam.eng = sc.nextInt();
		System.out.print("수학점수 : ");
		exam.math = sc.nextInt();
	} // static에서는 this사용이 불가, static이 붙으면 인스턴스함수가 아니당  
	
	public void input() {
		Scanner sc = new Scanner(System.in);
		System.out.print("국어점수 : ");
		this.kor = sc.nextInt();
		System.out.print("영어점수 : ");
		this.eng = sc.nextInt();
		System.out.print("수학점수 : ");
		this.math = sc.nextInt();
	}
	
	public static void print(Exam exam) {
		System.out.printf("국어 : %d점 ", exam.kor);
		System.out.printf("영어 : %d점 ", exam.eng);
		System.out.printf("수학 : %d점 ", exam.math);
	}
	
	public void print() {
		System.out.printf("국어 : %d점 ", this.kor);
		System.out.printf("영어 : %d점 ", this.eng);
		System.out.printf("수학 : %d점 ", this.math);
	}

}
