package game;

import java.awt.Canvas;
import java.awt.Graphics;
// PuzzleCanvas�� ��ü�������� �ٲٱ�
public class PuzzleCanvas2 extends Canvas {

	private Puzzle puzzle;

	public PuzzleCanvas2() {
		// ������ ����� ���� �غ�
		PuzzleContext.setCanvas(this);
		// ���� ����
		puzzle = new Puzzle(2);
	}

	@Override
	public void paint(Graphics g) {
		puzzle.paint(g);
	}
}
