package test1;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;

public class APIProgram {
	public static void main(String[] args) throws IOException {
//		System.out;
//		System.out.write('h'); // 문자가 아닌것을 출력할때 주로 사용(print는 문자만 출력이 가능함)
//		System.out.write('e');
//		System.out.write('l');
//		System.out.write('l');
//		System.out.write('o');
//		System.out.flush();
		

//		System.out.print("hello");
//		System.out.println();
		
		
//		// printf
		int kor = 90;
		int eng = 80;
		System.out.printf("kor : %d, eng : %d\r\n",kor,eng);
//		==
//		System.out.printf("kor : %d, eng : %d",kor,eng);
//		System.out.print("\r\n"); = System.out.println();
		
		System.out.print("end");
		
		
		
		FileOutputStream fos= new FileOutputStream("res/api-out.txt");
		PrintStream fout = new PrintStream(fos);
		
//		fout.write('h'); // <- 코드값을 출력, ''로 감싸주면 그에 대한 코드번호를 출력
//		fout.write('e'); 
//		fout.write('l');
//		fout.write('l');
//		fout.write('o');
		
//		fos.flush();

		fout.print("hello");
//		fout.printf(format, args);
		fout.printf("kor : %d, eng : %d",kor,eng);
		fout.print("\r\n");
		fout.print("end");
		
		System.out.println("");
		
		
		
//		System.in;		
		
		FileInputStream fin= new FileInputStream("res/data.txt");
		int b1 = System.in.read();
		System.out.println(b1);
		
		int b2 = fin.read();
		fout.println(b2);
		
		fin.close();
		fos.close();
	}

}
