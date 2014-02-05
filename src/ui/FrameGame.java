package ui;

import java.awt.Dimension;
import java.awt.Toolkit;

import javax.swing.JFrame;

public class FrameGame extends JFrame {
	
	public FrameGame() {
		this.setTitle("Tetris");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setSize(640, 480);
		this.setResizable(false);
		Toolkit toolkit = Toolkit.getDefaultToolkit();
		Dimension screen = toolkit.getScreenSize();
		int w = (screen.width - this.getWidth()) / 2;
		int h = (screen.height - this.getHeight()) / 2;
		this.setLocation(w, h);
		this.setContentPane(new PanelGame());
	}

}
