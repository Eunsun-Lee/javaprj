package test1.�Լ�;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class CopyProgram {
	public static void main(String[] args) throws IOException{		
		FileInputStream fin = new FileInputStream("res/�׸�.bmp");
		FileOutputStream fos = new FileOutputStream("res/�׸�1.bmp");
		
		
		
		byte buf[] = new byte[1024];
		
		int size = 0; // fin�� ũ��
		while((size=fin.read(buf))!=-1) {
			fos.write(buf,0,size); 
			// buf���� 0���� fin�� ũ��(size)�� ���
		}
		
		fin.close();
		fos.close();
		
		System.out.println("����Ϸ�");
	}

}
