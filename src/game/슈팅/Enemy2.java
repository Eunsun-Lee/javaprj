package game.½´ÆÃ;

import java.awt.Graphics;
import java.awt.Image;
import java.awt.Toolkit;

public class Enemy2 {
	int x;
	int y;
	Image img;
	
	public Enemy2() {
		x=200;
		y=0;
		
		Toolkit tk = Toolkit.getDefaultToolkit();	
		img = tk.getImage("res/enemy.png");	
	}
	
	public void draw(Graphics g, ShuttingCanvas canvas) {
		g.drawImage(img,x,y,canvas);
	}
	
}
