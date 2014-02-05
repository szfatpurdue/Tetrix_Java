package ui;

import java.awt.Graphics;
import java.awt.Image;

import javax.swing.ImageIcon;

public class LayerBackground extends Layer {

	public LayerBackground(int x, int y, int width, int height) {
		super(x, y, width, height);
	}

	@Override
	public void paint(Graphics g) {
		Image img = new ImageIcon("Pictures/01.jpg").getImage();
		g.drawImage(img, 0, 0, null);
	}

}
