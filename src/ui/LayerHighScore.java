package ui;

import java.awt.Graphics;

public class LayerHighScore extends Layer {

	public LayerHighScore(int x, int y, int width, int height) {
		super(x, y, width, height);
	}

	@Override
	public void paint(Graphics g) {
		g.drawRect(x, y, width, height);
		g.drawString("High Scores", 30, 40);
	}

}
