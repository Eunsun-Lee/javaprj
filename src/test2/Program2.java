package test2;

//import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Program2 {
	public static void main(String[] args) throws IOException{
		
//		System.out.write(123);
//		System.out.println("");
//		System.out.write(51);
//		System.out.flush();
		
		FileOutputStream fout = new FileOutputStream("res/test-bi.txt");
		
		fout.write(12);
//		fout.write('B');
		fout.flush();
		
		fout.close();
		System.out.println("작업 종료");
		
//		System.out.println("");
//		// 1. 파일 입력 스트링 fin 객체를 생성할 것 
//		FileInputStream fin = new FileInputStream("res/그림.bmp"); //<- 상대경로 
////		FileInputStream fin = new FileInputStream("C:\eclipse\workspace\Javaprj\res\data.txt"); <- 절대경로
//		
//		// 2. 파일에서 첫번째 1바이트를 읽어서 출력 할 것
//		int value = fin.read();
//		System.out.println(value);
//		
//		// 3. 파일 입력 스트링을 닫을 것
//		fin.close();
	}
}
