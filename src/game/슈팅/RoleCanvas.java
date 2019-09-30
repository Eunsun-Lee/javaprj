package game.슈팅;

import java.awt.Canvas;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.ArrayList;
import java.util.List;
//import 가변배열.ObjectList;

public class RoleCanvas extends Canvas implements MouseListener, KeyListener {

	private Kid kid;
	private Background bg;
	private Enemy enemy;
//	private Missiles[] missiles;
	private /*Object*/List<Missiles> missiles;
//	int count;

	public RoleCanvas() {
		kid = new Kid();
		bg = new Background();
		enemy = new Enemy();
//		missiles = new Missiles[1000];
		missiles = new ArrayList<>();

//		count = 0;
//		for(int i=0; i<100; i++)
//			missiles[i] = new Missiles();
		addMouseListener(this);
		addKeyListener(this);

		new Thread(() -> {
			while (true) {
				try {
					bg.update();
					kid.update();
//					for (int i = 0; i < missiles.length; i++) {
//						if (missiles[i] != null) {
//							missiles[i].update();
//							if (missiles[i].getY() < -45)
//								missiles[i] = null;
//						}
//					}
					enemy.update();
//					for (Object o : missiles) {
//						Missiles m = (Missiles) o;
//						((Missiles) o).update();
//					}
//					System.out.println("Thread");
					for (int i = 0; i < missiles.size(); i++) {
						missiles.get(i).update();
					}

					Thread.sleep(17);
					repaint();
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
//				repaint(); //canvas가 호출
			}
		}).start();
	}

	@Override
	public void paint(Graphics g) {
//		this.getGraphics().drawImage(img,x,y,this);
		Image bufimg = createImage(this.getWidth(), this.getHeight());
//		buf.getGraphics();

		Graphics g2 = bufimg.getGraphics();
		bg.draw(g2, this);
		enemy.draw(g2, this);
//		for (int i = 0; i < missiles.length; i++)
//			if (missiles[i] != null)
//				missiles[i].draw(g2, this);
//		for (Object o : missiles) {
//			((Missiles) o).draw(g2, this);
//		}
		for(Missiles m : missiles)
			m.update();
		for (int i = 0; i < missiles.size(); i++) {
			missiles.get(i).draw(g2, this);
		}
		kid.draw(g2, this);
		// 버퍼링
		g.drawImage(bufimg, 0, 0, this);
	}

	@Override
	public void update(Graphics g) {
		paint(g);
	}

	@Override
	public void keyPressed(KeyEvent e) {
		switch (e.getKeyCode()) {
		case KeyEvent.VK_LEFT:
			kid.move(Direction.LEFT);
			break;
		case KeyEvent.VK_RIGHT:
			kid.move(Direction.RIGHT);
			break;
		case KeyEvent.VK_UP:
			kid.move(Direction.UP);
			break;
		case KeyEvent.VK_DOWN:
			kid.move(Direction.DOWN);
			break;
		case KeyEvent.VK_SPACE:
//			if(count<1000) {
//			missiles[count] = kid.fire();
//			count++;
//			}else {
//				count = 0;
//			}
			Missiles m = kid.fire();
			if (m != null) {
				missiles.add(m);
			}
			break;

		}
	}

	@Override
	public void keyReleased(KeyEvent e) {}

	@Override
	public void keyTyped(KeyEvent e) {}

	@Override
	public void mouseClicked(MouseEvent e) {}

	@Override
	public void mouseEntered(MouseEvent e) {}

	@Override
	public void mouseExited(MouseEvent e) {}

	@Override
	public void mousePressed(MouseEvent e) {}

	@Override
	public void mouseReleased(MouseEvent e) {}

}
