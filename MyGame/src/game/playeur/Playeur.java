package game.playeur;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.event.ComponentListener;
import java.io.File;
import java.io.IOException;
import java.util.List;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SpringLayout;

import game.menu.Button;

public class Playeur extends JPanel{

	private static final long serialVersionUID = -4567608769654546211L;
	private String labelText[] = {"Nom", "Prenom", "Pseudo"};
	private JPanel panForm = new JPanel();
	private SpringLayout sprgLayout = new SpringLayout();
	private String img = "image\\joueur\\1x\\joueur.png";
	public Playeur() {
		this.setPreferredSize(new Dimension(842, 595));
		this.setBounds(0, 0, 842, 595);


		try {
			this.add(new JLabel(new ImageIcon(ImageIO.read(new File(this.img)))));
		} catch (IOException e) {
			e.printStackTrace();
		}
		JLabel[] label = new JLabel[3];
		JTextField[] textField = new JTextField[3];
		for(int i = 0; i < labelText.length; i++) {
			
			label[i] = new JLabel(labelText[i]);
			textField[i] = new JTextField();
			sprgLayout.putConstraint(SpringLayout.EAST,label[i], 50, SpringLayout.WEST, textField[i]);
			panForm.add(label[i]);
			panForm.add(textField[i]);
		}
		this.add(new Button("valider", new Dimension(180,46)));
		this.add(new Button("annuler", new Dimension(180, 46)));
		
		
		sprgLayout.putConstraint(SpringLayout.WEST, panForm, 500,SpringLayout.WEST, this);
		this.setLayout(sprgLayout);
	}
	public void paintComponent(Graphics g) {
		g.setColor(Color.white);
	}
}
