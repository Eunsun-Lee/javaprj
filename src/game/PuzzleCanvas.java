package game;

import java.awt.Canvas;
import java.awt.Graphics;
//import java.awt.Image;
//import java.awt.Toolkit;
import java.util.Random;

public class PuzzleCanvas extends Canvas {

	private int pos[] = { 0, 1, 2, 3, 4, 5, 6, 7, 8 };
	private Puzzle2 puzzles[];

	public PuzzleCanvas() {
		Random rand = new Random();
		for (int i = 0; i < 10; i++) {
			int p1 = rand.nextInt(9);
			int p2 = rand.nextInt(9);

			int temp;
			temp = pos[p1];
			pos[p1] = pos[p2];
			pos[p2] = temp;
//			System.out.printf("p1:%d, p2:%d\n", p1, p2);
		}

//		for (int i = 0; i < pos.length; i++) {
//			System.out.printf("pos[%d] = %d\n", i, pos[i]);
	}
//		System.out.print(Arrays.toString(pos));

	
	
	@Override
	public void paint(Graphics g) {
//		super.paint(g);
//		Toolkit tk = Toolkit.getDefaultToolkit();
//		Image img = tk.getImage("res/foto9.jpg");

//		for (int i = 0; i < 3; i++) {
//			for (int j = 0; j < 3; j++) {
//				int x = 200 * j;
//				int y = i * 200;
//				int w = 200;
//				int h = 200;
////		g.drawImage(img, 200, 0, this); // this는 윈도우위
////		g.drawImage(img, x, y, x + w, y + h, /* <-화면 */ 0, 0, 200, 200, /* <-이미지 */ this);
//			}
//		}// 1 번 그림을 9칸에 채움
		puzzles = new Puzzle2[9];
		
		for (int i = 0; i < 9; i++) {
			Puzzle2 puzzle = new Puzzle2();
			puzzle.setPos(i);
			puzzle.setSrc(pos[i]);
			puzzle.draw(g, this);
			
			//puzzles[i] = puzzle;
		}

//		{
//			int x = 10;
//			int y = 200;
//			int w = 200;
//			int h = 200;
//			g.drawImage(img, x, y, x + w, y + h, 200, 0, 400, 200, this);
//		} // 3번그림
//		{
//			int x = 210;
//			int y = 0;
//			int w = 200;
//			int h = 200;
//			g.drawImage(img, x, y, x + w, y + h, 0, 200, 200, 400, this);
//		} // 2번그림
//		{
//			int x = 210;
//			int y = 200;
//			int w = 200;
//			int h = 200;
//			g.drawImage(img, x, y, x + w, y + h, 200, 200, 400, 400, this);
//		} // 4번그림
	}
}
