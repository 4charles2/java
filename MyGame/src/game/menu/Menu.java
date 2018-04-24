package game.menu;

import java.awt.Graphics;
import java.awt.Image;
import java.io.File;
import java.io.IOException;
import java.util.Hashtable;

import javax.imageio.ImageIO;

import game.show.AreaGame;

public class Menu extends AreaGame{
	private Hashtable<String, Button> buttons = new Hashtable<String, Button>();
	public Menu() {
		this.setButtons("newPlayeur");
		this.setButtons("continue");
//		buttons.get("newPlayeur").addMouseListener(this);
//		buttons.get("continue").addMouseListener(this);
		//180 46 Taille originale de l'image sans la marge du JButton
		buttons.get("newPlayeur").setBounds(100, 350, 180, 46);
		buttons.get("continue").setBounds(842 - 100 - 180 , 350, 180, 46);
		
		this.add(buttons.get("newPlayeur"));
		this.add(buttons.get("continue"));
		
	}
	public void paintComponent(Graphics g) {
		Image background = null;
		try {
			background = ImageIO.read(new File("image/1x/Menu.png"));
		} catch (IOException e) {
			e.printStackTrace();
		}
		g.drawImage(background, 0, 0, this);
	}
	public Hashtable<String, Button> getButtons() {
		return buttons;
	}
	public void setButtons(String name) {
		this.buttons.put(name, new Button(name, this.sizeArea));
	}
}
