package game.playeur;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Rectangle;
import java.io.File;
import java.io.IOException;
import java.util.Hashtable;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SpringLayout;
import game.menu.Button;

public class Playeur extends JPanel{

	private static final long serialVersionUID = -4567608769654546211L;
	public Hashtable<String, Button> buttons = new Hashtable<String, Button>();
	private String labelText[] = {"Nom", "Prenom", "Pseudo"};
	private JPanel panForm = new JPanel();
	private SpringLayout sprgLayout = new SpringLayout();
	private String img = "image\\joueur\\1x\\joueur.png";
	private Dimension sizeArea;
	
	public Playeur(Dimension pSizeArea) {
		
		this.sizeArea = pSizeArea;
		this.setPreferredSize(sizeArea);
		this.setLayout(null);
		JLabel img = null;
		try {
			 img = new JLabel(new ImageIcon(ImageIO.read(new File(this.img)))); 
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		JLabel[] label = new JLabel[3];
		JTextField[] textField = new JTextField[3];
		panForm.setLayout(sprgLayout);
		for(int i = 0; i < labelText.length; i++) {
			label[i] = new JLabel(labelText[i]);
			textField[i] = new JTextField("Entrer votre " + labelText[i], 15);
			sprgLayout.putConstraint(SpringLayout.NORTH,label[i], i*50+50, SpringLayout.NORTH, this);
			sprgLayout.putConstraint(SpringLayout.WEST,label[i], 50, SpringLayout.WEST, this);
			sprgLayout.putConstraint(SpringLayout.NORTH,textField[i], i*50+50, SpringLayout.NORTH, this);
			sprgLayout.putConstraint(SpringLayout.WEST,textField[i], 50, SpringLayout.WEST, label[i]);
			panForm.add(label[i]);
			panForm.add(textField[i]);
		}
		
		this.setButtons("valider");
		this.setButtons("annuler");
		//regle la position des buttons et leur taille
		buttons.get("valider").setBounds(100, 350, 180, 46);
		buttons.get("annuler").setBounds(842 - 100 - 180 , 350, 180, 46);
		this.add(buttons.get("valider"));
		this.add(buttons.get("annuler"));
//		sprgLayout.putConstraint(SpringLayout.WEST, panForm, 50,SpringLayout.WEST, this);
		
		panForm.setBounds(new Rectangle(250,50,350,250));
		
		img.setBounds(100,100, 150,150);
		this.add(img);
		
		this.add(panForm);
	}
	public void paintComponent(Graphics g) {
		g.setColor(Color.white);
		g.fillRect(0, 0, sizeArea.width, sizeArea.height);
		try {
			g.drawImage(ImageIO.read(new File("image/background.png")), 0, 0, this);
		}catch(IOException e) {
			e.printStackTrace();
		}
	}
	public void setButtons(String name) {
		this.buttons.put(name, new Button(name, this.sizeArea.getSize()));
	}
}
