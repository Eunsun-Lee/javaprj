package game;

import java.awt.Canvas;
import java.awt.Frame;

public class GameFrame extends Frame {
	
//	private Fighter fighter; // has���
	
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
	
//	@Override  // ������ ��ӹ������� �����Ͽ� ���������
//	public void paint(Graphics g) {
//		super.paint(g);
//		
//		Toolkit tk =  Toolkit.getDefaultToolkit();
//		Image img = tk.getImage("res/fighter.png");
//		
//		g.drawImage(img, 220, 0, this); // this�� ��������
//	} - class�� ��������� �����
}
