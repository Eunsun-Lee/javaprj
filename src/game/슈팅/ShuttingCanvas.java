package game.슈팅;

import java.awt.Canvas;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class ShuttingCanvas extends Canvas implements MouseListener, KeyListener {

	int x, x2;
	int y, y2;
	Image img, img2;
	private Fighter fighter = new Fighter();
	private Enemy2 enemy2 = new Enemy2();

	public ShuttingCanvas() {
		addMouseListener(this);
		addKeyListener(this);
		
		fighter = new Fighter();

		new Thread(() -> {
			while (true) {
				try {
					fighter.update();
					
					Thread.sleep(17);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				repaint(); // 화면갱신
			}
		}).start();
	}

	@Override
	public void paint(Graphics g) {
		fighter.draw(g, this);
		enemy2.draw(g, this);

	}

	@Override
	public void mouseClicked(MouseEvent arg0) {
//		System.out.printf("(%d,%d)\n",arg0.getX(),arg0.getY());

		fighter.move(arg0.getX(), arg0.getY());
//		enemy.x= arg0.getX();
//		enemy.y= arg0.getY();

		repaint();
	}

	@Override
	public void mouseEntered(MouseEvent arg0) {
	}

	@Override
	public void mouseExited(MouseEvent arg0) {
	}

	@Override
	public void mousePressed(MouseEvent arg0) {
	}

	@Override
	public void mouseReleased(MouseEvent arg0) {
	}

	@Override
	public void keyPressed(KeyEvent e) {
//		fighter.moving(e.getKeyCode());
//		switch (e.getKeyCode()) {
//		case 37: // 왼쪽
//			x -= 5;
//			break;
//		case 38: // 위쪽
//			y -= 5;
//			break;
//		case 39: // 오른쪽
//			x += 5;
//			break;
//		case 40: // 아랫쪽
//			y += 5;
//			break;
//		}
////		x+=3;
////		y+=3;
//		repaint();
	}

	@Override
	public void keyReleased(KeyEvent e) {
	}

	@Override
	public void keyTyped(KeyEvent e) {
	}
}
