package game;

import java.awt.Graphics;
import java.awt.Image;
import java.awt.Toolkit;

public class Puzzle2 {
	int x;
	int y;
	int w;
	int h;
	int sx;
	int sy;
	Image img;

	public Puzzle2() {
		w = 200;
		h = 200;

		Toolkit tk = Toolkit.getDefaultToolkit();
		img = tk.getImage("res/foto9.jpg");
	}

	public void setPos(int index) {
		x = (index % 3) * 200;
		y = (index / 3) * 200;
	}

	public void setSrc(int index) {
		sx = (index % 3) * 200;
		sy = (index / 3) * 200;
	}

	public void draw(Graphics g, PuzzleCanvas puzzleCanvas) {
		g.drawImage(img, x, y, x + w, y + h, sx, sy, sx + w, sy + h, puzzleCanvas);

	}
}
