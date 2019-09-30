package game;

import java.awt.Canvas;
import java.awt.Frame;

public class GameFrame extends Frame {
	
//	private Fighter fighter; // has상속
	
	private Canvas canvas;
	
	public GameFrame() {
	setSize(500, 500);
//	canvas = new GameCanvas();
	canvas = new PuzzleCanvas();
//	canvas = new LottoCanvas();
	add(canvas);
//	fighter = new Fighter();
	
	setVisible(true);
	}
	
//	@Override  // 재정의 상속받은것을 수정하여 쓰고싶을때
//	public void paint(Graphics g) {
//		super.paint(g);
//		
//		Toolkit tk =  Toolkit.getDefaultToolkit();
//		Image img = tk.getImage("res/fighter.png");
//		
//		g.drawImage(img, 220, 0, this); // this는 윈도우위
//	} - class를 만들었으니 지우기
}
