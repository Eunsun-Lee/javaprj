package game.����;

import java.awt.Graphics;
import java.awt.Image;
import java.awt.Toolkit;

public class Fighter {
	private int x;
	private int y;
	private Image img;

	private int vx;
	private int vy; // �̵��� �Ÿ�
	private int dx;
	private int dy; // ������ ��

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
		float d = (float)Math.sqrt(w*w+h*h); // ��Ÿ���
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
//		 // vx,vyũ���� �ڽ��� ����
//		if(����������) {
//			vx=0;
//			vy=0;}
	}
	
	
	

//	public void moving(int keyCode) {
//		switch (keyCode) {
//		case 37: // ����
//			this.x -= 5;
//			break;
//		case 38: // ����
//			this.y -= 5;
//			break;
//		case 39: // ������
//			this.x += 5;
//			break;
//		case 40: // �Ʒ���
//			this.y += 5;
//			break;
//		}
//	}

}
