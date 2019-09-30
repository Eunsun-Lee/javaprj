package test3;

//import java.util.Scanner;

public class ExamProgram {
	// static
//	static int kor=3; // static이 붙어서 전역변수가 됨, int kor 를 선언해줌
//	int kor =3; // 사용할 수는 있지만 안함
	
	public static void main(String[] args) {		
		Exam exam = new Exam(); // Exam + (); <- 생성자함수 (생성자 : 객체를 초기화, 가장먼저 호출) 갓만들어진 객체에 붙어서 만들어질 수 있다
								// 생성자함수는 이름이 없다 // 태어난순간 한번만
								// 기본생성자는 객체를 생성하는 기본값이 필요하므로 꼭만들지않아야하는 경우를 빼고 만들어줘야함
		Exam exam1 = new Exam(10,10,10); 
//		exam.init(); // 초기화를 강제할 수 없음
	
		
		//1. 성적을 입력받기
		Exam.input(exam); // 함수지향, new 필요없
		exam.input(); // 객체지향 ; static이 없
			// method함수
		
		//2. 성적을 출력하기
		Exam.print(exam);
		exam.print();
	}
			  // 반환형 함수명 (매개변수형 매개변수명) { } <- 함수를 정의하는 방법
//	public static void input(Exam exam) {
//		Scanner sc = new Scanner(System.in);
//		System.out.print("국어점수 : ");
//		exam.kor = sc.nextInt();
//	}
//	public static void print(Exam exam) {
//		System.out.printf("국어 : %d점", exam.kor);
//		
//	}
}
