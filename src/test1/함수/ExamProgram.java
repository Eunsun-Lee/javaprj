package test1.�Լ�;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Scanner;

public class ExamProgram {
	
	public static void printSumAndAvg(int sum,int count) {
		double avg = 0;
		avg = (double)sum/count;
		System.out.printf("sum:%d\n",sum);
		System.out.printf("avg:%f\n",avg);
	}
	
	public static int sum(int nums[]) {
		int sum = 0;
		for(int i = 0;nums[i] != -1 ;i++) 
			sum+= nums[i];
		return sum;
	}
	
	
	public static void main(String[] args) throws IOException {
		
		FileInputStream fin = new FileInputStream("res/data.txt");
		Scanner fscan = new Scanner(fin);
		
		
		int nums []= new int[100];
		
		// ������ �ϰ� �ε� 
		nums[0] = fscan.nextInt();
		
		
//		int i=0;
//		while(fscan.hasNext()) {
//			nums[i]= fscan.nextInt();
//			System.out.println(nums[i]);
//		}
		
//		System.out.println(fscan.hasNext()); <- false
		
		// for(�ʱⰪ; ���Ῡ��; ������)
//		for (int j = 0; fscan.hasNext(); j++) {
//			nums[j]= fscan.nextInt();
//			System.out.println(nums[j]);
//		}

		
		for(int a=0;fscan.hasNext();a++) {
			nums[a]= fscan.nextInt();
			nums[a+1] = -1;
		}
		
		fin.close(); // �����ʹ� �ε� ��
		
		int sum = 0;
		int count = 0;
		double avg = 0;
		
		for(int i = 0;nums[i] != -1 ;i++) {
			count++;
			sum+= nums[i];
		}

//		while(fscan.hasNext()) {
//			count++;
//			sum+= fscan.nextInt();
//		}
		
		avg = (double)sum/count;
		 //  ������� int������ �����⶧���� ����ȯ �ʼ�
//		System.out.printf("sum:%d\n",sum);
//		System.out.printf("avg:%f\n",avg);
		
		
		// �������� ����
		
		// ������ ����
//		int count = 0;
//		for(int i = 0;nums[i] != -1 ;i++) 
//			count++;
		
		// ������ ��
//		int sum = 0;
//		for(int i = 0;nums[i] != -1 ;i++) 
//			sum+= nums[i];
		int res = sum(nums);
		
		
		// ������ ���
//		double avg = 0;
//		avg = (double)sum/count;
		
		
//		while(fscan.hasNext()) {
//			count++;
//			sum+= fscan.nextInt();
//		}
//		printSumAndAvg(sum,count);
		
	}

}
