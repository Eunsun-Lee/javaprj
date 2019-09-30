package game.슈팅;

import java.awt.Graphics;
import java.awt.Image;
import java.awt.Toolkit;

public class Fighter {
	private int x;
	private int y;
	private Image img;

	private int vx;
	private int vy; // 이동할 거리
	private int dx;
	private int dy; // 도착할 곳

	public Fighter() {
		x = 200;
		y = 500;

		Toolkit tk = Toolkit.getDefaultToolkit();
		img = tk.getImage("res/fighter.png");
	}

	public void draw(Graphics g, ShuttingCanvas canvas) {
		g.drawImage(img, x, y, canvas);
	}

	public void move(int x, int y) {
		float w = dx-this.x;
		float h = dy-this.y;
		float d = (float)Math.sqrt(w*w+h*h); // 피타고라스
		vx = (int)(w/d*2);
		vy = (int)(h/d*2);
		
//		dx = x;
//		dy = y;
//
//		vx = (dx - this.x) / 15;
//		vy = (dy - this.y) / 15;

	}

	public void update() {
		x += vx;
		y += vy;
//		 // vx,vy크기의 박스에 도달
//		if(목적지도달) {
//			vx=0;
//			vy=0;}
	}
	
	
	

//	public void moving(int keyCode) {
//		switch (keyCode) {
//		case 37: // 왼쪽
//			this.x -= 5;
//			break;
//		case 38: // 위쪽
//			this.y -= 5;
//			break;
//		case 39: // 오른쪽
//			this.x += 5;
//			break;
//		case 40: // 아랫쪽
//			this.y += 5;
//			break;
//		}
//	}

}
