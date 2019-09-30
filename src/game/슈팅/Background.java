package game.½´ÆÃ;

import java.awt.Graphics;
import java.awt.Image;
import java.awt.Toolkit;

public class Background {
	private int x;
	private int y;
	private Image img;
	
	public Background() {
		x=0;
		y=0;
		Toolkit tk = Toolkit.getDefaultToolkit();
		img = tk.getImage("res/space.jpg");
	}

	public void draw(Graphics g, RoleCanvas roleCanvas) {
		g.drawImage(img, x, y, roleCanvas);	
		g.drawImage(img, x, y-1200, roleCanvas);	
	}
	public void update() {
		y++;
		if(y>=1199) {
			y=0;
		}
	}
}
