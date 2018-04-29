package game.element;

import java.awt.Graphics;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import game.show.AreaGame;

public class Ball {
	public Ball(AreaGame surface, Graphics g) {
		try {
			g.drawImage(ImageIO.read(new File("image/1x/Ball.png")), 150, 150, surface);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
