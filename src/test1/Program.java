package test1;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class Program {
	public static void main(String[] args) throws IOException {
		
//		int sum = 0;
//		
//		for(int i=1;i<=10;i++) {
//			sum += i;
//		}
//		
		int nums[] = new int [10];
		
//		InputStream / OutputStream
		
		// 파일을 불러오는
		FileInputStream fin = new FileInputStream("C:\\eclipse\\workspace\\Javaprj\\res\\data.txt");
		
		Scanner fscan = new Scanner(fin);
		int num = 0;
		
		fscan.hasNext();
		
		num = fscan.nextInt();
		System.out.println(num);
		
		while(fscan.hasNext()) { // 데이터를 가지고 있는지 확인
			num = fscan.nextInt();
			System.out.println(num);
			
		}
		
		fscan.close(); // 가장 나중에 열린것부터 닫아줌
		fin.close();
		
		// 합과 평균 구하기
		
		
		
		
		
	}
}
