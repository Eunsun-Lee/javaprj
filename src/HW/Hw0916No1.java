package HW;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Hw0916No1 {
	public static void main(String[] args) throws FileNotFoundException {
		// data의 합계와 평균 구하기
		FileInputStream fin = new FileInputStream("C:\\eclipse\\workspace\\Javaprj\\src\\res\\data.txt");
		Scanner fscan = new Scanner(fin);
		fscan.hasNext();
		int num = 0;
		int sum = 0;
		float avg = 0;
		int a = 0;
		
		while(fscan.hasNext()) {
			num = fscan.nextInt();
			sum+=num;
			a++;
		}
		avg = (float)sum/a;
		System.out.println(avg);
		System.out.println(sum);
		
		
		
	}
}
