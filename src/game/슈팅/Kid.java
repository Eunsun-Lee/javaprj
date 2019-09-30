package game.슈팅;

import java.awt.Graphics;
import java.awt.Image;
import java.awt.Toolkit;

public class Kid {
	// 이미지 , 위치
	private int x;
	private int y;
	private int vx;
	private int vy;
	private int w;
	private int h;

	private static final int OFFSET_LEFT = 32;
	private static final int OFFSET_TOP = 32;

	private Image img;
	private int imgIndex;
	private int imgDC;

	private int timeForReady = 0;
//	static {
//		OFFSET_LEFT = 32;
//		OFFSET_TOP = 32;		
//	}

	public Kid() {

		x = 180;
		y = 600;
		w = h = 64;
		Toolkit tk = Toolkit.getDefaultToolkit();
		img = tk.getImage("res/KakaoTalk_20190925_111229479.png");
		imgIndex = 3;
		imgDC = 0;
	}

	public void update() {
		x += vx;
		y += vy;
		if(timeForReady >0) {
			timeForReady--;
		}
	}

	public void draw(Graphics g, RoleCanvas roleCanvas) {
		int sx = w * imgIndex;
		int sy = 0;
//		g.drawImage(img, x, y, x + w, y + h, 192, 0, 256, 64, roleCanvas);
//		g.drawImage(img, x, y, x + w, y + h, sx, sy, sx + w, sy + h, roleCanvas);
//		g.drawImage(img, x-32, y-32, x + w-32, y + h-32, sx, sy, sx + w, sy + h, roleCanvas);
		g.drawImage(img, x - OFFSET_LEFT, y - OFFSET_TOP, x + w - OFFSET_LEFT, y + h - OFFSET_TOP,
				sx, sy, sx + w, sy + h, roleCanvas);
	}

	public void move(Direction direction) {
		switch (direction) {
		case LEFT:
//			imgIndex--;
//			if (imgIndex < 0)
//				imgIndex = 0;
			if(imgIndex > 0 & ++imgDC >=4) {
				imgIndex--;
				imgDC = 0;
			}
			x -= 6;
			break;
		case RIGHT:
//			imgIndex++;
//			if (imgIndex > 6)
//				imgIndex = 6;
			if(imgIndex < 6 & ++imgDC >=4) {
				imgIndex++;
				imgDC = 0;
			}
			x += 6;
			break;
		case UP:
			y -= 6;
			break;
		case DOWN:
			y += 6;
			break;
		}
	}

	public void move(int x, int y) {
//		dx = x;
//		dy = y;
	}

	public Missiles fire() {
		
		if(timeForReady == 0) {
		Missiles m = new Missiles(x, y);
		timeForReady = 10;
		return m;
		}
		return null;
	}

}
