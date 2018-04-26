package game.show;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import javax.swing.JPanel;
import game.menu.Menu;

public class AreaGame extends JPanel{
	
	protected Dimension sizeArea = new Dimension(842, 595);
	public String component;
	public AreaGame() {
		this.setPreferredSize(sizeArea);
		this.setLayout(null);
	}
	public void paintComponent(Graphics g) {
		g.setColor(Color.BLACK);
		g.fillRect(0, 0, sizeArea.width, sizeArea.height);
		switch(this.component){
			case "menu":
				new Menu<AreaGame>(this, g);
			break;
			case "game":
				
			break;
		default:
			System.out.println("Non definie");
		break;
		}
	}
}
