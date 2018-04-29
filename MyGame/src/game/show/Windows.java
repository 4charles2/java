package game.show;

import javax.swing.JFrame;


public class Windows extends JFrame{
	private AreaGame areaGame = new AreaGame();

	public Windows(){ 
		super("Walbreaker");

		this.setLocationRelativeTo(null);
		this.setAlwaysOnTop(true);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setResizable(false);
		this.setContentPane(areaGame);
		this.setVisible(true);
		pack();
		
	}
	
}