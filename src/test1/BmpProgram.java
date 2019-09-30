package test1;

import java.io.FileInputStream;
import java.io.IOException;

public class BmpProgram {
	public static void main(String[] args) throws IOException {
		
		FileInputStream fin = new FileInputStream("res/그림.bmp"); 
		
		byte[] buf = new byte[10];
		
		fin.read(buf); // 숫자단위를 불러올때 사용, 문자일 때는 Scanner
		fin.close(); // 최대한 빨리 닫아줄것
		
		// <파일 크기>
		
		// 13(1101) >>3 => 1111  -> 밀려날때 앞자리를 따라감
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
		
		// Mask 처리
		// &0xff <- 뒤에서부터  = &0x000000ff <- 0만큼
		int size = ((int)buf[2] &0xff) << 0|	
				   ((int)buf[3] &0xff) << 8|
				   ((int)buf[4] &0xff) << 16|
				   ((int)buf[5] &0xff) << 24;

		// <파일 크기 출력>
		System.out.printf("size:%d\n", size);

	}

}
