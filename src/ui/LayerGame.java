package ui;

import java.awt.Graphics;

public class LayerGame extends Layer {

	public LayerGame(int x, int y, int width, int height) {
		super(x, y, width, height);
	}

	@Override
	public void paint(Graphics g) {
		g.drawRect(x, y, width, height);		
	}

}
