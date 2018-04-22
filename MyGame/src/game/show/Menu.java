package game.show;

import java.awt.Graphics;
import java.awt.Image;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.JPanel;

public class Menu extends JPanel {
	public Menu() {
	
	}
	public void paintComponent(Graphics g) {
		Image background = null;
		try {
			background = ImageIO.read(new File("image/1x/Menu.png"));
		} catch (IOException e) {
			e.printStackTrace();
		}
		g.drawImage(background, 0, 0, this.getWidth(), this.getHeight(), this);
	}
}
