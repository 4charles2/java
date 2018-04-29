package game.menu;

import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.geom.RoundRectangle2D;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.JButton;

public class Button extends JButton{
	private String pictureFile;
	private Image picture = null;
	private int posX, posY;
	public Button(String nameFile, Dimension sizeAreaGame) {		
		this.setPosX(0);
		this.setPosY(0);
		this.setName(nameFile);
		this.setPreferredSize(new Dimension(210,150));
		this.setNameFile(nameFile);
		this.setContentAreaFilled(false);
	}
	public void paintComponent(Graphics g) {
		Graphics2D g2d = (Graphics2D)g;
		
		try {
			picture = ImageIO.read(new File(this.getNameFile()));
		} catch (IOException e) {
			e.printStackTrace();
		}
		RoundRectangle2D.Float r2d = new RoundRectangle2D.Float(0, 0, 179.9f, 45.9f, 22, 22);
		g2d.clip(r2d);
		g2d.drawImage(picture, this.posX, this.posY, this.getWidth(), this.getHeight(), this);
	}
	public int getPosX() {
		return posX;
	}

	private void setPosX(int posX) {
		this.posX = posX;
	}

	public int getPosY() {
		return posY;
	}

	private void setPosY(int posY) {
		this.posY = posY;
	}
	private String getNameFile() {
		return "image/buttons/1x/"+this.pictureFile+".png";
	}
	private void setNameFile(String nameFile) {
		this.pictureFile = nameFile;
	}
}
