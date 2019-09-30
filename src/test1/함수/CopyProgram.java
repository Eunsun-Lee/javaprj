package test1.함수;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class CopyProgram {
	public static void main(String[] args) throws IOException{		
		FileInputStream fin = new FileInputStream("res/그림.bmp");
		FileOutputStream fos = new FileOutputStream("res/그림1.bmp");
		
		
		
		byte buf[] = new byte[1024];
		
		int size = 0; // fin의 크기
		while((size=fin.read(buf))!=-1) {
			fos.write(buf,0,size); 
			// buf에서 0부터 fin의 크기(size)를 출력
		}
		
		fin.close();
		fos.close();
		
		System.out.println("복사완료");
	}

}
