package game.show;

import java.awt.Dimension;
import java.awt.Graphics;
import javax.swing.JPanel;
import game.element.Ball;

public class AreaGame extends JPanel{
	
	protected Dimension sizeArea = new Dimension(842, 595);
	
	public AreaGame() {
		this.setPreferredSize(sizeArea);
		this.setLayout(null);
	}
	public void paintComponent(Graphics g) {
		System.out.println("je repaint");
		new Ball(this, g);
	}
	public void paintBall() {
		
	}
}
