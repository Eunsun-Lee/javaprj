package game;

import java.awt.Canvas;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Toolkit;

public class LottoCanvas extends Canvas {

	private int[] lotto = { 1, 3, 5, 9, 10, 12 };

	public LottoCanvas() {
	}

	@Override
	public void paint(Graphics g) {
		Toolkit tk = Toolkit.getDefaultToolkit();
		Image img = tk.getImage("res/cards.png");

		for (int i = 0; i < lotto.length; i++) {
			// 그림 한칸 사이즈 200,250
			int x = i*200;
			int y = 0;
			int w = 200;
			int h = 250;
			int sx = (lotto[i]-1)*200;
			int sy = 0;
			g.drawImage(img, x, y, x+w, y+h, sx, sy, sx+w, sy+h, this);
		}
	}
}
