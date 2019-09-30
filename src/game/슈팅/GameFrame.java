package game.½´ÆÃ;

import java.awt.Canvas;
import java.awt.Frame;

public class GameFrame extends Frame {
	
	private Canvas canvas;
	
	public GameFrame() {
	setSize(360, 700);
//	canvas = new ShuttingCanvas();
//	canvas = new Enemy();
//	canvas = new Fighter();
	canvas = new RoleCanvas();
	
	canvas.setFocusable(true);
	canvas.requestFocus();
	
	add(canvas);
	
	setVisible(true);
	addWindowListener(new GameWindowListener());
	}
}
