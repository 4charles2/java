package game.show;

import javax.swing.JFrame;

import game.menu.Menu;


public class Windows extends JFrame{
	private AreaGame areaGame = new AreaGame();

	public Windows(){ 
		super("Walbreaker");

		this.setLocationRelativeTo(null);
		this.setAlwaysOnTop(true);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setResizable(false);
		Menu menu = new Menu();
		this.setContentPane(menu);
		this.setVisible(true);
		pack();

	}
}