package game.menu;

import java.awt.Graphics;
import java.awt.Image;
import java.io.File;
import java.io.IOException;
import java.util.Hashtable;
import javax.imageio.ImageIO;
import javax.swing.JPanel;

public class Menu<T extends JPanel> {
	private Hashtable<String, Button> buttons = new Hashtable<String, Button>();
	private String imgBackground = "image/menu/1x/Menu.png";
	private T area;
	private Graphics graphics;
	public Menu(T pArea, Graphics g) {
		this.area = pArea;
		this.graphics = g;
		Image background = null;
		try {
			background = ImageIO.read(new File(this.imgBackground));
		} catch (IOException e) {
			e.printStackTrace();
		}
		g.drawImage(background, 0, 0, this.area);
		this.setButtons("newPlayeur");
		this.setButtons("continue");
		
		buttons.get("newPlayeur").setBounds(100, 350, 180, 46);
		buttons.get("continue").setBounds(842 - 100 - 180 , 350, 180, 46);
		
		this.area.add(buttons.get("newPlayeur"));
		this.area.add(buttons.get("continue"));
		
	}
	public Hashtable<String, Button> getButtons() {
		return buttons;
	}
	public void setButtons(String name) {
		this.buttons.put(name, new Button(name, this.area.getSize()));
	}
}
