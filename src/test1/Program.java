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
		
		// ������ �ҷ�����
		FileInputStream fin = new FileInputStream("C:\\eclipse\\workspace\\Javaprj\\res\\data.txt");
		
		Scanner fscan = new Scanner(fin);
		int num = 0;
		
		fscan.hasNext();
		
		num = fscan.nextInt();
		System.out.println(num);
		
		while(fscan.hasNext()) { // �����͸� ������ �ִ��� Ȯ��
			num = fscan.nextInt();
			System.out.println(num);
			
		}
		
		fscan.close(); // ���� ���߿� �����ͺ��� �ݾ���
		fin.close();
		
		// �հ� ��� ���ϱ�
		
		
		
		
		
	}
}
