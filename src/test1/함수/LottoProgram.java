package test1.함수;

import java.util.Scanner;

public class LottoProgram {
	public static void main(String[] args) {
		int[] lotto = new int[6];
		
		
		printMenu();
		switch(inputMenu()) {
		case 1 :
			inputLottomenual(lotto);
			System.out.println("출력1");
			break;
		case 2 :
			genLottoAuto(lotto);
			System.out.println("출력2");
			break;
		case 3 :
			exitProgram();
		default :
			errorMessage();
		}
		
	}

	private static void errorMessage() {
		// TODO Auto-generated method stub
		
	}

	private static void exitProgram() {
		// TODO Auto-generated method stub
		
	}

	private static void genLottoAuto(int[] lotto) {
		
	}

	private static void inputLottomenual(int[] lotto) {
		System.out.println("=====입력해주세요=====");
		Scanner sc1 = new Scanner(System.in);
		int gnum[] = new int[6];
		gnum[0] = sc1.nextInt();
		
		for (int i = 0; i < gnum.length; i++) {
			
		}
	}

	private static int inputMenu() {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		return num;
	}

	private static void printMenu() {
		System.out.println("★로또 메뉴☆");
		System.out.println("");
		System.out.println("  1. 수동");
		System.out.println("  2. 자동");
		System.out.println("  3. 종료");
		
	}
}
