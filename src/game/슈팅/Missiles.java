package game.½´ÆÃ;

import java.awt.Graphics;
import java.awt.Image;
import java.awt.Toolkit;

public class Missiles {
	private int x;
	private int y;
	
	private int vx;
	private int vy;
	
	private Image img;
	
	public Missiles()
	{
		x = 0;
		y = 0;
		Toolkit tk = Toolkit.getDefaultToolkit();
		img = tk.getImage("res/missile.png");
	}
	
	public Missiles(int x, int y) {
		this.x=x;
		this.y=y;
		Toolkit tk = Toolkit.getDefaultToolkit();
		img = tk.getImage("res/missile.png");
	}

	public void update() {
//		x=vx;
//		y+=vy;
		y-=8;
	}

	public void draw(Graphics g2, RoleCanvas roleCanvas) {
		g2.drawImage(img, x-10, y-40, roleCanvas);
	}

	public int getY() {
		return y;
	}
	
	
}
