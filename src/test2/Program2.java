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
		System.out.println("�۾� ����");
		
//		System.out.println("");
//		// 1. ���� �Է� ��Ʈ�� fin ��ü�� ������ �� 
//		FileInputStream fin = new FileInputStream("res/�׸�.bmp"); //<- ����� 
////		FileInputStream fin = new FileInputStream("C:\eclipse\workspace\Javaprj\res\data.txt"); <- ������
//		
//		// 2. ���Ͽ��� ù��° 1����Ʈ�� �о ��� �� ��
//		int value = fin.read();
//		System.out.println(value);
//		
//		// 3. ���� �Է� ��Ʈ���� ���� ��
//		fin.close();
	}
}
