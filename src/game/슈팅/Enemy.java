package game.½´ÆÃ;

import java.awt.Graphics;
import java.awt.Image;
import java.awt.Toolkit;

public class Enemy {
	int x;
	int y;
	Image img;
	
	public Enemy() {
		x=180;
		y=32;
		
		Toolkit tk = Toolkit.getDefaultToolkit();	
		img = tk.getImage("res/enemy.png");	
	}
	
	public void draw(Graphics g, RoleCanvas canvas) {
		g.drawImage(img,x-24,y-32,canvas);
	}

	public void update() {
		
	}
	
}
