package game.show;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JButton;
import javax.swing.JPanel;

import game.menu.Menu;
import game.playeur.Playeur;

public class AreaGame extends JPanel implements MouseListener{
	protected Dimension sizeArea = new Dimension(842, 595);
	public boolean menu = true;
	public AreaGame() {
		this.setPreferredSize(sizeArea);
		this.setLayout(null);
	}
	public void paintComponent(Graphics g) {
		System.out.println("repaint");
		g.setColor(Color.BLACK);
		g.fillRect(0, 0, sizeArea.width, sizeArea.height);
		if(this.menu){
			System.out.println("Repaint Menu");
			Menu<AreaGame> composant = new Menu<AreaGame>(this, g);
			composant.buttons.forEach((k,v)->v.addMouseListener(this));
		}
	}
//	@Override
//	public void actionPerformed(ActionEvent e) {
//		
//		
//	}
	@Override
	public void mouseClicked(MouseEvent e) {
		System.out.println("click sur le boutton : " + ((JButton)e.getSource()).getName());
		if (((JButton)e.getSource()).getName() == "newPlayeur") {
			this.removeAll();
			this.menu = false;
			this.setLayout(new BorderLayout());
			this.add(new Playeur(sizeArea), BorderLayout.CENTER);
			this.validate();
		}else if(((JButton)e.getSource()).getName() == "continue"){
			
		}
	}
	@Override
	public void mouseEntered(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void mouseExited(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void mousePressed(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void mouseReleased(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}
}
