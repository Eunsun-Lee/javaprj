package test1;

import java.io.FileInputStream;
import java.io.IOException;

public class BmpProgram {
	public static void main(String[] args) throws IOException {
		
		FileInputStream fin = new FileInputStream("res/�׸�.bmp"); 
		
		byte[] buf = new byte[10];
		
		fin.read(buf); // ���ڴ����� �ҷ��ö� ���, ������ ���� Scanner
		fin.close(); // �ִ��� ���� �ݾ��ٰ�
		
		// <���� ũ��>
		
		// 13(1101) >>3 => 1111  -> �з����� ���ڸ��� ����
		//  5(0101) >>3 => 0000
		
//		int size = (int)buf[2] >> 0  |	// 0000 0000
//				   (int)buf[3] >> 8  |	//           0000 0000
//				   (int)buf[4] >> 16 |	//                     0000 0000
//				   (int)buf[5] >> 24 | ;//                               0000 0000
//		
//		buf[2] ~ buf[5]
		
//		int size = (int)buf[2] << 0|	
//				   (int)buf[3] << 8|
//				   (int)buf[4] << 16|
//				   (int)buf[5] << 24;
		
		// Mask ó��
		// &0xff <- �ڿ�������  = &0x000000ff <- 0��ŭ
		int size = ((int)buf[2] &0xff) << 0|	
				   ((int)buf[3] &0xff) << 8|
				   ((int)buf[4] &0xff) << 16|
				   ((int)buf[5] &0xff) << 24;

		// <���� ũ�� ���>
		System.out.printf("size:%d\n", size);

	}

}
