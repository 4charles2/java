package game.show;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JPanel;

import game.menu.Menu;
import game.playeur.Playeur;

public class AreaGame extends JPanel implements ActionListener{
	protected Dimension sizeArea = new Dimension(842, 595);
	public boolean menu = true;
	public AreaGame() {
		this.setPreferredSize(sizeArea);
		this.setLayout(null);
	}
	public void paintComponent(Graphics g) {

		g.setColor(Color.BLACK);
		g.fillRect(0, 0, sizeArea.width, sizeArea.height);
		if(this.menu){
			System.out.println("Repaint Menu");
			Menu<AreaGame> composant = new Menu<AreaGame>(this, g);
			composant.buttons.forEach((k,v)->v.addActionListener(this));
		}
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		System.out.println("click sur le boutton : " + ((JButton)e.getSource()).getName());
		if (((JButton)e.getSource()).getName() == "newPlayeur") {
			this.removeAll();
			this.menu = false;
			this.setLayout(new FlowLayout());
			this.add(new Playeur());
		}else if(((JButton)e.getSource()).getName() == "continue"){
			
		}
		this.validate();
	}
}
