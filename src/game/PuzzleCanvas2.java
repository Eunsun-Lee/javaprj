package game;

import java.awt.Canvas;
import java.awt.Graphics;
// PuzzleCanvas를 객체지향으로 바꾸기
public class PuzzleCanvas2 extends Canvas {

	private Puzzle puzzle;

	public PuzzleCanvas2() {
		// 퍼즐이 사용할 재료들 준비
		PuzzleContext.setCanvas(this);
		// 퍼즐 생성
		puzzle = new Puzzle(2);
	}

	@Override
	public void paint(Graphics g) {
		puzzle.paint(g);
	}
}
