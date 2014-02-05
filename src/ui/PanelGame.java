package ui;

import java.awt.Graphics;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JPanel;

public class PanelGame extends JPanel {
	
	private Layer[] Layers = new Layer[] {
		new LayerBackground(0, 0, 0, 0),
		new LayerGame(200, 40, 240, 380),
		new LayerHighScore(20, 20, 160, 300),
		new LayerButton(460, 20, 160, 300)
	};

	public PanelGame() {
		
	}
	
	@Override
	public void paintComponent(Graphics g) {
		for (Layer layer : Layers) {
			layer.paint(g);
		}
	}

}
