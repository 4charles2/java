package game.playeur;

import java.awt.Dimension;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import game.menu.Button;

public class Playeur {
	 private String labelText[] = {"Nom", "Prenom", "Pseudo"};
	 public JPanel pan = new JPanel();
	 private String img = "image\\joueur\\1x\\joueur.png";
	public Playeur() {
		try {
			pan.add(new JLabel(new ImageIcon(ImageIO.read(new File(this.img)))));
		} catch (IOException e) {
			e.printStackTrace();
		}
		for(int i = 0; i < labelText.length; i++) {
			pan.add(new JLabel(labelText[i]));
			pan.add(new JTextField());
		}
		pan.add(new Button("valider", new Dimension(180,46)));
		pan.add(new Button("annuler", new Dimension(180, 46)));
	}
	public JPanel getpan() {
		return this.pan;
	}
}
