package ui;

import java.awt.Graphics;

public abstract class Layer {
	
	protected int x;
	protected int y;
	protected int width;
	protected int height;
	
	public Layer(int x, int y, int width, int height) {
		this.x = x;
		this.y = y;
		this.width = width;
		this.height = height;
	}
	
	public abstract void paint(Graphics g);
	
}
